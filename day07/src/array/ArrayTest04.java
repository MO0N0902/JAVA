package array;

import java.util.Scanner;

public class ArrayTest04 {
	public static void main(String[] args) {
//		//1부터 10까지의 값을 배열에 넣고 출력하기
//		//1) 배열 선언 및 생성 => 값을 알 때
		int[]number1 = {1,2,3,4,5,6,7,8,9,10};
//		int[]number2 = {1,2,3,4,5};
//		
//		//배열명.length : 배열의 길이, 배열의 길이에서 -1이 인덱스 끝 번호
//		
//		
//		//2) 배열의 출력
//		for(int i = 0; i <number1.length; i++) {
//		System.out.println(number1[i]);
//		}
//		for(int i =0; i < number2.length; i++) {
//			System.out.println(number2[i]);
//		}
//	//1부터 10까지의 값을 배열에 넣고 출력
//		//1) 배열 선언 및 생성(값을 모를 때)
//		int[] number3 = new int [10]; // 10칸짜리 배열을 생성하면 인덱스번호는 0부터 9까지
//		
//		// for문(초기식 int i = 1 (인덱스 번호는 0부터 시작);
//		//		조건식 i < 배열명.length; (배열의 길이보다 작을동안 반복)
//		//		증감식 i++
//		//		출력문 
//		
//		for(int i =0; i < number3.length; i++) {
//			number3[i] = i+1;
//			System.out.println(number3[i]);
//			
//		}
//			
//		
//		System.out.println(number3);//참조값
	
	//5부터 1까지의 값을 배열에 담고 출력하기
//		Scanner sc = new Scanner(System.in);
//		
//		int[] number4 = null;
//		System.out.println("원하는 숫자를 입력하세요");
//		number4 = sc.nextInt();
//		for(int i = 0; i <number4.length; i++) {
//			number4[i] = number4.length-i;
//			
//			
//		}
//		for(int i = 0; i <number4.length; i++) {
//		System.out.println(number4[i]);
//		}
//		
		
		//i=4 num.length = 5
	
		//칸수를 알때로 선언
		// 값을 대입하는 반복문, 값을 출력하는 반복문을 따로 작성한다
	
		for(int data : number1) {
			System.out.println("값 : " + data);
		}
		
		
		
		
		
		
		
	}

	
	
}
