package Task;

import java.util.Scanner;

public class TvController {
	public static void main(String[] args) {
		//컨트롤 페이지 출력 (메소드로 출력할것인가?)
		// 사용자로부터 메뉴 숫자 입력받기
		// while문 사용해서 4번 종료를 누르기 전까지 반복하기
		// case문 사용해서 해당메뉴로 이동하기 
		Scanner sc = new Scanner(System.in);
		System.out.println("=== TV 컨트롤 메뉴 ===\n"
				+ "1. 전원 On/Off\n"
				+ "2. 채널 올리기\n"
				+ "3. 채널 내리기\n"
				+ "4. 종료\n"
				+ "메뉴 번호 입력 :");
		int menunum = sc.nextInt();
		
		
		
		
	}
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
}
