package task;

import java.util.Scanner;

public class sfasdfasdfasf {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int intVal = 0;
	//6. 사용자가 입력한 숫자에 해당하는 구구단을 출력하기
//  단을 입력하세요 : 3단
//  출력
//  3 x 1 = 3
//  3 x 2 = 6
//  ...
//  3 x 9 = 27
  System.out.println("==========task6==========");
  System.out.print("단을 입력하세요 : "); // 입력 출
  intVal = sc.nextInt(); // 변수 재활용 입력받기

  for (int i = 1; i < 10; i++) { // 9번 반복함 -> 반복 횟수가 확실함 -> for사용
     System.out.printf("%d x %d = %d\n", intVal, i, intVal * i); // 구구단 출력
  }
}
}
