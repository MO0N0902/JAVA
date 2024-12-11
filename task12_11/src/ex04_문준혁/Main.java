package ex04_문준혁;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Student st = new Student(null, 0, 0, 0);
	
	//각 점수 입력하게끔 입력문 작성 
	System.out.print("javaScore 입력 : ");
	st.javaScore = sc.nextInt();
	System.out.print("dbmsScore 입력 : ");
	st.dbmsScore = sc.nextInt();
	System.out.print("htmlScore 입력 : ");
	st.htmlScore = sc.nextInt();
	
	//리턴값이 있는 메소드이기때문에 출력문 이용하여 출력
	System.out.println("이름 : " + st.getName() + "\n" +"총점 : " + st.getTotalScore() + "\n" + "평균 : " + st.gerAverageScore());
	
	
}
}
