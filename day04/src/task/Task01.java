package task;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		//스캐너 클래스 임포트
		Scanner sc = new Scanner(System.in);
		
		// 1. 100000원이 넘는 금액을 입력받아 5만원, 1만원, 5천원, 1천원 단위로 나누어 출력하기
		//변수 지정
		int money = 0;
		//입력문
		System.out.print("10만원이 넘는 금액을 입력해 주세요 : ");
		money = sc.nextInt();
		//출력문에 사용할 변수
		int result1 = money/50000; // 입력한 금액을 5만원으로 나눴을때 결과값 287000원일때 5장 남는돈 35000원
		int result2 = (money-(result1*50000))/10000; //(money-(result1*50000))35000원 남기는 계산
		int result3 = ((money-(result1*50000)-(result2*10000)))/5000;
		int result4 = result3%1000;
		//출력문0000000000000000000
		System.out.printf("5만원권 %d장\n1만원권 %d장\n5천원권%d장\n1천원권%d장",result1,result2,result3,result4);
		
		

		// 2. 키와 몸무게를 입력받아 bmi를 계산하기
		// 공식 몸무게 / (키*키)
		System.out.println("키를 입력해주세요");
		int height = sc.nextInt();
		System.out.println("몸무게를 입력해주세요");
		int weight = sc.nextInt();
		int bmi = weight/(height*height);
		
		System.out.println("bmi : " + bmi);
		

		// 3. 밑변과 높이를 입력받아 삼각형의 높이 계산하기
		// 공식 0.5*밑변*높이

		// 4. 두 정수를 입력받아 0보다 큰지 출력하기(true or false로 출력할 것)

		// 5. 사용자에게 물건의 개수와 가격을 입력받아 총액 계산하기
		// 물건의 개수 : 3
		// 물건의 개당 가격 15000원
		// 총액 : 금액원

		// 6. 두자리수 정수를 입력받아 각 자리의 숫자를 더하여 출력하기

		// 7. 정수를 입력받아 양수이면서 짝수인지 확인하여 결과 출력하기

		// 8. 두 숫자를 입력받아 첫번째 입력받은 숫자가 두번째 숫자보다 크거나 같은지 여부를 출력하기
		// true or false
		// 변수 선언
		
		
		// 9. 두 숫자를 입력받아 한 숫자만 양수인지 여부 출력하기
		// true or false

		// 10. 연도를 입력받아 윤년인지 아닌지 출력하기
		//true or false true이면 0000년은 윤년입니다 출력
		//윤년계산 : 연도가 4로 나누어떨어지고 100으로 나누어 떨어지지 않거나 400으로 나누어 떨어져야한다
		int resultYear = 0;
		int Year = 0;
		
		
		
	}
}
