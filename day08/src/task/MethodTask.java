package task;

public class MethodTask {
	public static void main(String[] args) {
		MethodTask mt = new MethodTask();
		// 1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드
		System.out.println(mt.changeSign(3));
		//2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
		System.out.println(mt.printName(4, "문준혁"));
		// 3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
		System.out.println(mt.changeNumber(24));
		//4. 5개의 정수중 평균을 반환하는 메소드
		System.out.println(mt.getAvg(5, 4, 7, 9, 10));
	}

// 1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드
// 매개변수o, 리턴값o
// 메소드명 : changeSign
	int changeSign(int num) {
		System.out.println(num);
		int choice = 0;
		choice = num * -1;
		return choice;
	}

//2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
// 매개변수 o, 리턴값 o
// 메소드명 : printName

	String printName(int time, String name) {
		System.out.println(time);
		System.out.println(name);
		
		for (int i = 0; i <= time; i++) {
			System.out.println(name);
		}
		return name;
	}

// 3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
// 매개변수o, 리턴값o
// 메소드명 : changeNumber
	int changeNumber(int choice) {
		System.out.println(choice);
		int choice3 = 0;
		if (choice3 <= 10) {
			System.out.println(1);
		} else {
			System.out.println(100);
		}
		return choice3;
	}

// 4. 5개의 정수중 평균을 반환하는 메소드
// 매개변수o(배열), 리턴값o
// 메소드명 getAvg
	int getAvg(int num1, int num2, int num3, int num4, int num5) {
	 System.out.println(num1);
	 System.out.println(num2);
	 System.out.println(num3);
	 System.out.println(num4);
	 System.out.println(num5);

	 int choice4 = 0;
	 System.out.println(num1+num2+num3+num4+num5);
	 	
	return choice4;
	}

// 5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
// 매개변수o(배열),리턴값 x
// 메소드명 printMinMax
// 
	
	void printMinMax(int[] arr) {
		int Min = arr[0];
		int Max = arr[0];
		
		for(int i=1; i<=arr.length; i++) {
			if(Max<arr[i]) {
				Max = arr[i];
			}
		}
	}
	
	
	
// 6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
// BaNanA -> bAnANa
// 메소드명 : changeCase
// 매개변수와 리턴값 자유 => 단, 형변환 이용할 것

	
	
// 7. 아이디와 비밀번호를 입력받아 로그인하기
// 매개변수 o, 리턴값 o(boolean 타입)
// 메소드명 : login
// main메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
// 둘 중 하나라도 틀리면 잘못입력했습니다 출력
	
	
}