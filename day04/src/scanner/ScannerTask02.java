package scanner;

import java.util.Scanner;

public class ScannerTask02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//1. 사용자로부터 세개의 숫자를 입력받아 합을 출력하는 프로그램
	//2. 세개의 숫자를 각각 입력받기
	//3. 세숫자의 합을 계산하여 출력
	//4. 세 숫자의 합은 00 입니다 형식으로 출력하기
	//변수 만들어주기
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;
	//출력문 작성
	System.out.println("합을 구할 세가지 숫자를 입력해 주세요");
	// 입력문 작성
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	num3 = sc.nextInt();
	//마지막 출력문
	System.out.println("세 수의 합은 " +(num1 + num2 + num3) + " 입니다.");
	
	
	
	//1. 사용자로부터 일어난 시간 아침, 점심, 저녁에 할일과 잠들 시간을 입력받아 출력하기
	//2. 일어난시간과 아침, 점심 저녁 할일과 잠들 시간을 각각 입력받기
	//3. 순서대로 입력받고 출력할 것
	//4. 출력 형식
	// 오늘 일어난 시간은 00시이고 잠들 시간은 00시 입니다
	// 아침 : 00하기
	// 점심 : 00하기
	// 저녁 : 00하기
	
	//변수만들기
	String WT = "";
	String ST = "";
	String MW = "";
	String AW = "";
	String NW = "";
	// 입력문 만들기
	System.out.println("기상한 시간과 잠들 시간을 순서대로 입력해 주세요");
	WT = sc.next();
	ST = sc.next();
	System.out.println("아침 점심 저녁에 할일을 순서대로 입력해 주세요");
	MW = sc.next();
	AW = sc.next();
	NW = sc.next();
	// 출력문
	System.out.println("오늘 일어난 시간은" + WT +"이고 잠들시간은" + ST +"입니다" );
	System.out.printf("아침 : %s하기 \n점심 : %s하기 \n저녁 : %s하기\n\n",MW, AW, NW);
	
	//1. 물건가격기 10000원이다. 사용자로부터 지불금액을 입력받아 거스름돈을 계산하기
	//2. 출력형식
	// 물건 가격은 10000원 입니다
	// 지불가격을 입력하세요 : 00
	// 거스름돈은 00 입니다.
	
	//변수 지정하기
	int price = 10000;
	int pricePaid = 0;
	// 입력문 작성
	System.out.printf("물건가격은 %d 입니다 \n지불가격을 입력하세요 : ",price);
	pricePaid = sc.nextInt();
	//출력문 작성
	System.out.println("거스름돈은 " + (pricePaid-price) + "원 입니다");
	sc.nextLine();
	
}
}
