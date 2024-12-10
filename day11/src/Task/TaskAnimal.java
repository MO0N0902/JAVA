package Task;

public class TaskAnimal {
//	1. 동물 클래스를 작성하세요
//	 필드(속성) : '이름', '나이', '종류'라는 필드
//	    - 이름 : 동물의 이름을 저장하는 곳
//	    - 나이 : 동물의 나이를 저장하는 곳
//	    - 종류 : 동물의 종류(개, 고양이, 새 등)를 저장하는 곳
	String name;
	String type;
	int age;
	
	//생성자
	public TaskAnimal(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
//	 메서드(행동)
//	    - 밥먹기() : 동물이 밥을 먹는 행동을 하는 메서드
	void eatfood() {
		System.out.println(this.name + "이란 이름을 가진" +this.type +"가 우리에서 밥을 먹고있습니다.");
	}
	
//	    - 놀기() : 동물이 노는 행동을 하는 메서드
	void play() {
		System.out.println(type + "무리가 함께 놀고있습니다.");
	}
	
//	    - 자다() : 동물이 자는 행동을 하는 메서드
	void sleep() {
		System.out.println(name+"("+type+")"+"가 곤히 자고있습니다.");
	}
//	    - 생일축하() : 동물의 생일을 축하하는 메서드
	void birth() {
		System.out.println("오늘은 "+ name+"("+type+")의" + age + "번째 생일입니다!");
	}

	
	
}
