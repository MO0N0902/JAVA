package staticTest;

//2. 정적메소드
public class StaticTest01 {
	public static void main(String[] ags) {
		staticMethod();
		StaticTest01 st = new StaticTest01();
		StaticTest01.staticMethod();// 정적메소드를 호출할 때는 클래스명.메소드명으로 호출
		staticMethod();// 같은클래스에 있는 static메소드는 메소드명만으로도 호출가능

		st.instanceMethod1();// 인스턴스 메소드 호출

		st.staticMethod(); // 정적메소드를 호출하지만 권장하지 않음

	}

//인스턴스 메소드1
	void instanceMethod1() {
		System.out.println("인스턴스메소드1 실행");
		instanceMethod2(); // 인스턴스메소드2 호출
		staticMethod();
	}

// 인스터스 메소드2
	void instanceMethod2() {
		System.out.println("인스턴스 메소드 2 실행");
	}

//정적 메소드
	static void staticMethod() {
		System.out.println("정적메소드 실행");
		// 정적메소드는 메모리에 먼저 올라가 있기 때문에 객체가 필요함
		// 인스턴스 메소드 호출 못함
	}

}
