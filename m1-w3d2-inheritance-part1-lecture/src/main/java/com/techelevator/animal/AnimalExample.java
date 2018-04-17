package com.techelevator.animal;

public class AnimalExample {

	public static void main(String[] args) {
		
		CatAnimal cat = new CatAnimal("Cat");
		TabbyCat tabby = new TabbyCat();
		
		System.out.println("CatAnimal Name: " + cat.getName());
		System.out.println("CatAnimal Legs: " + cat.getNumberOfLegs());
		System.out.println("CatAnimal Speed: " + cat.getWalkSpeed());
		
		System.out.println();
		
		System.out.println("TabbyCat Name: " + tabby.getName());
		System.out.println("TabbyCat Legs: " + tabby.getNumberOfLegs());
		System.out.println("TabbyCat Speed: " + tabby.getWalkSpeed());
	
		System.out.println();
		CatAnimal tCat = tabby;
		System.out.println("tCat Name: " + tCat.getName());
		System.out.println("tCat Legs: " + tCat.getNumberOfLegs());
		System.out.println("tCat Speed: " + tCat.getWalkSpeed());
		
		System.out.println();
		Animal aCat = tCat;
		System.out.println("aCat Name: " + aCat.getName());
		System.out.println("aCat Legs: " + aCat.getNumberOfLegs());
		//System.out.println("aCat Speed: " + aCat.getWalkSpeed());
		
		System.out.println();
		if (aCat instanceof TabbyCat) {
			System.out.println("This Animal is a TabbyCat");
		}
		System.out.println();
		
		TabbyCat tabCat = (TabbyCat)aCat;
		System.out.println("tabCat Name: " + tabCat.getName());
		System.out.println("tabCat Legs: " + tabCat.getNumberOfLegs());
		System.out.println("tabCat Speed: " + tabCat.getWalkSpeed());
	
	}

}
