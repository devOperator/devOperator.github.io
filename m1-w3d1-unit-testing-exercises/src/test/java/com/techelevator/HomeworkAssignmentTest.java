package com.techelevator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HomeworkAssignmentTest {
	
	/*
	 * 
	 * Check that grade is calculated properly
	 * Check that possible marks is always positive
	 * Check that submitter's name is set properly
	 * 
	 * */
	
	 private int totalMarks;
	 private int possibleMarks;
	 private HomeworkAssignment hw;
	 
	 /*
	 @Before
	 public void setup() {
		 possibleMarks = 100;
		 hw = new HomeworkAssignment(possibleMarks);
	 } */
	
	 @Test
	 public void check_to_see_if_correct_grade_is_returned() {
		 //Arrange
		 possibleMarks = 100;
		 hw = new HomeworkAssignment(possibleMarks);
		 //Act
		 hw.setTotalMarks(85);
		 //Assert
		 Assert.assertEquals("The grade was not calculated correctly", "B", hw.getLetterGrade());
	 }
	 
	 @Test
	 public void try_to_set_possible_marks_to_a_negative_number() {
		 //Arrange
		 possibleMarks = 100;
		 hw = new HomeworkAssignment(possibleMarks);
		 //Act
		 hw.setTotalMarks(-115);
		 //Assert
		 Assert.assertTrue("Negative total marks should not be possible", hw.getTotalMarks() > 0);
	 }
	 
	 @Test
	 public void try_to_calculat_grade_with_out_total_marks() {
		 //Arrange
		 possibleMarks = 100;
		 hw = new HomeworkAssignment(possibleMarks);
		 //Act
		 //Assert
		 Assert.assertEquals("Grade should be unknown if total marks is not known", "unknown", hw.getLetterGrade());
	 }
	 
	 @Test
	 public void check_that_the_submitters_name_is_set_correctly() {
		 //Arrange
		 possibleMarks = 100;
		 hw = new HomeworkAssignment(possibleMarks);
		 //Act
		 hw.setSubmitterName("France");
		 //Assert
		 Assert.assertEquals("Submitter's name is not set properly", "France", hw.getSubmitterName());
	 }
	 
	 @Test
	 public void check_if_grade_returned_properply_when_total_marks_set_to_0() {
		 //Arrange
		 possibleMarks = 100;
		 hw = new HomeworkAssignment(possibleMarks);
		 //Act
		 hw.setTotalMarks(0);
		 //Assert
		 Assert.assertEquals("Grade was not calculated properly", "F", hw.getLetterGrade());
	 }
	 
	 @Test
	 public void check_if_possible_marks_is_set_properly() {
		 //Arrange
		 //Act
		 possibleMarks = 10;
		 hw = new HomeworkAssignment(possibleMarks);
		 //Assert
		 Assert.assertEquals("Possible marks was not set properly", 10, hw.getPossibleMarks());
	 }
	 
	 @Test
	 public void check_edge_case_equal_to_70_percent() {
		 //Arrange
		 //Act
		 possibleMarks = 100;
		 hw = new HomeworkAssignment(possibleMarks);
		 hw.setTotalMarks(70);
		 //Assert
		 Assert.assertEquals("Grade was not calculated properly", "C", hw.getLetterGrade());
	 }
	 
	 @Test
	 public void check_edge_case_equal_to_80_percent(){
		 //Arrange
		 //Act
		 possibleMarks = 100;
		 hw = new HomeworkAssignment(possibleMarks);
		 hw.setTotalMarks(80);
		 //Assert
		 Assert.assertEquals("Grade was not calculated properly", "B", hw.getLetterGrade());
	 }
	 
	 @Test
	 public void check_edge_case_equal_to_90_percent() {
		 //Arrange
		 //Act
		 possibleMarks = 100;
		 hw = new HomeworkAssignment(possibleMarks);
		 hw.setTotalMarks(90);
		 //Assert
		 Assert.assertEquals("Grade was not calculated properly", "A", hw.getLetterGrade());
	 }
	 
	 
}
