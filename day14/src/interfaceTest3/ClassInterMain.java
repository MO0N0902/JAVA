package interfaceTest3;

public class ClassInterMain extends Class1 implements Inter{
//	The inherited method Class1.printText() 
//	cannot hide the public abstract method in Inter
	// 인터페이스의 메소드와 클래스 메소드 간의 충돌발생
	// 인터페이스의 메소드가 abstract인 경우 클래스에서 숨기거나 무시할수 없다
	
	// Class1과 Inter1 양쪽에 동일한 메소드가 존재하지만
	// 오류가 발생하지 않는 이유는 구현하는 인터페이스보다 상속받는 부모클래스가
	// 우선순위이기 때문이다.
	
}
