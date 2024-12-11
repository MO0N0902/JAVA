package interfaceTest3;

public class Child implements ParentA, ParentB {

	
	
	@Override
	public void greet() {
		// TODO Auto-generated method stub
		ParentA.super.greet();
	}
// 다중 구현 충돌 문제
	// Child 클래스가 두 인터페이스를 모두 사용할 때 어떤 인터페이스에 있는
	//greet를 사용할지 모호성이 발생한다
	//Child 클래스에서 greet 케소드를 반드시 재정의 해줘야 한다
	// ParentA.super.greet();  = ParentA 인터페이스의 메소드 호출
	
	
	
}
