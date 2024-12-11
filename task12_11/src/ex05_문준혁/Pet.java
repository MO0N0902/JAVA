package ex05_문준혁;

public class Pet extends Animal{
	Pet pet = new Pet(name);
	//생성자
	public Pet(String name) {
		super(name);
	}

	//메소드
	void play() {
		System.out.println(name + "(이)가 친구에게 장난칩니다.");
	}
	
	void eat() {
		System.out.println(name + "(이)가 먹이를 먹습니다.");
	}
	
	void sleep() {
		System.out.println(name + "(이)가 잠을 잡니다.");
	}
	
	@Override
	void performActions() { 
		pet.play();
		pet.eat();
		pet.sleep();
	}
	

	

}
