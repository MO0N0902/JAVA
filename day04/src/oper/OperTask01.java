package oper;

import java.util.Scanner;

public class OperTask01 {
	public static void main(String[] args) {
	//1. 사용자로부터 두개의 숫자를 입력받아 두 숫자의 합과 곱을 각각 출력하기
		//변수 만들기
		int num1 = 0;
		int num2 = 0;
		
		// 입력클래스 import
		Scanner sc = new Scanner(System.in);
		
		// 입력문
		System.out.println("두개의 숫자를 입력하세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int result1 = num1 + num2;
		int result2 = num1 * num2;
		//출력문
		System.out.printf("두 숫자의 합은 %d 이며 곱은 %d 이다.\n", result1, result2 );
		
		
		
		
	//2. 1번에서 임력받은 두개의 숫자를 사용하여 평균을 개산하고 소수점 두자리수까지 출력하기
		//변수 지정하기
		double result3 = (num1 + num2) /2.0;
		//출력문
		//System.out.println(result3);
		System.out.printf("두 수의 평균은 %.2f 이다\n",result3);
		
	//3. 두자리수 정수를 입력받고 심의자리와 일의자리를 출력하기
		
		//입출력 결과
			//두자리 수 정수를 입력하세요
			//십의자리는00 입니다, 일의자리는 00입니다.
		
		//변수지정
		int num5 = 0;
		// 입력문
		System.out.println("두자리수 정수를 입력해주세요");
		num5 = sc.nextInt();
		//십의자리 출력하는문장
		int result5 = num5 /10; 
		//일의자리 출력하는
		int result6 = num5 %10;
		System.out.printf("입력하신 숫자의 십의자리 숫자는 %d 이고, 일의자리 숫자는 %d 입니다\n",result5,result6);
		
		
	//4. 코인노래방 프로그램 만들기, 사용자에게 금액을 입력받고 부를 수 있는 곡수와 잔돈 출력하기
		// 한곡의 가격은 400원 입니다
		
		// 변수생성
	final int coinprice = 400;
		int insertcoin = 0;
		//입력 메소드
		System.out.println("투입하실 금액을 입력하세요 : ");
		insertcoin = sc.nextInt();
		int coin = insertcoin / coinprice;
		int change = insertcoin % coinprice;
		//출력메소드
		System.out.printf("총 %d곡과 거스름돈 %d원 입니다.",coin, change);
		
		
		
		
}
}
