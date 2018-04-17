package com.techelevator;

public class Elevator {
private int currentFloor = 1;
private int numberOfFloors;
private boolean doorOpen;
public int getCurrentFloor() {
	return currentFloor;
}
public int getNumberOfFloors() {
	return numberOfFloors;
}
public boolean isDoorOpen() {
	return doorOpen;
}

public Elevator(int totalNumberOffloors){
	super();
	this.numberOfFloors = totalNumberOffloors;
}

public void openDoor() {
	this.doorOpen = true;
}
public void closeDoor() {
	this.doorOpen = false;
	
}
public void goUp(int desiredFloor) {
	if(desiredFloor <= this.numberOfFloors && !doorOpen && desiredFloor > currentFloor) {
		this.currentFloor = desiredFloor;
	}else {
		System.out.println("This floor is not open to public");
	}
	
}
public void goDown(int desiredFloor) {
	if(desiredFloor >= 1 && !doorOpen && desiredFloor < currentFloor) {
		this.currentFloor = desiredFloor;
	}else {
		System.out.println("This floor is not open to public");
	}
}


}
