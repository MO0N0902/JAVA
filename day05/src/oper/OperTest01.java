package oper;

import java.util.Scanner;

public class OperTest01 {
public static void main(String[] args) {
	//다음 중 음식이 아닌것은?
//	1. 피자
//	2. 케이크
//	3. 불고기
//	4. java
	//삼항 연산자를 사용하여 입력받은 값과 비교하고 정답입니다 or 오답입니다 출력하기
	Scanner sc = new Scanner(System.in);
	String quzmsg = "다음중 음식이 아닌것은?\n"
					+ "1. 피자 \n"
					+ "2. 케이크 \n"
					+ "3. 불고기 \n"
					+ "4. Java \n"
					+ "번호를 입력하세요 : ";
	
	int result = 0;
	final int answer = 4;
	System.out.println(quzmsg);
	result = sc.nextInt();
	System.out.println(answer == result ? "정답" : (result ==1 || result == 2 || result == 3) ? "오답" :"잘못입력했습니다");
	
	
	
					
	
}
}
