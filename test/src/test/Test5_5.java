package test;

public class Test5_5 {
	public static void main(String[] args) {
        int length = 4; // 출력할 줄 수

        for (int i = 1; i <= length; i++) {
            // 공백 출력
            for (int j = 1; j <= length - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // 줄바꿈
        }
    }

		
	}
//   *
//  * *
// * * *
//* * * * 출력하기
// 이중for문 사용해서

