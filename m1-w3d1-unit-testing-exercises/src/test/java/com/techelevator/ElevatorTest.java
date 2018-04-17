package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElevatorTest {
	/*
	 * 
	 * Open Door
	 * Close Door
	 * Go Up One Floor
	 * Go to Top Floor
	 * Go down one floor
	 * Go to bottom floor
	 * Check number of floors
	 * Check Current Floor
	 * Check Shaft Number
	 * Check if moving
	 * 
	 * */
	
	private int shaftNumber;
    private int currentLevel;
    private int numberOfLevels;
    private boolean doorOpen = true;
    private boolean moving;
	
	private Elevator elev;
	
	@Before
	public void setup() {
		elev = new Elevator(1, 5);
	}
	@Test
	public void try_to_open_door() {
		//Arrange
		doorOpen = false;
		//Act
		elev.OpenDoor();
		//Assert
		Assert.assertTrue("Door did not open as expected", elev.isDoorOpen());
		
	}
	@Test
	public void try_to_close_door() {
		//Arrange
		doorOpen = true;
		//Act
		elev.CloseDoor();
		//Assert
		Assert.assertFalse("Door did not close as expected", elev.isDoorOpen());
		
	}
	@Test
	public void try_to_go_up_one_floor() {
		//Arrange
		doorOpen = false;
		currentLevel = 1;
		//Act
		elev.GoUp(2);
		//Assert
		Assert.assertEquals("Elevator did not go up to the correct floor", 2, elev.getCurrentLevel());
		
	}
	
	@Test
	public void try_to_go_to_top_floor() {
		//Arrange
		doorOpen = false;
		currentLevel = 1;
		//Act
		elev.GoUp(5);
		//Assert
		Assert.assertEquals("Elevator did not go up to the correct floor", 5, elev.getCurrentLevel());
	}
	
	@Test
	public void try_to_go_to_bottom_floor() {
		//Arrange
		doorOpen = false;
		currentLevel = 5;
		//Act
		elev.GoUp(1);
		//Assert
		Assert.assertEquals("Elevator did not go down to the correct floor", 1, elev.getCurrentLevel());
	}
	
	@Test
	public void try_to_go_down_one_floor() {
		//Arrange
		doorOpen = false;
		currentLevel = 2;
		//Act
		elev.GoDown(1);
		//Assert
		Assert.assertEquals("Elevator did not go down to the correct floor", 1, elev.getCurrentLevel());
	}
	
	@Test
	public void try_to_go_up_one_floor_when_the_door_is_open() {
		//Arrange
		doorOpen = true;
		currentLevel = 1;
		//Act
		elev.GoUp(2);
		//Assert
		Assert.assertEquals("Elevator moved while the door was open", 1, elev.getCurrentLevel());
	}
	
	@Test
	public void try_to_go_down_one_floor_when_the_door_is_open() {
		//Arrange
		doorOpen = true;
		currentLevel = 2;
		//Act
		elev.GoUp(1);
		//Assert
		Assert.assertEquals("Elevator moved while the door was open", 2, elev.getCurrentLevel());
	}
	
	@Test
	public void check_the_number_of_levels() {
		//Arrange
		//Act
		//Assert
		Assert.assertEquals("Number of levels was not reported correctly", 5, elev.getNumberOfLevels());
	}
	@Test
	public void check_the_current_shaft_number() {
		//Arrange
		//Act
		//Assert
		Assert.assertEquals("Shaft number was not reported correctly", 1, elev.getShaftNumber());
	}
	@Test
	public void check_if_the_elevator_is_moving() {
		//Arrange
		moving = true;
		//Act
		//Assert
		Assert.assertTrue("The elevator did not report current state of motion correctly", elev.isMoving());
		
	}
	@Test
	public void try_to_open_the_door_while_elevator_is_moving() {
		//Arrange
		moving = true;
		//Act
		elev.OpenDoor();
		//Assert
		Assert.assertFalse("Door opened while the elevator was moving", elev.isDoorOpen());
	}
	@Test
	public void try_to_go_higher_than_the_highest_level() {
		//Arrange
		doorOpen = false;
		//Act
		elev.GoUp(6);
		//Assert
		Assert.assertEquals("Elevator can not go higher than top floor", 1, elev.getCurrentLevel());
	}
	@Test
	public void try_to_go_lower_than_the_lowest_level() {
		//Arrange
		doorOpen = false;
		currentLevel = 5;
		//Act
		elev.GoDown(0);
		//Assert
		Assert.assertEquals("Elevator can not go lower than top floor", 5, elev.getCurrentLevel());
	}
	
	@Test
	public void try_to_go_down_to_a_floor_level_higher_than_current() {
		//Arrange
		doorOpen = false;
		currentLevel = 3;
		//Act
		elev.GoDown(4);
		//Assert
		Assert.assertEquals("Elevator can not go down to reach a higher floor", 3, elev.getCurrentLevel());
	}
	
	@Test
	public void try_to_go_up_to_a_floor_level_lower_than_current() {
		//Arrange
		doorOpen = false;
		currentLevel = 3;
		//Act
		elev.GoUp(2);
		//Assert
		Assert.assertEquals("Elevator can not go up to reach a lower floor", 3, elev.getCurrentLevel());
	}
	@Test
	public void try_to_go_down_second_test() {
		//Arrange
		doorOpen = false;
		currentLevel = 3;
		//Act
		//Assert
		Assert.assertTrue("The elevevator was not able to go down as expected", elev.GoDown(2));
	}
	
	
	
}
