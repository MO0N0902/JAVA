package marvelTask;

public class MavelHeroMain {
public static void main(String[] args) {
	//아이언맨과 헐크 객체를 만들고 정보출력
	MavelHero mh1 = new MavelHero("아이언맨", "자유비행", 460);
	System.out.println(mh1.age);
	mh1.heroaction();
	MavelHero mh2 = new MavelHero("헐크", "강력한 힘", 50);
	mh2.heroaction();
	
}
}
