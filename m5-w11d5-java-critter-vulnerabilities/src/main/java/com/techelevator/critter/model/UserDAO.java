package com.techelevator.critter.model;

public interface UserDAO {

	public void saveUser(String userName, String password, String saltedHash);
	
	public void saveUser(String userName, String password);
	
	public boolean searchForUsernameAndPassword(String userName, String password);

	public boolean searchForUsernameAndSalt(String userName, String password);
	
	public void updatePassword(String userName, String password);

}
