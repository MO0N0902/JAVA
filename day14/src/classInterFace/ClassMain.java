package classInterFace;


class Parent{
	void dispaly() {
		System.out.println("부모클래스");
	}
}

class Child extends Parent{
	void display2(){
		System.out.println("자식클래스");
		
	}
}

public class ClassMain {
public static void main(String[] args) {
	Child c = new Child();
	c.dispaly();
	c.display2();
}
}
