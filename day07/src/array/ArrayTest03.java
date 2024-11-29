package array;

public class ArrayTest03 {
	public static void main(String[] args) {
		int[] arData = { 4, 3, 2, 5 }; // 정수형 4칸짜리배열을 변수 ardata에 저장한다
		// 정수형배열 arData stack 메모리 영역에 생성,
		// heap 메모리 영역에 4칸짜리 4,3,2,5 라는 값을 저장한 배열을 생성하고 참조값을
		// arData라는 참조 변수에 담는다
		System.out.println(arData);

		System.out.println(arData[0]);// arData : 값
		arData[0] += 10; // arData : 값,저장공간
		System.out.println(arData[0]); // arData : 값,

		System.out.println("배열의 길이 : " + arData.length);

		double[] arData1 = null; // double 타입의 배열 선언
//	      arData1 = new int[3]; //double 타입의 배열변수에 int[] 타입의 배열을 할당하려고하면 컴파일오류가 발생한다
		arData1 = new double[3]; // double 타입의 배열 생성
		// 배열은 선언과 생성의 타입이 일치해야한다!!!
		System.out.println("배열의 길이 : " + arData1.length);

	}
}
