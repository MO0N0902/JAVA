package TwoForTest;

import java.util.Scanner;

public class TwoForTest03 {

	public static void main(String[] args) {
		int  choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 행의 수 입력");
		choice = sc.nextInt();
		sc.nextLine();
	      for (int i = 1; i <= choice; i++) {
//	         System.out.println("*"); //행
	         for (int j = 1; j <= i ; j++) { // 열
	            System.out.print("*");
	         }
	         System.out.println();
	      }
	}
}
