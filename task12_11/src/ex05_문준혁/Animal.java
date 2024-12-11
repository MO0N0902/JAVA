package ex05_문준혁;

public abstract class Animal {
	// 필드
	protected String name; //protected를 못보고 못넣었습니다

	//생성자
	public Animal(String name) {
		this.name = name;
	}
	
	//메소드
	String getName() {
		return name;
	}
	
	 abstract void performActions(); //abstract 사용해서 추상메소드 만들고 클래스에도 abstract 붙이기

}
