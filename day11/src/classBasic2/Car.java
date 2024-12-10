package classBasic2;
//5. 클래스의 특징 3(객체생성의 틀)

public class Car {
	//필드
	String model;
	String color;
	int speed;
	
	
	// 메소드
	// 속도를 증가시키는 메소드
	void accelerate(int value) {
		speed += value;
	}
	
	//주행을 멈추는 메소드
	void stop() {
		speed =0;
	}
	
	
	
}
