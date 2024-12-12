package Task;

import java.util.Scanner;

public class TvController {
	public static void main(String[] args) {
		// 컨트롤 페이지 출력
		// 변수 지정 : 입력받을 메뉴 숫자
		// 사용자로부터 메뉴 숫자 입력받기
		// while문 사용해서 4번 종료를 누르기 전까지 반복하기
		// case문 사용해서 해당메뉴로 이동하기
		// 메소드 호출하기
		BasicTv bt = new BasicTv();
		Scanner sc = new Scanner(System.in);

		while (true) { // true 일때동안 반복
			bt.menu(); // 메뉴 출력
			int menunum = sc.nextInt(); // 메뉴번호 입력받기
			switch (menunum) { // switch문으로 메뉴 선택하기
			case 1:
				bt.powerOnOff(); // 전원 메소드 호출
				System.out.println();
				break;
			case 2:
				bt.channelUp(); // 채널 증가 메소드 호출
				System.out.println();
				break;
			case 3:
				bt.channelDown(); // 채널 감소 메소드 호출
				System.out.println();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				System.out.println();
				return;

			default: // 지정된 메뉴번호 외의 번호를 입력했을때 출려
				System.out.println("올바른 메뉴 숫자를 입력해주세요.");
			}

		}

	}// main

//	3. BasicTv 클래스와 함께 동작하는 TvController 프로그램을 작성하세요
//	   프로그램은 사용자로부터 명령을 입력받아 TV를 제어한다
//
//	   BasicTv 객체를 생성하고, 초기값으로 색상 "Black", 크기 32인치, 가격 500000원을 설정
//	   프로그램은 무한 반복(while)하며 사용자에게 다음 메뉴를 출력한다
//
//	=== TV 컨트롤 메뉴 ===
//	1. 전원 On/Off
//	2. 채널 올리기
//	3. 채널 내리기
//	4. 종료
//	메뉴 번호 입력 : 
//
//	사용자가 메뉴 번호를 입력하면, 입력된 번호에 따라 다음 동작을 수행한다
//	1 : powerOnOff() 메서드 호출
//	   전원이 켜지면 "TV 전원이 켜졌습니다." 출력, 꺼지면 "TV 전원이 꺼졌습니다." 출력
//	2 : TV 전원이 켜져 있으면 channelUp() 메서드 호출하고, "현재 채널: [채널 번호]"를 출력
//	   꺼져 있으면 "TV 전원을 먼저 켜주세요." 메시지 출력
//	3 : TV 전원이 켜져 있으면 channelDown() 메서드를 호출하고, "현재 채널: [채널 번호]"를 출력합니다. 꺼져 있으면 "TV 전원을 먼저 켜주세요." 메시지 출력
//	그 외 : 프로그램을 종료하고 "프로그램을 종료합니다." 메시지 출력
}// class
