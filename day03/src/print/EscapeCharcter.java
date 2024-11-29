package print;

public class EscapeCharcter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 줄바꿈 : \n
		System.out.println("안녕하세요. 3일차 수업입니다");
		System.out.println("안녕하세요.\n3일차 수업입니다");
		System.out.println("\n"); //println 줄바꿈1번, \n에서 줄바꿈 한번
		System.out.println("출력끝");// 출력끝 문자열이 출력되기 전에 줄바꿈 2번 적용한다
		
		// 탭 간격 : \t
		System.out.println("이름\t나이");
		System.out.println("문준혁\t28");
		
		// 문자열 안에 큰따옴표 표현 \"
		System.out.println("자바는 정말 재미있습니다. \"자바 2일차!\"");
		
		// 문자열 안에 작은 따음표 표현 : \'
		System.out.println("오늘은 '날씨'가 좋다.");
		System.out.println('\'');
		
		//역슬래쉬 표현 : \\
		System.out.println("워크스페이스 경로는 d:\\web 0900_kys 입니다");
		
		//총 활용
		//System.err.println("다양한 제어문자를 사용할 수 있다. \n\'\\n\'을 쓰면 줄바꿈 된다.");
		
		
	}

}
