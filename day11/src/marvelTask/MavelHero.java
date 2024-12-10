package marvelTask;

public class MavelHero {
	//마블에 나오는 히어로들 객ㅊ체로 만들어 출력하기
	
	//필드
	//이름, 슈퍼파워, 나이
	String name;
	String superpower;
	int age;
	
	
	//생성자
	// 모든 필드를 매개변수로 받는 생성자
	public MavelHero(String name, String superpower, int age) {
		
		this.name = name;
		this.superpower = superpower;
		this.age = age;
		
	}
	
	
	//정보출력 메소드
	//모든 필드내용출력
	//히어로 액션 메소드
	//히어로 이름과 액션 출력
	void heroaction() {
		System.out.println(this.age + "살의 " + this.name + " 히어로 능력은 " + this.superpower + " 입니다");
	} 
	
	
	
	
}
