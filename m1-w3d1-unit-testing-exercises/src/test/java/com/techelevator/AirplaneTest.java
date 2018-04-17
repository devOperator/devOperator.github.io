package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AirplaneTest {
	/*
	 * Book a first class flight
	 * Book a coach flight
	 * Check the available first seats
	 * Check the available coach seats
	 * 
	 * */

	private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats = 0;
    private int totalCoachSeats;
    private int bookedCoachSeats = 0;	
	
    private Airplane ap;
    
    @Before
    public void setup() {
    	ap = new Airplane(10,10);
    }
    
    @Test
	public void try_to_book_a_first_class_seat() {
    	//Arrange
    	//Act
    	ap.Reserve(true, 5);
    //Assert
    	Assert.assertEquals("The correct number of seats were not reserve", 5, ap.getAvailableFirstClassSeats());
    }
    
    @Test
	public void try_to_book_a_coach_seat() {
    	//Arrange
    	//Act
    	ap.Reserve(false, 5);
    //Assert
    	Assert.assertEquals("The correct number of seats were not reserve", 5, ap.getAvailableCoachSeats());
    }
    
    @Test
    public void try_to_check_the_total_number_of_coach_seats() {
    	//Arrange
    	//Act
    	//Assert
    	Assert.assertEquals("The total number of coach seats was not returned properly", 10, ap.getTotalCoachSeats());
    }
    
    @Test
    public void try_to_check_the_airplane_number() {
    	//Arrange
    	//Act
    	planeNumber = "DL651";
    	//Assert
    	Assert.assertEquals("The total airplane number was not returned properly", "DL651", ap.getPlaneNumber());
    }
    
    @Test
    public void try_to_check_the_total_number_of_first_class_seats() {
    	//Arrange
    	//Act
    	//Assert
    	Assert.assertEquals("The total number of first class seats was not returned properly", 10, ap.getTotalFirstClassSeats());
    }
    
    @Test
    public void try_to_check_the_number_of_book_first_Class_seats() {
    	//Arrange
    	//Act
    	ap.Reserve(true, 1);
    	//Assert
    	Assert.assertEquals("The correct number of booked flights is not shown", 1, ap.getBookedFirstClassSeats());
    }
    
    @Test
    public void try_to_check_the_number_of_booked_coach_seats() {
    	//Arrange
    	//Act
    	ap.Reserve(false, 1);
    	//Assert
    	Assert.assertEquals("The correct number of booked flights is not shown", 1, ap.getBookedCoachSeats());
    }
    
    @Test
    public void try_to_book_more_coach_seats_than_aavailable() {
    	//Arrange
    	//Act
    	//Assert
    	Assert.assertFalse("Cannot book more seats than available", ap.Reserve(false, 11));
    }
    @Test
    public void try_to_book_more_first_class_seats_than_aavailable() {
    	//Arrange
    	//Act
    	//Assert
    	Assert.assertFalse("Cannot book more seats than available", ap.Reserve(true, 11));
    }
    @Test
    public void try_to_check_the_number_of_available_coach_seats() {
    	//Arrange
    	//Act
    	//Assert
    	Assert.assertEquals("The correct number of seats was not displayed", 10, ap.getAvailableCoachSeats());
    }
    
    @Test
    public void try_to_check_the_number_of_available_first_class_seats() {
    	//Arrange
    	//Act
    	//Assert
    	Assert.assertEquals("The correct number of seats was not displayed", 10, ap.getAvailableFirstClassSeats());
    }
    
    
    
}
