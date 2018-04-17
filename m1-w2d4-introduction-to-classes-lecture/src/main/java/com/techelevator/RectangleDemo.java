package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class RectangleDemo {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10, 20);		
		Rectangle rect2 = new Rectangle(25, 10);		
		
		List<Rectangle> rectangles  = new ArrayList<Rectangle>();
		rectangles.add(rectangle);
		rectangles.add(rect2);
		
	
		System.out.println(rectangles.contains(new Rectangle(25,10)));
		

	}

}
