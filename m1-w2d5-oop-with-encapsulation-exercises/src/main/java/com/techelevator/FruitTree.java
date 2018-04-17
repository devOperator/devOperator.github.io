package com.techelevator;

public class FruitTree {
private String typeOfFruit;
private int piecesOfFruitLeft;

    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }

    public FruitTree(String typeOfFruit, int startingPiecesOfFruit){
    super();
    this.typeOfFruit = typeOfFruit;
    this.piecesOfFruitLeft = startingPiecesOfFruit;
}

public boolean pickFruit(int numberOfPiecesToRemove){
    if((this.piecesOfFruitLeft - numberOfPiecesToRemove) >= 0){
        this.piecesOfFruitLeft = this.piecesOfFruitLeft - numberOfPiecesToRemove;
        return true;
    }else{
        return false;
    }
}
}
