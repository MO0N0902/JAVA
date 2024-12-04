package homeWork;

import java.util.Scanner;

public class JavaYo {

	public static void main(String[] args) {
//	1번 문제 
//	사용자에게 0~9까지의 정수 10개를 입력을 받고
//	이 때 잘못된 정수를 입력하면 다시 입력을 받고
//	사용자가 입력한 10개의 정수의 합을 구하시오
//
		Scanner sc = new Scanner(System.in); // 스캐너 클래스 import
		int num = 0, sum = 0, cnt = 0; // 입력받을 변수, 합을구할 변수, 횟수를 저장할 변수를 지정

		for (int i = 0; i <= 9; i++) { // for문을 활용해서 10번동안 정수를 입력하도록 설정
			System.out.println((i + 1) + "번째 정수를 입력하세요 : "); // 몇번째 정수인지 i+1로 설정하여 확인
			num = sc.nextInt();// 입력한 숫자를 num에 저장
			while (num > 10) {
				if (num >= 10) { // 입력한 정수가 10을 넘는다면 잘못된 값 이라는 문장 출력하고 break
					System.out.println("잘못된 값입니다 다시 입력해주세요");
					break;
				} // 그게 아니라면 입력한 정수를 sum에 더하기
				sum += num;
				if (i == 9) { // 10번 입력한뒤 sum을 출력
					System.out.println("입력하신 값의 합은" + sum + "입니다.");
				}
			}
		}
//	2번 문제
//	사용자에게 행과 열의 수를 입력받아 그에 맞게 한칸당 []를 출력해 행과 열을 표시한다
//	그리고 사용자에게 입력 받은 행 과 열의 곱을 제일 맨 마지막 []안에 기입해준다
//
//	3번 문제 
//	사용자에게 각 국어, 수학, 역사의 점수를 입력받는다
//	입력받은 3개의 과목의 총합점수와 소수점 2번째 자리 까지 평균을 구해라
	}
}
