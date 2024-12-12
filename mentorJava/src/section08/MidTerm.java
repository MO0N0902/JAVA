package section08;

public class MidTerm {
	//예제 8-16
	public int score(int[] scores) { // 리턴값이 정수이기 때문에 반환타입을 int로 설정하고 매개변수를 배열로 설정해 메소드 생성
		int result = 0; // 결과값 넣어줄 변수생성
		for(int i = 0 ; i < scores.length; i++) { //for문을 사용해 배열에 값 넣어주기
			result += scores[i];  // result 변수에 배열의 값 더한것 넣어주기
		}
		return result; //result를 반환
	}
	public static void main(String[] args) {
		//예제 8-17
		int[] studentA = {97, 53}; // a학생의 중간고사 성적이 담긴 배열생성
		int[] studentB = {95, 66};// b학생의 중간고사 성적이 담긴 배열생성
		MidTerm mt =new MidTerm(); //객체명 생성
		int sumA = mt.score(studentA); // 메소드를 호출한 결과값을 변수 sumA에 저장 
		int sumB = mt.score(studentB);// 메소드를 호출한 결과값을 변수 sumB에 저장 
		if(sumA > sumB) { //if문 사용하여 두학생의 성적총점 비교
			System.out.println("A학생의 중간고사 총점이 더 높습니다.");
		}else if(sumA < sumB){
			System.out.println("B학생의 중간고사 총점이 더 높습니다.");
			
		}else {
			System.out.println("두 학생의 중간고사 총점이 같습니다.");
		}
	}

}
