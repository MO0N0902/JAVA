package classInterFace;

interface Interface1{
	void method1();
}

interface Interface2{
	void method2();
}

interface Interface3 extends Interface1, Interface2{
	void method3();
}

class ClassA implements Interface3{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	
	
}

public class InterfaceMain3 {
public static void main(String[] args) {
	
}
}
