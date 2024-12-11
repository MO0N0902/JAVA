package ex01_문준혁;

import java.util.Scanner;

public class InputNumber {
public static void main(String[] args) {
	//삼항연산자사용문제
	// 스캐너클래스 import
	// 입력문 작성
	// 입력받을 변수3개 생성
	// 삼항연산자 이용하여 최대값 최소값 출력
	// 입력받은 수 더해서 3으로 나눈 수를 실수로 형변환하여 
	// printf 이용해서 소수점2자리까지 출력
	Scanner sc = new Scanner(System.in);
	 System.out.println("첫번째 정수를 입력해주세요");
	 int num1 = sc.nextInt();
	 System.out.println("두번째 정수를 입력해주세요");
	 int num2 = sc.nextInt();
	 System.out.println("세번째 정수를 입력해주세요");
	 int num3 = sc.nextInt();
	 int max = (num1>num2)? (num1>num3? num1 : num3) : (num2>num3)? num2:num3; 
	 int min = (num1<num2)? (num1<num3? num1 : num3) : (num2<num3)? num2:num3;
	 System.out.println("최대값 : "  + max + " 최소값 : " + min);
	 int sum = num1 + num2 + num3;
	 double avg = sum/3;
	 System.out.printf("%.2f",avg);
	 
}
}
