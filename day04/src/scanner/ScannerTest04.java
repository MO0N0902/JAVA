package scanner;

import java.util.Scanner;

//4번 : 입력메소드
public class ScannerTest04 {

	public static void main(String[] args) {
		
		//사용자로부터 주소를 입력받아 출력하기
		//3개의 next 메소드를 사용하여 서울시 강남구 역삼동으로 출력될 수 있도록 할것
		
		//1. 입력 클래스
		Scanner sc = new Scanner(System.in);
		//2. 출력 메세지(1번)
		System.out.print("주소를 입력해 주세요 : ");
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();
		
		System.out.printf("입력한 주소가 %s %s %s 맞습니까?",A, B, C);
		sc.close();
		
		
		
		
		//3. 입력메소드 (next) 3개
		
		
		
	}

}
