package anonymousTest2;
interface Calculator{
	int add(int num1, int num2);
	int mul(int num1, int num2);
	}
//calculator 인터페이스
//추상메소드2
//(두개의 매개변수 받아 더한값을 반환하는 메소드)
// 두개의 매개변수를 받아 곱한 값을 반환하는 메소드
public class AnonymousTask {
// 익명클래스로 객체 생성후 메소드 호출하기
	
	public static void main(String[] args) {
		Calculator cal = new Calculator() {

			@Override
			public int add(int num1, int num2) {
				
				return num1 + num2;
			}

			@Override
			public int mul(int num1, int num2) {
				
				return num1*num2;
			}
			
		};
		int sum = cal.add(19, 20);
		int mul = cal.mul(3, 7);
		System.out.println(sum);
		System.out.println(mul);
	}
	
	
	
}
