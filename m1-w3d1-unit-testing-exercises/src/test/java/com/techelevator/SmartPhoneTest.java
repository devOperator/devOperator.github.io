package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SmartPhoneTest {
	/*
	 * Check that phone number is set properly
	 * Check that carrier is set properly
	 * Check that Call is made only when it could be be
	 * Try to Answer Call
	 * Try to End Call
	 * Re-charge Battery
	 * Try to overcharge battery
	 * Check Operating System
	 * Check Battery charge after Call
	 * Try to hangup when not on a call
	 * Dial invalid (non 10 digit) phone number
	 * 
	 * */

	private SmartPhone phone;
	private String phoneNumber;
    private String carrier;
    private String operatingSystem;
    private boolean onCall;
    private int batteryCharge = 100;
	
	@Before
	public void setup() {
		phone = new SmartPhone("6140000000", "Verizon");
	}
	
	@Test
	public void try_to_check_phone_number() {
		//Arrange
		//Act
		//Assert
		Assert.assertEquals("The correct phone was not set propertly", "6140000000", phone.getPhoneNumber());
		
	}
	
	@Test
	public void try_to_check_phone_carrier() {
		//Arrange
		//Act
		//Assert
		Assert.assertEquals("The correct phone was not set propertly", "Verizon", phone.getCarrier());
		
	}
	
	@Test
	public void try_to_place_a_call_when_not_able_to() {
		//Arrange
		//Act
		//Assert
		Assert.assertFalse("This call is not able to be placed", phone.Call("6142190000", 101) );
	}
	

	@Test
	public void try_to_answer_call() {
		//Arrange
		onCall = false;
		//Act
		phone.AnswerPhone();
		//Assert
		Assert.assertTrue("This call should be able to be answered", phone.isOnCall() );
	}
	@Test
	public void try_to_end_call() {
		//Arrange
		onCall = true;
		//Act
		phone.HangUp();
		//Assert
		Assert.assertFalse("Call did not end when expected", phone.isOnCall());
	}
	
	@Test
	public void try_to_recharge_battery() {
		//Arrange
		batteryCharge = 90;
		//Act
		phone.RechargeBattery();
		//Assert
		Assert.assertEquals("The phone battery should be recharged back to 100",100, phone.getBatteryCharge());
	}
	
	@Test
	public void try_to_over_charge_battery() {
		//Arrange
		batteryCharge = 90;
		//Act
		phone.RechargeBattery();
		//Assert
		Assert.assertFalse("The phone battery should not be charged more than 100",phone.getBatteryCharge() > 100);
	}
	
	@Test
	public void try_to_set_operating_system() {
		//Arrange
		//Act
		phone.setOperatingSystem("Marshmellow");
		//Assert
		Assert.assertFalse("TThe operating system was not set",phone.getOperatingSystem() == null);
	}
	
	@Test
	public void try_to_check_operating_system() {
		//Arrange
		phone.setOperatingSystem("Marshmellow");
		//Act
		//Assert
		Assert.assertEquals("TThe phone did not display the correct OS ", "Marshmellow", phone.getOperatingSystem());
	}
	
	@Test
	public void check_battery_charge_after_a_phone_call() {
		//Arrange
		batteryCharge = 100;
		//Act
		phone.Call("6142190000", 50);
		//Assert
		Assert.assertEquals("The battery did not discharge as expected", 50, phone.getBatteryCharge());
	}
	
	@Test
	public void try_to_hang_up_when_not_on_a_call() {
		//Arrange
		onCall = false;
		//Act
		//Assert
		Assert.assertFalse("Phone on call state should be false", phone.isOnCall());
		
	}
	
	@Test
	public void try_to_dial_7_digit_number() {
		//Arrange
		//Act
		phone.Call("1234567", 10);
		//Assert
		Assert.assertFalse("Call should not be made with invalid number", phone.isOnCall());
	}
	/*
	@Test
	public void try_to_check_the_battery_charge(){
		//Arrange
		//Act
		//Assert
	} */
	
	
	
	

	
	
}
