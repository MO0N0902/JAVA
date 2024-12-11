package ex04_문준혁;

import java.util.Scanner;

public class Person {
	Scanner sc = new Scanner(System.in);
	//필드
	private String name;

	//생성자
	public Person(String name) {
		this.name = name;
	}
	//메소드
	String getName() {
		System.out.println("이름을 입력해주세요");
		name = sc.next();
		return name;
	} //메인메소드에서 성적을 입력받는건 되는데 이름이 안돼서 메소드에서 스캐너 클래스 import 해서 입력문을 작성했습니다
	
}
