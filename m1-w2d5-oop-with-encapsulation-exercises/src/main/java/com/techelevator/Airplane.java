package com.techelevator;

public class Airplane {
private String planeNumber;
private int bookedFirstClassSeats;
private int availableFirstClassSeats;
private int totalFirstClassSeats;
private int bookedCoachSeats;
private int availableCoachSeats;
private int totalCoachSeats;
public String getPlaneNumber() {
	return planeNumber;
}
public int getBookedFirstClassSeats() {
	return bookedFirstClassSeats;
}
public int getAvailableFirstClassSeats() {
	this.availableFirstClassSeats = this.totalFirstClassSeats - this.bookedFirstClassSeats;
	return (this.availableFirstClassSeats);
}
public int getTotalFirstClassSeats() {
	return totalFirstClassSeats;
}
public int getBookedCoachSeats() {
	return bookedCoachSeats;
}
public int getAvailableCoachSeats() {
	this.availableCoachSeats = this.totalCoachSeats - this.bookedCoachSeats;
	return (this.availableCoachSeats);
}
public int getTotalCoachSeats() {
	return totalCoachSeats;
}
public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
	super();
	this.planeNumber = planeNumber;
	this.totalFirstClassSeats = totalFirstClassSeats;
	this.totalCoachSeats = totalCoachSeats;
}

public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
	if(forFirstClass && (this.totalFirstClassSeats - this.bookedFirstClassSeats) >= totalNumberOfSeats) {
		this.bookedFirstClassSeats += totalNumberOfSeats;
		return true;
	}else if(!forFirstClass && (this.totalCoachSeats - this.bookedCoachSeats) >= totalNumberOfSeats){
		this.bookedCoachSeats += totalNumberOfSeats;
		return true;
	}
	return false;
}

public static void main(String[] args) {
	Airplane ap = new Airplane("234234", 10, 10);
	System.out.println(ap.reserveSeats(true, 5));
} 

}
