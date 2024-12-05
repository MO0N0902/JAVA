package section08;

public class Bus {
	// 예제 8-18
	void take(int m) { //리턴값이 없기에 void 정수형 매게변수를 활용해 메소드 생성
		while (true) { //사용한 돈을 반복적으로 빼줘야 하기때문에 while문사용
			if (m < 3000) { //돈이 3000원보다 적었을때 출력문
				System.out.println("교통카드를 충전하러 갑니다");
				return; // return을 통해서 wile문 탈출
			}
			System.out.println("버스를 탑니다"); //3000원보다 많은경우 돈에서 1250원을 빼고 반복
			m -= 1250;
		}
	}
	//예제 8-19
	public static void main(String[] args) {
		int money = 10000; // 돈의 값을 넣어줄 변수 money 생성
		Bus bs = new Bus(); //객체명 생성
		bs.take(money); // 리턴값이 없기때문에 syso를 사용하지 않고 인수만 넣어서 메소드 호출
		
	}
}
