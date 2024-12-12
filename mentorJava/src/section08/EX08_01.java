package section08;

public class EX08_01 {
<<<<<<< HEAD
public static void main(String[] args) { 
	printHello(); // 메인메소드 안에서 printhello 호출
}
static void printHello() { //리턴값이 없기때문에 void 사용
=======
public static void main(String[] args) {
	
	printHello(); //안녕하세요, 만나서 반갑습니다 를 호출하는 메소드
					//같은 클래스 내부에 있기때문에 메서드 이름만 호출
}
static void printHello() { //반환할 결과(리턴값)가 없기 때문에 void라고 명시
>>>>>>> e7496181c27b4d6715592d3b18add007e4e7223f
	System.out.println("안녕하세요");
	System.out.println("만나서 반갑습니다.");
}
}
