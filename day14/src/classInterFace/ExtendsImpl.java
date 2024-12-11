package classInterFace;
class Parent{
	void parentMethod(){
		System.out.println("부모클래스");
	}
}

interface InterfaceA {
	void method1();
	
}

interface InterfaceB{
	void method2();
}

class Child extends Parent implements InterfaceA, InterfaceB{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
}

public class ExtendsImpl {
public static void main(String[] args) {
	
}
}
