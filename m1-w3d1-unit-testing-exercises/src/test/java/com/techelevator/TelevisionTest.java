package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {
	/*
	 * Check if On
	 * Check if Off
	 * Turn on
	 * Turn off
	 * Raise Vol
	 * Lower Vol
	 * Change Channel
	 * Get current Channel
	 * Get current Vol
	 * 
	 * 
	 * */
	private Television tv;
	//Television tv = new Television();
	
	@Before
	public void setup() {
		tv = new Television();
	}
	
	@Test
	public void turn_tv_on() {
		//Arrange

		//Act
		tv.TurnOn();
		//Assert
		Assert.assertTrue("TV is off", tv.IsOn());

	}
	@Test
	public void turn_tv_off() {
		//Arrange
		tv.TurnOn();
		//Act
		tv.TurnOff();
		//Assert
		Assert.assertFalse("TV is should be off", tv.IsOn());

	}
	
	@Test
	public void turn_tv_off_then_check_the_volume() {
		//Arrange
		tv.TurnOn();
		//Act
		tv.TurnOff();
		tv.TurnOn();
		//Assert
		Assert.assertEquals("TV volume should default to 2", 2, tv.getCurrentVolume());
	}
	@Test
	public void try_to_decrease_the_volume_off() {
		//Arrange
		tv.TurnOn();
		//Act
		tv.LowerVolume();
		//Assert
		Assert.assertTrue("The volume should be at 1", tv.getCurrentVolume() == 1);
		
	}
	
	@Test
	public void try_to_increase_the_volume() {
		//Arrange
		tv.TurnOn();
		//Act
		tv.RaiseVolume();
		//Assert
		Assert.assertTrue("The volume should be at 3", tv.getCurrentVolume() == 3);
		
	}
	
	@Test
	public void try_to_increase_the_volume_when_tv_is_off() {
		//Arrange
		//Act
		tv.RaiseVolume();
		//Assert
		Assert.assertEquals("The volume changed when it should not have", 2, tv.getCurrentVolume());
		
	}
	
	@Test
	public void try_to_increase_the_volume_past_the_upper_limit() {
		//Arrange
		tv.TurnOn();
		tv.RaiseVolume();
		tv.RaiseVolume();
		tv.RaiseVolume();
		tv.RaiseVolume();
		tv.RaiseVolume();
		tv.RaiseVolume();
		tv.RaiseVolume();
		tv.RaiseVolume();
		//Act
		tv.RaiseVolume();
		//Assert
		Assert.assertEquals("The volume should remain at 10", 10, tv.getCurrentVolume());
		
	}
	

	@Test
	public void change_channel_to_10() {
		//Arrange
		tv.TurnOn();
		//Act
		tv.ChangeChannel(10);
		//Assert
		Assert.assertEquals("Channel is not 10",10, tv.getSelectedChannel());
		
	}
	
	@Test
	public void try_to_change_channel_past_18() {
		//Arrange
		tv.TurnOn();
		//Act
		tv.ChangeChannel(20);
		//Assert
		Assert.assertEquals("Channel is not 3", 3, tv.getSelectedChannel());
		
	}
	
	@Test
	public void try_to_change_channel_below_3() {
		//Arrange
		tv.TurnOn();
		//Act
		tv.ChangeChannel(2);
		//Assert
		Assert.assertEquals("Channel is not 3", 3, tv.getSelectedChannel());
		
	}
	
	@Test
	public void try_to_change_channel_when_tv_is_off() {
		//Arrange
		//Act
		tv.ChangeChannel(11);
		//Assert
		Assert.assertEquals("Channel changed when it should not have",3, tv.getSelectedChannel());
		
	}

	
}
