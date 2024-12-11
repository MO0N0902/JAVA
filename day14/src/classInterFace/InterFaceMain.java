package classInterFace;

interface InterfaceA {
	void methodA();
}

interface InterfaceB {
	void methodB();

}

class ClassC implements InterfaceA, InterfaceB {

	@Override
	public void methodA() {
		System.out.println("InterfaceA 메소드 구현");

	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub

	}

}

public class InterFaceMain {
	public static void main(String[] args) {

	}
}
