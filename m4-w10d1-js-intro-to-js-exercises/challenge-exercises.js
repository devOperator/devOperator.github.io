function iqTest(string){
    var splitArr = [];
    if(string.length == 0){
        return 0
    }
    splitArr = array.split(" ");
    var eventCt = 0;
    var oddCt = 0;
    var oddIndex = 0;
    var evenIndex = 0;
    for(var i = 0; i < splitArr.length; i++){
        if(splitArr[i] % 2 == 0){
            evenCt++;
            evenIndex = i;
        }else{
            oddCt++;
            oddIndex = i;
        }
    }
    if(oddCt > evenCt){
        return evenIndex;
    }else{
        return oddIndex;
    }
}

function titleCase(untitledWords, wordExceptions){
    var wordsArr = [];
    var titledWords = "";
    wordsArr = untitledWords.split(" ");

    if (wordExceptions != undefined){
        var wordsExceptionArray = wordExceptions.split(" ");
        for(var i = 0; i <= wordsArr.length; i++){
            if(wordsExceptionArray.find(wordsArr[i]) != undefined){
                if(i == 0){
                    wordsArr[i] = wordsArr[i].substring(0,1).
                    toUpperCase() + wordsArr[i].substring(1,wordsArr.length).toLowerCase();
                }else{
                    wordsArr[i] = wordsArr[i].toLowerCase();
                }
                titledWords += wordsArr[i];
            }else{
                wordsArr[i] = wordsArr[i].substring(0,1).
                toUpperCase() + wordsArr[i].substring(1,wordsArr.length).toLowerCase();
                if(i == wordsArr.length){
                    titledWords +=  wordsArr[i];
                }else{
                    titledWords +=  wordsArr[i] + " ";
                }
            }
        }
    }else{
       
        for(var i = 0; i <= wordsArr.length; i++){
            wordsArr[i] = wordsArr[i].substring(0,1).
            toUpperCase() + wordsArr[i].substring(1,wordsArr.length).toLowerCase();
            if(i == wordsArr.length){
                titledWords +=  wordsArr[i];
            }else{
                titledWords +=  wordsArr[i] + " ";
            }
        }
    }
    return titledWords;
}

function perfectSquare(square){

    if(Math.sqrt(square) % 1 > 0){
        return -1;
    }
    return ((Math.sqrt(square) + 1)*(Math.sqrt(square) + 1));    
}