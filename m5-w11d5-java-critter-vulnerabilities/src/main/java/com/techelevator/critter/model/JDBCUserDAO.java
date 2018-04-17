package com.techelevator.critter.model;

import java.io.UnsupportedEncodingException;

import javax.sql.DataSource;

import org.bouncycastle.util.encoders.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.InvalidResultSetAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.security.PasswordHasher;

@Component
public class JDBCUserDAO implements UserDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JDBCUserDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void saveUser(String userName, String password) {
		// jdbcTemplate.update("INSERT INTO app_user(user_name, password) VALUES ('"+userName+"', '"+password+"')");
		//Commented out original, now inserting the password as shown below
		
		//password now referring to the salted_hash
		jdbcTemplate.update("INSERT INTO app_user(user_name, password) VALUES ('"+userName+"', '"+password+"')");

	}
	
	//userDAO.saveUser(userName, hash, saltString);

	@Override
	public void saveUser(String userName, String saltedHash, String salt) {
		// jdbcTemplate.update("INSERT INTO app_user(user_name, password) VALUES ('"+userName+"', '"+password+"')");
		//Commented out original, now inserting the password as shown below
		
		//password now referring to the salted_hash
		jdbcTemplate.update("INSERT INTO app_user(user_name, salted_hash, salt) VALUES ('"+userName+"', '"+saltedHash+"','"+salt+"' )");

	}

	@Override
	public boolean searchForUsernameAndPassword(String userName, String password) {
		String sqlSearchForUser = "SELECT * "+
							      "FROM app_user "+
							      "WHERE UPPER(user_name) = '"+userName.toUpperCase()+"' "+
							      "AND password = '"+password+"'";
		
		return jdbcTemplate.queryForRowSet(sqlSearchForUser).next();
	}
	
	//below added as part of salted hash hw, need to parameterize query strings for security
	@Override
	public boolean searchForUsernameAndSalt(String userName, String passwordUserEntered) {
		PasswordHasher ph = new PasswordHasher();		
		String sqlSearchForHash = "SELECT * "+
							      "FROM app_user "+
							      "WHERE UPPER(user_name) = ?";
		
									// Remove the password from the search, since it is no longer stored in the
									// the database in clear text
//							      "WHERE UPPER(user_name) = '"+userName.toUpperCase()+"' "+
//							      "AND password = '"+password+"'";
		
		SqlRowSet results =  jdbcTemplate.queryForRowSet(sqlSearchForHash, userName.toUpperCase());
		if(results.equals(null)) {
			return false;
		}
		results.next();

		// Get the Password from the Database, however, the password is now the HASH created and saved on signup
		String actualHash = results.getString("salted_hash");
		
		// Retrieve the Base64 encoded Salt From the Database, and decode into a byte[]
		byte[] retrievedSaltFromDatabase = Base64.decode(results.getString("salt"));

		// caclulate a hash from the STORED salt and the USER ENTERED password
		String calculatedHash = ph.computeHash(passwordUserEntered, retrievedSaltFromDatabase);
		
		// Compare the hash calculated using the user entered password with the HASH stored in the database that was calculated on signup
		return (calculatedHash.equals(actualHash));
	}
	
	

	@Override
	public void updatePassword(String userName, String password) {
		jdbcTemplate.update("UPDATE app_user SET password = '"+password+"' WHERE user_name = '"+userName+"'");
	}

}
