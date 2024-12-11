package ex04_문준혁;

public class Student extends Person{
	//필드
	int javaScore = 0;
	int dbmsScore = 0;
	int htmlScore = 0;
	
	//생성자(부모 클래스 매개변수를 super()로 묶어주고 나머지 매개변수 초기화)
	public Student(String name, int javaScore, int dbmsScore, int htmlScore) {
		super(name);
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.htmlScore = htmlScore;
	}
	//총점 메소드
	int getTotalScore() {
		int sum = javaScore + dbmsScore + htmlScore; //각점수 더한것을 sum변수에 저장
		return sum;
	}
	//평균 메소드
	int gerAverageScore() {
		int avg = (javaScore + dbmsScore + htmlScore)/3; //점수를 더하고 3으로 나눈것을 avg변수에 저장
		return avg;
	}

}
