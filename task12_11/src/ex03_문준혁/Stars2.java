package ex03_문준혁;

import java.util.Scanner;

public class Stars2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력하고 싶은 행 입력 : ");
		int height = sc.nextInt();
		for(int i = 0; i <=height-1; i++) {
			for(int j = 0; j <i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
