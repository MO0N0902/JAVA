package TwoForTest;

import java.util.Scanner;

public class TwoForTask01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int choice = 0;
//		System.out.println("출력할 행의 수 입력");
//		choice = sc.nextInt();
//		sc.nextLine();
//		for (int i = choice; i > 0; i--) {
//			for (int j = 1; j <= i;  j++) { 
//				System.out.print("*");
//			}
//			System.out.println();
//			
			
		int choice =0;
		System.out.println("출력할 행의 수 입력");
		choice =sc.nextInt();
		sc.nextLine();
		for(int i =1; i <=choice; i++ ) {
			int ii = i+1;
			for (int j = 1; j<=i; j++) {
				System.out.printf("* ");
			}
			System.out.println();
		}
		
	}
}
