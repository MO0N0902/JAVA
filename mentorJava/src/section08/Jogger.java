package section08;

public class Jogger {
	//예제 8-4
	String name; //메소드 안에 사용한 문자열 변수 생성
	void sayName() { //하나의 클래스 안에 두개의 메소드 선언 가능
		System.out.println("제 이름은" + name + "입니다.");
	}
	//예제 8-2
void run(){ //리턴값 x -> void 
	System.out.println("run run run!"); //"run run run!"문자열을 출력하는 메소드	
}
public static void main(String[] args) {
	//예제8-3
	Jogger jg = new Jogger(); //객체생성
	jg.run(); //객체명 jg + 메소드명 run 호출
	//예제 8-5
	jg.name = "문준혁"; //객체명 jg + 메소드명 name 호출후 네임변수에 넣어줄 이름 입력
	jg.sayName();//매개변수 없기때문에 인수 적지 않음, 리턴값 없기 때문에 syso 사용하지 않음.
}

}
