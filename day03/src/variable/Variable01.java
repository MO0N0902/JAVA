package variable;
//1번
public class Variable01 {

	public static void main(String[] args) {
		//변수 선언
		//자료형 변수명;
		int number1;		//정수형 타입의 값을 저장할 수 있는 NUMBER1변수를 만들었다
							//논리형 타입의 값을 저장할 수 있는 isTrue변수를 만들었다
		boolean isTrue;		 
		double number2;		//실수형 타입의 값을 저장할 수 있는 number2 변수를 만들었다

		//변수의 값 저장
		// 변수명 = 값;
		number1 = 10;		//10이라는 정수형 값을  number1 변수에 대입한다
		number2 = 10.5;		//number2라는 변수에  10.5 실수형 값을 대입한다
		isTrue = true;		//true 논리형값을 isTrue 변수에 대입한다
		
		System.out.println(10);			//10이라는 값을 콘솔창에 출력한다
		System.out.println(number1);	//number1이라는 변수에 저장된 10이라는 값을 콘솔창에 출력한다
		System.out.println(number2);	//number2 변수에 저장된 10.5라는 실수형 값을 콘솔창에 출력한다
		System.out.println(isTrue);		//isTrue 변수에 저장된 true 논리형 값을 콘솔창에 출력한다
		
		//선언과 동시에 초기화(처음으로 값을 저장하는 것)
		// 자료형 변수명 = 값;
		int number3 = 100;	//정수형 number3 변수에 정수형 100이라는 값을 대입한다
		System.out.println(100);
		System.out.println(number3);
		
	}

}
