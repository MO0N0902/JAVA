package section08;

public class Calc2 {
	//예제 8-12
	void sum(int[] num) { //정수형 배열을 매개변수로한 메소드 생성 
	int result = 0; //결과값 변수 생성
	for(int i=0; i<num.length; i++) { //배열의 값을 넣어주기 위해 for문 사용
		result +=num[i]; 
	}
	System.out.println("숫자들의 합은" + result + "입니다."); //출력문
	}
	//예제 8-13
	public static void main(String[] args) {
		int num[] = {100, 200}; // 배열 생성
		Calc2 cl = new Calc2();{// 객체 생성
			cl.sum(num); //생성한 배열의 이름을 인수로 넣고 메소드 호출
		}
	}//main
}//class
