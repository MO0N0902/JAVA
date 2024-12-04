package twoArray;

// + 재귀함수 : 자기자신을 호출하는 프로그래밍 기법
public class Factorial {
	public static void main(String[] args) {
		// 기본 조건 : 재귀 호출을 종료시키는 조건
		// 재귀 호출 : 자기 자신을 호출하는 부분

		// 팩토리얼
		int number = 5;
		System.out.println(number + "!= " + factorial(5));
	}
public static int factorial(int n) {
	if(n==1) {
	return 1;
}
return n * factorial(n-1);
}
}