package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class InterLeaveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//interleaveLists([1, 2, 5, 8], [4, 5, 6])
		List<Integer> listOne = new ArrayList<>();
		listOne.add(1);
		listOne.add(2);
		listOne.add(5);
		listOne.add(8);
		
		List<Integer> listTwo = new ArrayList<>();
		listTwo.add(4);
		listTwo.add(5);
		listTwo.add(6);

		
			List<Integer> interList = new ArrayList<>();
			int minCt = 0;
			int oneCt = 0;
			int twoCt = 0;
			
			if(listOne.size() > listTwo.size()) {
				minCt = listTwo.size();
			}else {
				minCt = listOne.size();
			}
			
			interList.add(listOne.get(0));
			listOne.remove(0);
			interList.add(listTwo.get(0));
			listTwo.remove(0);
			
			
			for(int i = 2; i <= minCt; i++) {
					interList.add(listOne.get(0));
					listOne.remove(0);
					interList.add(listTwo.get(0));
					listTwo.remove(0);
			}
			
			if(listOne.size() > listTwo.size()) {
				interList.addAll(listOne);
			}else {
				interList.addAll(listTwo);
			}
		
	} 

}
