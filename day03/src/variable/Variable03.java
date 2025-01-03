package variable;

public class Variable03 {

	public static void main(String[] args) {
	// 정수형 = 4byte : -2,147,483,648 ~ 2,147,483,647
	// 정수형 long 8byte : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (64비트 정수)

			int inVal = 2147483647;
			System.out.println(inVal);
			long longVAL = 2147483648L;
			System.out.println(longVAL);
			
			//실수형 double 8byte : 15자리 소수점 이하 => 넓은범위 표현 가능 
			//실수형 float 4byte : 6~7 자리 소수점 이하 => 메모리를 더 적게 사용, 정밀도가 낮음
			
			double doubleVal = 3.1415924454245;
			System.out.println(doubleVal);
			float floatVal = 3.1415926f;
			System.out.println(floatVal);
		//계산 오차 확인
			double dobleSum = 0.1 +0.2;
			float floatSum = 0.1f + 0.2f;
			System.out.println(dobleSum);
			System.out.println(floatSum);
			
			//논리형은 boolean : true, false
			boolean isJava = true;
			System.out.println("java 공부중인가요? " + isJava);
			
			//문자형 char : '' 작은 따옴표로 표현
			char grade = 'A';
			System.out.println("java 학점 : " + grade);
			
			// 문자형 string : "" 큰따옴표로 표현
			String myName = "문준혁";
			System.out.println("제 이름은 " + myName + " 입니다");
	}

}
