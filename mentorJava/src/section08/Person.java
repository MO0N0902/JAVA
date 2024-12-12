package section08;

public class Person {
	//예제 8-10
	void introduce(String name, int age) { // 문자열 매개변수 하나와 정수형 매개변수 하나를 사용하는 메소드 생
		System.out.println("제 이름은" + name + "이고, 나이는" + age + "입니다.");// 메소드 호출했을때 실행문
	}

	void hello() {// 리턴값과 매개변수 없는 메소드 생성
		System.out.println("안녕하세요");
	}
	//예제 8-11
	public static void main(String[] args) {
		Person ps = new Person(); //객체 생성
		ps.introduce("문준혁", 28); //문자열 인수와 정수형 인수를 넣어 메소드 호출
		ps.hello();
	
		
		
	}

}
