/*
SumDoubleGiventwointvalues,returntheirsum.Unlessthetwovaluesarethesame,thenreturndoubletheirsum.
sumDouble(1, 2) → 3 sumDouble(3, 2) → 5 sumDouble(2, 2) → 8
function sumDouble(x, y) { // do logic here
// return result; return x + y;
}
*/
function sumDouble(x, y) {
    sum = x + y;
    if (x === y) {
        return sum *= 2;
    }
    console.log(sum);
    return sum;
}

function hasTeen(num1, num2, num3){
    if(num1 >= 13 && num1 <= 19
     ||num2 >= 13 && num2 <= 19
     ||num3 >= 13 && num3 <= 19){
        return true;
    }
    return false;
}



// given 
function lastDigit(x, y) {
    var first = x.toString().split('').pop();
    var second = y.toString().split('').pop();
    if (first == second) {
        return true;
    }
    return false;
}

function seeColor(aString){
    if(aString.lastIndexOf("blue") == 0){
        return "blue";
    }else if(aString.lastIndexOf("red") == 0){
        return "red";
    }
    return "";
}

function middleThree(oddString){
    return oddString.substring((oddString.length / 2) - 1, (oddString.length / 2) + 2);
}

function frontAgain(aString){
    return aString.substring(0,2) == aString.substring(aString.length - 2,aString.length);
}

function alarmClock(dayOfTheWeek, onVacation){
    var dayOfTheWeekName = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];

    if(dayOfTheWeek > 0 && dayOfTheWeek < 6){
        if(!onVacation){
            return dayOfTheWeekName[dayOfTheWeek] + " 7:00";
        }else{
            return dayOfTheWeekName[dayOfTheWeek] + " 10:00";
        }
    }else if(!onVacation){
        return dayOfTheWeekName[dayOfTheWeek] + " 10:00";
    }else{
        return dayOfTheWeekName[dayOfTheWeek] + " off";
    }
}

function makeMiddle(intArray){
    var middleArr = [];
    if(intArray.length < 2 || (intArray.length % 2 != 0)){
        return middleArr;
    }else if(intArray.length <= 2){
        return intArray;
    }
    else{
        middleArr.push(intArray[(intArray.length / 2) - 1]);
        middleArr.push(intArray[(intArray.length / 2)]);
        return middleArr;
    }

}

function oddOnly(array){
   var evenArray = [];
   for(var i = 0; i < array.length; i++){
        if(array[i] % 2 != 0){
            evenArray.push(array[i]);
        }
   }
   return evenArray; 
}

function weave(arr1, arr2){
    var weavedArr = [];
    if(arr2.length >= arr1.length){
        for(var i = 0; i < arr2.length; i++){
            if(i < arr1.length){
                weavedArr.push(arr1[i]);
                weavedArr.push(arr2[i]);
            }else{
                weavedArr.push(arr2[i]);
            }
        }
    }else{
        for(var i = 0; i < arr1.length; i++){
            if(i < arr2.length){
                weavedArr.push(arr1[i]);
                weavedArr.push(arr2[i]);
            }else{
                weavedArr.push(arr1[i]);
            }
        }
    }
    return weavedArr;
}

function cigarParty(cigars, isWeekend){
    if(cigars>= 40 && cigars <= 60 || isWeekend && cigars > 60){
        return true;
    }else{
        return false;
    }
}

function stringSplosion(word){
    var wordExploded = "";
    for(var i = 0; i <= word.length;i++){
        wordExploded = wordExploded + word.substring(0, i);
    }
    return wordExploded;
}

function fizzBuzz(num){
    if(num % 3 == 0 && num % 5 == 0){
        return "FizzBuzz";
    }else if(num % 5 == 0){
        return "Buzz";
    }else if(num % 3 == 0){
        return "Fizz";
    }else{
        return num;
    }
}

 function countValues(array){
    var countArr = [];
    var numberArr = [];
    var mapArr = [];
     
    for(var i = 0; i < array.length; i++){
        if(numberArr.find(array[i]) == undefined){ //first time finding
            numberArr.push(array[i]);
            countArr[numberArr]++;
        }else if(numberArr.find(array[i])){
            countArr[numberArr]++;
        }    
    }
    for(var i = 0; i < numberArr.length; i++){
        mapArr.push(numberArr[i] + ': ' + countArr[numberArr]);
    }
    // return mapArr;
    countArr.push(1);
    console.log("THis isn't working");
    return mapArr;
 }

function reverseArray(array){
    var reversedArray = [];
    var arrayLength = array.length;
    for(var i = 0; i < arrayLength; i++){
        reversedArray.push(array.pop()); 
    }
    return reversedArray;
}

function blackJack(x, y){
    if(x >= y && x <= 21){
        return x;
    }else if(y <= 21){
        return y;
    }

    return 0;
}
