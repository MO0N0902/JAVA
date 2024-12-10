package classBasic;

//1. 클래스 -사용자 정의 타입니다
public class Student {
//필드(속성)
	int math;
	int eng;
	int kor;
	double avg;
	String name;

// 메소드(기능)
//1-3번 : 연관성 있는 저장공간과 기능을 한곳에 모아 관리 할 수 있는것
	int getTotal() {
		return math + eng + kor;

	}

}
