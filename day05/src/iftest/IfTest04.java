package iftest;

import java.util.Scanner;

public class IfTest04 {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
      //삼항연산자로 작성했던 두 수를 입력받아 큰 수 출력하기
      // => if ~ else if ~ else문으로 변경
      
      //1) 입력 클래스 import
      //2) 변수 선언 int 2개
	   int num1 = 0, num2 = 0;
      //3) 입력 메시지 출력
	   System.out.println("정수 두개를 입력해주세요");
	   num1 = sc.nextInt();
	   num2 = sc.nextInt();
      //4) 조건문(if ~ else if ~ else문)
      //4-1)   if (변수1 > 변수2) {
      //4-2)       변수1이 변수2보다 큽니다 출력
      //4-3)   }else if(변수1 == 변수2){
      //4-4)       변수1과 변수2가 같습니다 출력
      //4-5)   }else{
      //4-6)      변수2가 변수1보다 큽니다 출력
      //      }
      if (num1>num2) {
		System.out.println("둘 중 더 큰 수는 " + num1 + "입니다");
	}
      else if(num1==num2) {
    	  System.out.println("두 수는 같습니다");
      }
      else{
    	  System.out.println("둘 중 더 큰 수는 " + num2 + "입니다");
      }
      
   }
   
}
