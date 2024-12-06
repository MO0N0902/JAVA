package ex01;

import java.util.Scanner;

// 문준혁
public class Main {
	//필드
		String name;
		int javaScore;
		int dbmsScore;
		int totalscore;
		char grade;
	// 첫번째 메소드
		void calulateGrade() {
			Scanner sc = new Scanner(System.in);
			System.out.println("java 점수를 입력해주세요");
			javaScore = sc.nextInt();
			if (javaScore >= 90) {
				grade = 'A';
				System.out.println("java 학점은 " + grade + "입니다");
			}else if (80< javaScore && javaScore <90) {
				grade = 'B';
				System.out.println("java 학점은 " + grade + "입니다");;
			}else if(70< javaScore && javaScore <80) {
				grade = 'C';
				System.out.println("java 학점은 " + grade + "입니다");
			}else 
				grade = 'F';
			System.out.println("java 학점은 " + grade + "입니다\n");
			
			System.out.println("dbms 점수를 입력해주세요");
			dbmsScore = sc.nextInt();
			if (dbmsScore >= 90) {
				grade = 'A';
				System.out.println("dbms 학점은 " + grade + "입니다");
			}else if (80< dbmsScore && dbmsScore <90) {
				grade = 'B';
				System.out.println("dbms 학점은 " + grade + "입니다");;
			}else if(70< dbmsScore && dbmsScore <80) {
				grade = 'C';
				System.out.println("dbms 학점은 " + grade + "입니다");
			}else 
				grade = 'F';
			System.out.println("dbms 학점은 " + grade + "입니다");		
		}
		// 두번째 메소드
		void isPass() {
			
		}
	public static void main(String[] args) {
		// 성적평가 프로그램
		// 학생의 성적을 입력받아 학점을 계산하는 프로그램
		// 90점 이상 A 80점 이상 90점미만 B 70점이상 80점미만 C 70점미만 F
		// 반드시 메소드를 만들것(2개이상)
		// 객체도 2개 이상
		// 로직구성 있어야함
		
		
		//사용자로부터 점수를 입력받고 학점과 합격여부를 출력하기
		//필드 : 이름, java점수, dbms점수, 총점, 학점
		// 생성자 :  상관없음
		// 메소드 :  calulateGrade(int) : 점수를 받아 학점 반환하는 메소드(매개변수 1개 정수형)
		//			isPass(int) :  점수가 70점 이상이면 true, 아니면 false반환하는 메소드
		
		
		// 로직구성
		// 스캐너클래스 import
		// 메소드 1 작성 if문 이용
		//메소드 2 작성 삼항연산자
		
	}
	
}
