package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Start Main Section for Vehicle Interface Problem
		List<Vehicle> vehicularList = new ArrayList<Vehicle>();
		Car car = new Car(false);
		Car carWithTrailer = new Car(true);
		Tank tank = new Tank();
		Truck truck = new Truck(6);

		vehicularList.add(car);
		vehicularList.add(carWithTrailer);
		vehicularList.add(tank);
		vehicularList.add(truck);
		
		int distance;
		System.out.println(String.format("%-15s %-20s %s", "Vehicle", "Distance Traveled", "Toll $"));
		System.out.println("-------------------------------------------");
		for(Vehicle v : vehicularList) {
			distance = (int) (Math.random() * 230) + 10;
			v.calculateToll((distance));
			System.out.println(String.format("%-15s %-20d %.2f", v.toString(), distance, v.getToll()));
		}
		//End Main Section for Vehicle Interface Problem
		
		//Start Main Section for Delivery Driver Interface Problem
		
		Scanner in = new Scanner(System.in);
		int weight = 0;
		String weightUnit = "";
		int distanceInMiles = 0;
		

			System.out.println("Please enter the weight of the package? ");
			if(in.hasNextInt()) {
				weight = in.nextInt();
			}else {
				System.out.println("Enter weight of the package (format ###). Quotes will be invalid");
			}	

			System.out.println("(P)ounds or (O)unces?  ");
			if(in.hasNext()){
				weightUnit = in.next().toUpperCase();
			}else{
				System.out.println("Enter weight followed by P to indicated Pounds or O for ounces. Quotes will be invalid");
			}	
			
			System.out.println("What distance will it be traveling to?");
			if(in.hasNextInt()){
				distanceInMiles = in.nextInt();
			}else{
				System.out.println("Must Enter weight followed by P to indicated Pounds or O for ounces. Quotes will be invalid");
			}	
			in.close();
			
			List<DeliveryDriver> dd = new ArrayList<DeliveryDriver>();
			FexEd fe = new FexEd();
			PostalService ps = new PostalService();
			SPU spu = new SPU();
			dd.add(ps);
			dd.add(fe); 
			dd.add(spu);
			
			System.out.println(String.format("%-26s $%s", "Delivery Method", " cost"));
			System.out.println("---------------------------------");
			for(DeliveryDriver drivers: dd) {
				drivers.calculateRate(weightUnit, weight, distanceInMiles);
				//System.out.println(drivers.getClass().toString() + " " );
			}
			System.out.println("PS" + ps.getFirstClassCost());
		
		
		//End Main Section for Delivery Driver Interface Problem
		
		
	} 

}
