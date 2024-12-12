package task;

import java.util.Scanner;

public class FizzBuzz {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("정수를 입력해주세요");
	try {
		int num1 = sc.nextInt();
		if(num1%3==0&& num1%5==0) {
			System.out.println("FizzBuzz");
		}else if(num1%3==0) {
			System.out.println("Buzz");
		}else if(num1%5==0) {
			System.out.println("Fizz");
		}else {
			System.out.println(num1);
		}
	} catch (Exception e) {
		System.out.println("숫자가 아닌 문자열이 입력되었습니다");
		
	}
	
}
}
