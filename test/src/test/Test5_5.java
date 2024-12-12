package test;

public class Test5_5 {
	public static void main(String[] args) {
<<<<<<< HEAD
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

=======
	
		int height =5;
		for(int i= 0; i<height; i++) {
			for(int j=0; j<height -i; j++) {
				System.out.print("  ");	
			}
			for(int j = 0; j<(i*2)-1; j++) {
				System.out.print("* ");	
			}
		System.out.println();
		}
		
>>>>>>> 455731a49d33a293fcdcdca0929d10046f01fff4
		
	}
	
	// 이중for문사용
	// 행의 갯수가 4인 배열 생성
	// 빈칸생성하는 for문하나
	// 점 찍는 for문 하나
	
	
	
	
//   *
//  * *
// * * *
//* * * * 출력하기
// 이중for문 사용해서

