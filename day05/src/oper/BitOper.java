package oper;

public class BitOper {
	public static void main(String[] args) {
		System.out.println(10&11);
		System.out.println(10|11);
		System.out.println(10^11);
		System.out.println(~10);
		
		System.out.println("십진수 : " + 10 + " => 이진수 : " + Integer.toBinaryString(10));
		System.out.println("십진수 : " + 10 + " => 이진수 : " + Integer.toBinaryString(11));
		
		
		System.out.println("10 & 11의 십진수 :  " + (10&11));
		System.out.println("10 & 11의 십진수 :  " + Integer.toBinaryString(10&11));
		
		System.out.println("10 | 11의 십진수 :  " + (10|11));
		System.out.println("10 | 11의 십진수 :  " + Integer.toBinaryString(10|11));
		
		
		System.out.println("10 ^ 11의 십진수 :  " + (10^11));
		System.out.println("10 ^ 11의 십진수 :  " + Integer.toBinaryString(10^11));
		
		System.out.println("10 & 11의 십진수 :  " + (10&11));
		System.out.println("10 & 11의 십진수 :  " + Integer.toBinaryString(10&11));
		
		
}
	
}
