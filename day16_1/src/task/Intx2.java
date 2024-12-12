package task;

import java.util.Scanner;

public class Intx2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("0과 100사이의 정수를 입력해주세요");
	int num1 = sc.nextInt();
	if(num1<0||num1>100) {
		try {
			System.out.println("잘못된 입력입니다");
		} catch (Exception e) {
			
		}
	}else {
		System.out.println("결과값 :" + (num1*2));
	}
	
}
	
}
