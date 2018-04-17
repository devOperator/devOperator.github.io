# Unit Testing Exercises

Using the completed solutions from the class design homework assignment, you'll be writing unit tests to verify all of the functionality is working.
The classes have been documented so that the expected outcomes and requirements should be well known.

It will be up to you to write unit tests against each class to determine if actual outcomes match the expected outomces.

The classes below should be tested.


## Homework Assignment

Things to look/test for

* does the correct letter grade get returned?
No, the correct letter grade is not returned, the logic is not in the correct order
* what happens when an incorrect value is given for total marks?
The negative value for total marks is accepted as a valid value.


## Fruit Tree

Things to look/test for

* is the correct result returned when the `PickFruit` method is called?
Yes, the correct result is returned until more fruit is picked than exist.
* is it possible to pick more fruit than exists on the fruit tree?
Yes, it is possible to pick more fruit than available.


## Employee

Things to look/test for

* is the annual salary correct after receiving a raise?
Yes, annual salary calculated as expected.
* is it possible to give a non-negative raise amount?
It is possible to give an employee both a negative and positive raise amount.


## Airplane

Things to look/test for

* is it possible to overbook seats?
Yes, this is possible.
* is the count for available seats accurate?
The count for atleast the available first class seats is incorrect
* is the count accurate after successfully booking a seat?    
The count is not accurate after booking a flight


## Smart Phone

Things to look/test for

* does the battery return to 100% after recharging?
No, battery does not recharge to 100%.
* are there any methods that change the state of the object when repeatedly called?
HangUp() sets the onCall state to the opposite state instead of setting to false;
* is it possible to spend too much time on a call that there isn't enough battery power remaining?
No, the phone allows calls that go past the remaining battery length.
* what happens if we dial a 7-digit number and not a 10 digit number?
Call is still made.

## Television        
    
Things to look/test for

* are there boundaries on the volume limits?
No, there are no boundaries on the volume.
* does the volume correctly reset when turning the tv on?
No, the volume does not reset as expected.
* are there unexpected side effects when changing the channel, turning it on/off, raising/lowering volume?
Yes, able to decrease and increase the volume when TV is off.     
    
## Elevator

Things to look/test for

* unintended side effects when calling methods
Able to open the door while elevator is moving, able to move elevator outside both upper and lowe
bounds of the available levels. isMoving does not correctly report the state.
* moving between floors when the doors are open
Yes, this is possible.
* going up past the ceiling
Yes, this is possible