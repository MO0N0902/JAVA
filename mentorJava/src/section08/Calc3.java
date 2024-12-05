package section08;

public class Calc3 {
	// 예제 8-14
	public int sum(int[] num) {// 리턴값이 정수형이기때문에 반환타입을 int로 설정 매개변수로 배열 넣어줌
		int result = 0; // 결과값 변수 생성
		for (int i = 0; i < num.length; i++) { // 배열에 값 넣어줄 for문 생성
			result += num[i]; // 배열의 값의 합을 result 변수에 저장
		}
		return result; // result를 리턴값으로 설정
	}

	public static void main(String[] args) {
		//예제 8-15
		int[] nums = {500, 200}; //배열에 값 넣어서 생성
		Calc3 cl =new Calc3(); //객체명 생성
		System.out.println("숫자들의 합은" + cl.sum(nums) + "입니다"); // 리턴값이 있기 때문에 syso를 사용하여 메소드 호출 인수에는 생성한 배열변수 넣어줌
	}
}
