package scanner;

import java.util.Scanner;

public class ScannerTask01 {

	public static void main(String[] args) {
		// 두 정수를 입력받고 합을 출력하기
		// next 메소드를 사용한다
		// [입출력 결과]
		// 정수1 입력 : 10
		// 정수2 입력 : 20
		// 두정수의 합은 30입니다

		// 1. 입력클래스 불러오기
		Scanner sc = new Scanner(System.in);

		// 2. 출력메세지 작성 2개
		System.out.print("정수 1 입력 : ");
		String first = sc.next();
		System.out.print("정수 2 입력 : ");
		String second = sc.next();
		int first1 = Integer.parseInt(first);
		int second2 = Integer.parseInt(second);

		System.out.println("두 정수의 합은 " + (first1 + second2) + "입니다");
		//System.out.printf("두 정수의 합은" + (%d + %d) + "입니다", first1, second2);

		// 3. 입력메소드 작성 2개
		// 4. 입력메소드 변수만들기
		// 5. 출력메세지 작성

	}

}
