package oper;

public class OperTest02 {
	public static void main(String[] args) {
		
		int num = 1;
		System.out.println(num);
		System.out.println(num + 10);
		
		//num = num + 10;
		System.out.println(num);
		num += 10;
		//num에 저장된 값 + 10 연산된 값을 num 변수에 저장한다
		System.out.println(num);
		
		num*= 2;
		System.out.println(num);
		
		num/= 2;
		System.out.println(num);
		
		System.out.println("====증감연산자===");
		int num2 = 1;
		System.out.println("기존 num2의 값 : " + num2);
		System.out.println("전위형을 사용한 값 : " + ++num2);
		System.out.println("전위형을 적용한 뒤의 num2의 값 : " + num2);
		
		   int num3 = 7, num4 = 7;
		   int result3 = 0, result4 = 0;

		   result3 = --num3 + 4;
		   result4= num4-- + 4;
		
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(num4);
		
	}
}
