package section08;

public class Calc {
	// 예제 8-8
	void sum(int num1, int num2) { // sum이름의 정수형 변수 두개 사용하는 메소드 선언
		System.out.println("두 수의 합은" + (num1 + num2) + "입니다.");// 변수 두개를 더하는 출력문
	}
	public static void main(String[] args) {
		//예제 8-9
		Calc cl = new Calc(); //객체 생성
		cl.sum(5, 3); // sum 메소드 호출및 인수 두개 할당
		cl.sum(10, 7);// sum 메소드 호출및 인수 두개 할당
	}
	
}
