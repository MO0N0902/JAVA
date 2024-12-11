package abstractTest1;

public class AbstractTest {
public static void main(String[] args) {
	//일반 클래스 ClassA 객체화 바로 가능
	ClassA a = new ClassA();
	System.out.println(a);
	
	//추상클래스 ClassB는 객체화 불가능 -> 미완성된 클래스
//	ClassB b = new ClassB();
	
	// 추상클래스 ClassB를 상속받은 ClassC는 객체화 가능
	ClassC c = new ClassC();
	System.out.println(c);
	c.method1();
	ClassB b = new ClassC(); // 업캐스팅
	System.out.println(b);
	b.method1(); //오버라이딩된 메소드 호출
	c.printNumber();
	  ((ClassC) b).printNumber();
}
}
