package array;

public class ArrayTest01 {
	public static void main(String[] args) {
		//1) 어떤값이 들어갈지 모르나 몇 칸 만들지 알때
		// 정수형 배열 변수 number1 선언하고 크기가 5칸
		int[] number1 = new int[5];
		
		//2) 어떤값이 들어갈 지 알때(문자열)
		String[] number2 = {"일", "이", "삼", "사"};
		
		//3) 어떤값이 들어갈지 모르고 몇칸인지도 모를때
		double[] number3 = null;
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		
		//4) 배열 변수 선언 후 배열 생성과 초기화
		// 정수형 배열 number4 선언
		// number4 = 값;
		
		int[] number4;
		number4 = new int[]{1,2,3,4};
		System.out.println(number4);
		
		
		
		
	}
	
}
