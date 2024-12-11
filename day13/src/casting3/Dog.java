package casting3;

public class Dog extends Animal {


		
	public Dog(String name) {
		super(name);
	}

	@Override
	void crying() {
		System.out.println("멍멍");
	}
	
	//메소드
	   void walk() {
	      System.out.println("산책가기");
	   }

}
