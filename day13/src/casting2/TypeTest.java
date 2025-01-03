package casting2;

public class TypeTest {
public static void main(String[] args) {
	Parents p = new Parents();
	Child c = new Child();
	
	System.out.println(p);
	System.out.println(c);
	
	//객체 instanceof 클래스명 => boolean
	//instanceof : 객체가 특정 클래스나 해당 클래스의 자식 클래스인지 확인할 때 사용
	System.out.println(p instanceof Parents); // true  p는 Parents의 객체
	System.out.println(p instanceof Child);
	System.out.println(c instanceof Child);
	System.out.println(c instanceof Parents); // true c는 Child 이면서 Parents의 객체
	// 자식 클래스 타입의 객체는 부모 클래스 타입도 동시에 갖는다
	
	
}
}
