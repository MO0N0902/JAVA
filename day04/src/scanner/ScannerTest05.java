package scanner;

import java.util.Scanner;

public class ScannerTest05 {

	public static void main(String[] args) {
		//나이는(nextInt) 이름(nextLine)을 입력받기

		//1. 변수 선언
		//2. 입력클래스 
		//3. 출력메세지
		//4. 변수 nextint
		//5. 출력메세지
		//6. 변수
		//7. 출력
		
		int age = 0;
		String name = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		System.out.println("안녕하세요 제이름은 " + name +"이고 " + "나이는 " + age + "살 입니다");
		
		
		
				
	}

}