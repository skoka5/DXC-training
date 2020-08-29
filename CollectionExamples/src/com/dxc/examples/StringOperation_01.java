package com.dxc.examples;

public class StringOperation_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "kishor";
		String firstChar = (""+name.charAt(0)).toUpperCase();
		String result = firstChar+name.substring(1);
		System.out.println(result);

	}

}
