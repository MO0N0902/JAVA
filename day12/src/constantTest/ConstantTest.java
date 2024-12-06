package constantTest;

public class ConstantTest {
	//클래스 내부에서 상수선언
		static final int MAX_LENTH = 100; //클래스 상수 
		// method 영역, 클래스 로드시 초기화, 모든 객체가 공유
		final double PI = 3.14159265359; // 인스턴스 상수
		//heap 영역 , 객체 생성시 초기화
		
		public static void main(String[] args) {
			System.out.println(ConstantTest.MAX_LENTH); // 같은 클래스 내에서는 상수 이름만 써도 되지만 원칙적으로 클래스.상수명이 맞다
			ConstantTest ct = new ConstantTest();//인스턴스 상수를 출력하기 위해서는 객체생성이 필수적
			System.out.println(new ConstantTest().PI); 
			System.out.println(ct.PI);
		
		}
		
}
