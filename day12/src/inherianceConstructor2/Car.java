package inherianceConstructor2;

public class Car {
	// 필드
	String brand;
	String color;
	int price;

	// 메소드
	void enginStart() {
		System.out.println("시동이 켜졌습니다.");
	}

	void enginStop() {
		System.out.println("시동이 꺼졌습니다.");
	}

	//기본생성자
	public Car() {

	}
	//다받는 생성자
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
}
