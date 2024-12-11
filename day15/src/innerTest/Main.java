package innerTest;
//2. 내부클래스의 외부클래스 객체화
public class Main {
	public static void main(String[] args) {
		//외부클래스의 객체 생성
		Outer outer = new Outer();
//		System.out.println(outer);
//		System.out.println("외부클래스의 데이터 : " + outer.var1);
		outer.outerMethod();
		//내부클래스의 객체 생성
		//내부클래스는 외부 클래스의 인스턴스를 통해 생성해야함
		Outer.Inner inner = outer.new Inner(); //외부클래스명 객체명.new 내부클래스명
//		System.out.println("내부클래스의 참조값 : " + inner);
//		System.out.println("내부클래스의 참조값 : " + inner.var2);
//		
		inner.innerMethod();
		
		
	}
}
