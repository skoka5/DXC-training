package com.dxc.examples;

import java.util.TreeSet;

public class ArrayListDemo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> nums = new TreeSet();
		
		Integer myInt1 = new Integer(5);
		
		nums.add(myInt1);
		nums.add(13);  // Auto-boxing
		nums.add(new Integer(18));
		
		nums.add(10);
		nums.add(8);
		nums.add(10);
		nums.add(13);
		
		System.out.println("using enhanced for loop");
		for(int num : nums) {
			System.out.println(num);
		}
		System.out.println();
		
		int noElements = nums.size();
				
		System.out.println("no elements in the list : "+noElements);
		
//		for(int c = 0 ; c < noElements ; c++) {
//			System.out.println(c +" - "+ nums.get(c));
//		}
		
//		System.out.println("using iterator");
//		
//		Iterator<Integer> it = nums.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		System.out.println();
//		
//		System.out.println("usnig sysout");
//		System.out.println(nums);
		

	}

}
