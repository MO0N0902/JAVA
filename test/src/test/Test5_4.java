package test;

public class Test5_4 {
	public static void main(String[] args) {
		// 두개의 주사위가 같은값이 나올때 까지 while문을 사용해 반복하고
		// 반복횟수와 주사위 눈의 번호를 출력해 보세요

		// 로직구성
		// num1과 num2 변수생성 : 주사위값
		// while문사용 : 두 값이 다르면 반복
		// num1 = random.math()*6;
		// num2 = random.math()*6; //랜덤한 숫자 출력
		// if문 사용 두수가 다르다면 출력할때마다 cnt ++;
		// 두수가 같다면 syso(num1, num2)
		int num1 = 0;
		int num2 = 1;
		int cnt = 1;
		
		while (num1 != num2) {
			num1 = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) ;
			cnt++;
			System.out.println(num1 + " " + num2);
		}
		System.out.println("반복횟수 : " + cnt + "주사위 눈 : " + num1);

	}

}
