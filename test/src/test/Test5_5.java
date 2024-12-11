package test;

public class Test5_5 {
	public static void main(String[] args) {
	
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
}
