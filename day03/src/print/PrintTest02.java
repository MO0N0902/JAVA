package print;
//8번 : 출력메소드(printf)

public class PrintTest02 {
	public static void main(String[] args) {
		//정수형
		int num1 = 200;
		System.out.printf("10진수 : %d\n", 100);
		System.out.printf("10진수 : %d", num1);
		System.out.printf("\n8진수 : %o", 877);
		System.out.printf("\n16진수 : %x", 0xff);
		System.out.printf("\n16진수 : %x", 10); //10 => a, 15=>f
		System.out.printf("\n16진수 : %x", 26);//26
		
		// 실수형
		System.out.printf("\n실수형 : %f", 3.1234567);//소수점이하 6자리까지 정확히 나옴 7자리 이상되면 7번째 자리에서 반올림
		System.out.printf("\n실수형 소수점 2자리까지 : %.2f", 3.1234567);//
		
		//문자형
		System.out.printf("\n문자형 : %c", 'a');
		System.out.printf("\n문자형 : %c", 'A');
		
		//문자열
		System.out.printf("\n문자열 : %s", "Hello");
		String data = "Hello Java";
		System.out.printf("\n문자열 : %s", data);
		System.out.printf("\n문자열 : %.5s", data);// 문자열에서 .n 형태로 쓰게되면 해당 자리수 까지만 문자열이 잘려서 출력된다
		
		// 논리형
		System.out.printf("\n논리형 : %s", true);
		
		//복합 사용
		int age = 20;
		String name = "문준혁";
		double date = 11.25;
		boolean isStudy = true;
		System.out.printf("\n이름 : %s, 나이 : %d, 오늘날짜 %.2f, 공부중여부 : %s", name, age, date, isStudy);
		
		
		
		
		
	}
}
