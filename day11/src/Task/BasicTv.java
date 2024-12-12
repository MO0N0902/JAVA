package Task;

import java.util.Scanner;

public class BasicTv {
	TvController tc = new TvController();
//	2. BasicTv 클래스를 작성하세요
//	필드 :
	boolean power; //TV 전원 상태 (기본값: false)
	int channel = 1; //TV 채널 (기본값: 1)
	String color;// TV의 색상
	int size; // TV의 크기
	int price; // TV의 가격

	
//생성자
	public BasicTv() {
		
	
	}
	
	//메서드 : menu(); 컨드롤 메뉴

	void menu() {
		System.out.println(
				"=== TV 컨트롤 메뉴 ===\n" 
				+ "1. 전원 On/Off\n" 
				+ "2. 채널 올리기\n" 
				+ "3. 채널 내리기\n" 
				+ "4. 종료\n" 
				+ "메뉴 번호 입력 :");

		
	}
//	메서드:
//	void powerOnOff() : TV 전원을 켜거나 끄는 메서드
//	      전원이 켜져 있으면 끄고, 꺼져 있으면 켜야 다른 동작이 가능하다
	void powerOnOff() {
		power = !power;
		System.out.println(power? "전원이 켜졌습니다." :"전원이 꺼졌습니다.");
		//삼항연산자 이용해서 power가 true일때 전원이 켜졌습니다 호출
	}
//	void channelUp() : 채널을 1씩 증가시키는 메서드
//    채널 최대값 999
	void channelUp() {
		if(power) {
			System.out.println("현재 채널 : " + channel);
			if(channel < 999) { //999보다 작을때
				channel++; // 1증가
			}else {
				channel = 1; // 채널이 999일때 1로 옮기기
			}
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
	

//	void channelDown() : 채널을 1씩 감소시키는 메서드
//	      채널 최소값 1
	void channelDown() {
		if(power) {
			System.out.println("현재 채널 : " + channel);
			if(channel > 1 ) { //채널이 1보다 클때 
				channel--; // 1감소
			}else {
				channel = 999; //채널이 1일경우 채널 999로 옮기기 
			}
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
}
