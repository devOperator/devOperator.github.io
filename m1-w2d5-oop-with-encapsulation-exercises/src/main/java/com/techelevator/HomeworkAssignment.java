package com.techelevator;

public class HomeworkAssignment {

	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;
	
	
	public int getTotalMarks() {
		return totalMarks;
	}


	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}


	public int getPossibleMarks() {
		return possibleMarks;
	}


	public String getSubmitterName() {
		return submitterName;
	}


	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}
/*
	public static void main (String[] args) {
		HomeworkAssignment ha = new HomeworkAssignment(100);
		ha.setTotalMarks(80);
		System.out.println(ha.getLetterGrade());
	} */
	
	public String getLetterGrade() {
		double grade = (double) this.totalMarks / (double) this.possibleMarks;
		if( grade >= .90) {
			this.letterGrade = "A";
		}else if(grade >= .80) {
			this.letterGrade = "B";
		}else if(grade >= .70) {
			this.letterGrade = "C";
		}else if(grade >= .60) {
			this.letterGrade = "D";
		}else {
			this.letterGrade = "F";
		}
		return letterGrade;
	}

	/*
	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	} */


	public HomeworkAssignment(int possibleMarks) {
		super();
		this.possibleMarks = possibleMarks;
	}

/*
	public HomeworkAssignment(int possibleMarks) {
		
	} */
}
