package com.dio.base;

public class Main {

	public static void main(String[] args) {
		
		int a = 1000;
		byte b = (byte)a;
		System.out.println(b); //??
	
		double c = 21.564;
		int d = (int) c;
		System.out.println(d);
		
		/***String e = "S";
		char f = (char) e;
		System.out.println(f);*/ //can't cast from string to char
		
		long g = 83748457L;
		short h = (short) g;
		System.out.println(h); //??
	}

}
