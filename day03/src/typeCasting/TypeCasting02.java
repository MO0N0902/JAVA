package typeCasting;
//12번 : 자동 형변환
public class TypeCasting02 {

	public static void main(String[] args) {
		//1) 작은 자료형에서 큰 자료형으로 변환
		// int -> long
		int intval = 100;
		long result1 = intval;
		System.out.println(result1);
		
		//int -> float
		float result2 = intval;
		System.out.println(result2);
		
		// float -> double
		double result3 = result2;
		
		
		//3) 문자형('a')에서 정수형으로 변환 
		char letter = 'a'; //'a' : 97, 'A' : 65
		int asciival = letter;
		System.out.println(letter);
		System.out.println(asciival);
		
		char letter2 = 'b';
		int asciival2 = letter2;
		System.out.println(letter2);
		System.out.println(asciival2);
		
		char letter3 = '가';
		int asciival3 = letter3;
		System.out.println(letter3);
		System.out.println(asciival3);
		
		
		

	}

}
