package scanner;

import java.util.Scanner;

public class ScannerTest02 {

	public static void main(String[] args) {
		//1. 입력 클래스 변수 만들기
		//Scanner sc = new Scanner(System.in);
		// 2. 출력메세지
		//System.out.println("지금 배우고있는 프로그래밍 언어는?");
		//3. 입력메소드
		//String subject = sc.next();
		//4. 변수 출력
		//System.out.println(subject);
		
		// 실습 
		// 이름을 입력하세요 : 000
		// 000 님 안녕하세요;
		// printf 사용하기
		
		//1. 입력 클래스 변수 만들기
		Scanner sc = new Scanner(System.in);
		//2. 출력메세지
		System.out.print("이름을 입력하세요 : ");
		//3. 입력메소드
		String name = sc.next();
		System.out.printf("%s님 안녕하세요\n 오늘날씨는 어떤가요?",name);
		//4. 변수출력
	}
}
