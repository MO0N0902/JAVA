package methodTest;

public class MethodTest02 {
	
public static void main(String[] args) {
	MethodTest02 mt = new MethodTest02();
	mt.add(10, 20);
}
//메소드 호출방법 2가지
//1) 메소드 정의하는 부분에서 static키워드를 붙인다(static 키워드 배우기 전까지 사용하지 않음)
//2) 메인 메소드에 add메소드가 있는 클래스를 알려준다

void add(int num1, int num2) {
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num1 + num2);
	//2개의 값을 더하는 기능의 메소드 add
	// 리턴타입 => void
	// 메소드명 => add
	// 메게변수 => int num1, int num2
	//실행할 문장 => num1출력, num2출력, num1+num2출력
	
}

}


