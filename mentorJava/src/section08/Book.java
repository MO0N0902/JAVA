package section08;

public class Book {
	// 예제 8-6
	void count(int bookNum) { // 매개변수 정수형 booknum을 넣어주고 메소드 생성, 리턴값은 없기때문에 void 사용
		System.out.println("책은 " + bookNum + "권 입니다"); // 메소드 호출했을때 나올 문장
	}

	public static void main(String[] args) {
		// 예제 8-7
		Book bk = new Book(); //클래스명 + 객체명 = new + 클래스명 사용해서 객체생성
		bk.count(3); //객체명 + 메소드명(인수) 사용해서 메소드 호출
	}

}
