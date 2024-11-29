package teamTask;

import java.util.Scanner;

public class TwoForTask02 {
public static void main(String[] args) {
	//100만점인 4과목의 점수를 입력해서  점수(100)와 각과목의 성적(A+)을 출력하고 평균 학점(4.5)을 출력
	   //95-100 = A+(4.5)
	   //90-94 = A(4.0)
	   //85-89 = b+(3.5)
	   //80-84 = b(3)
	   //75-79 = c+(2.5)
// 출력 :  4과목의 성적을 입력해주세요
	//  과목1  점수 : 성적 :
	//	과목2  점수 : 성적 : 
	//	과목3  점수 : 성적 : 
	//  과목4  점수 : 성적 :
	//  평균 학점 : 
	Scanner sc = new Scanner(System.in);
	int score1 = 0,score2 = 0,score3 = 0,score4 = 0;
	System.out.println("4과목의 성적을 띄어쓰기 기준으로 입력해주세요");
	score1 = sc.nextInt();
	score2 = sc.nextInt();
	score3 = sc.nextInt();
	score4 = sc.nextInt();
	
	
	if(score1 >95) {
		String score5 = score1 + "A+";
	}else if (score2 > 90 ) {
		
	}String score6 = score1 + "A";
		
//	System.out.printf("=======성적표====== \n과목1 점수 : %d 성적 :  \n과목2 점수 : %d 성적 %s: %d \n과목3 점수 : %d 성적 : %d \n과목4 점수 : %d 성적 : %d",score1, score5 , score3, score4);
		
	}
	
}


