package teamtask;

import java.util.Scanner;

public class JavTang {
	public static void main(String[] args) {

		// 1번문제
		JavTang jt = new JavTang();
		int[] arr = new int[2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 1; i++) {
			System.out.println("배열의" + (i + 1) + "번째 값 입력 : ");
			arr[i] = sc.nextInt(); // 배열 숫자 받아오기
		}
		System.out.println(jt.add(arr));// 더하기 메소드
		System.out.println(jt.subraction(arr));// 빼기 메소드
		System.out.println(jt.multiply(arr));// 곱셈 메소드
		if (arr[1] == 0) { // 나눗셈 메소드 불러오기
			System.out.println("0으로 나눌 수 없습니다");
		}
		System.out.println(jt.divied(arr));

		// 2번문제
		int age = 0, money = 0; String ageName ="";
		System.out.println("나이를 입력해주세요");
		age =sc.nextInt();
		ageName = jt.checkAge(age);
		System.out.println(ageName + "입니다");
		System.out.println("충전하실 금액을 입력해주세요");
		money =sc.nextInt();
		jt.takeBus(money, ageName);


		//3번문제
		 //아이디 중복 검사
		 while (true) {
			 System.out.println("아이디를 입력해주세요 : ");
	         //아이디 중복 검사
			 String id = sc.next();
			 System.out.println();
	         if(jt.idCheck(id)==false) {
	            System.out.println("아이디 중복 오류로 종료합니다.");
	            break;
	         }
	         
	         //닉네임 받기
	         System.out.print("닉네임을 입력해주세요 : ");
	         String name = sc.next();
	         System.out.println();
	         sc.nextLine();// void buffer
	         //닉네임 중복검사
	         if(jt.nameCheck(name)==false) {
	            System.out.println("닉네임 중복 오류로 종료합니다.");
	            break;
	         }
	         
	         //비밀번호 받기
	         System.out.print("비밀번호를 입력해주세요 : ");
	         String pw = sc.next();
	         System.out.println();
	         sc.nextLine();// void buffer
	         System.out.print("비밀번호를 다시 입력해주세요 : ");
	         String pwCheck = sc.next();
	         sc.nextLine();// void buffer
	         //비밀번호 일치 검사
	         if(jt.pwCheck(pw, pwCheck).equals("false")) {
	            System.out.println("비밀번호 불일치 오류로 인해 종료합니다.");
	            break;
	         }
	         System.out.println(name + "님 환영합니다, 아이디는 " + id + ", 암호화된 " 
	         + "비밀번호는 {" + jt.pwCheck(pw, pwCheck) + "} 입니다");
	         break;
	      }

	      // 아이디 중복검사

	   



}// main
		// 1번 문제 로직구성
		// 배열생성
		// 스캐너 클래스 import
		// for 입력받아오기

	int add(int[] arr) {
		int result = 0;
		for (int data : arr) {
			result += data;
		}

		return result; // 더하기 메소드
	}

	// int add(int[] arr){for-each}
	// 사칙연산 메소드 실행 ...
	int subraction(int[] arr) {
		int max = arr[0] > arr[1] ? arr[0] : arr[1];
		int min = arr[0] > arr[1] ? arr[1] : arr[0];
		return max - min; // 빼기 메소드
	}

	int multiply(int[] arr) {
		return arr[0] * arr[1]; // 곱하기 메소드
	}

	double divied(int[] arr) {
		return (double) arr[0] / arr[1]; // 나누기 메소드
	}

//	2번문제 메소드
	// 연령대 판별 메소드
	String checkAge(int age) {
		if (age > 19) {
			return "성인";
		} else if (age > 12) {
			return "청소년";
		} else
			return "어린이";
	}

	// 버스카드 사용 메소드
//	 * 사용자 지정 method 1. 연령대 판별 String checkAge(int age){ if(age>19){ return "성인";
//	 * }else if(age>12){ return "청소년"; }else{ return "어린이"; } }
//	 *
//	 * 2. 버스카드 사용 메소드 void takeBus(int money, String age){ 상수 생성 (final int CHILD =
//	 * 500; ~ STUDENT = 800; ~ ADULT = 1400;) 변수 생성 (int charge = 0;
//	 *
//	 *
//	 * switch(age){ case "어린이": charge = CHILD; break; ... }
//	 *
//	 * while(true){ if(money - charge > 0 )//돈이 있으면{ syso("버스 탑승 완료."); money -=
//	 * charge; syso("잔액 : "+money); }else{ syso("잔액이 부족합니다."); break; }
	void takeBus(int money, String age) {
		final int CHILD = 500, STUDENT = 800, ADULT = 1400; 
		int cnt = 0;
		int charge = 0;
		switch(age) {
		case "어린이" : charge = CHILD;
		break;
		case "청소년" : charge = STUDENT;
		break;
		case "성인" : charge = ADULT;
		break;
		}
		while(true){
			if(money - charge > 0) {
				System.out.println("버스 탑승 완료.");
			money-=charge;
			cnt ++;
			System.out.println("잔액 : " + money);
			}else {
				System.out.println("총 이용 횟수는 " + cnt + "입니다.");
				System.out.println("잔액이 부족합니다.");
				break;
			}
		}	
	}
	 
	//3번문제 메소드
	// 아이디 중복검사 메소드
	   boolean idCheck(String id) {
	      String[] basicId = { "admin01", "admin02", "admin03" };
	      for (String data : basicId) {
	         if (data.equals(id)) {
	            System.out.println("아이디가 중복됩니다.");
	            return false;
	         }
	      }
	      return true;
	   }

	   // 닉네임 중복검사 메소드
	   boolean nameCheck(String name) {
	      String[] basicName = { "name01", "name02", "name03" }; // 기존 닉네임
	      for (String data : basicName) {
	         if (data.equals(name)) {
	            System.out.println("닉네임이 중복됩니다");
	            return false; // 닉네임 중복
	         }
	      }
	      return true;
	   }

	   // 비밀번호 재확인 메소드
	   String pwCheck(String pw, String pwCheck) {
//	        비밀번호 길이
	      if (pw.length() != pwCheck.length()) {
	         return "false";
	      }

//	        //문자 단위 체크
	      for (int i = 0; i < pw.length(); i++) {
	         if (pw.charAt(i) != pwCheck.charAt(i)) {
	            return "false";
	         }
	      }

//	        //암호화(아스키코드)
	      String encryptionPw = "";
	      for (int i = 0; i < pw.length(); i++) {
	         encryptionPw += ((int) pw.charAt(i)) + ""; // 자동형변환
	      }
	      return encryptionPw;
	      
	   }

	


}// class

//	문제2. 
//
//	★메소드를 활용한 연령대별 버스카드 프로그램★
//
//	연령대를 입력받고(입력)
//	연령대를 판별한다(어린이, 청소년, 성인)(메소드1)
//	버스카드에 일정 금액 돈을 충전한다(입력)
//	버스카드를 사용(메소드2){  // int요금과 String연령대가 들어간다(매개변수 2개)
//	   연령대별 요금을 설정한다(final 변수)
//	   잔액 소진할 때까지 버스카드 사용(반복문)
//	   버스카드를 사용하는동안 "버스 탑승 완료." 출력
//	   "버스를 탑니다. 잔액 : " 출력
//	   잔액이 부족해지면 "잔액이 부족합니다." 출력하고 프로그램 종료(탈출)
//	   }

/*
 * main method 변수 생성 (int age = 0, money = 0; String ageName ="";)
 * 
 * 스캐너 클래스 할당 age = 나이 입력받아오기; money = 돈 입력받아오기; ageName = checkAge(age);
 * takeBus(money, ageName);
 * 
 *
 * 사용자 지정 method 1. 연령대 판별 String checkAge(int age){ if(age>19){ return "성인";
 * }else if(age>12){ return "청소년"; }else{ return "어린이"; } }
 *
 * 2. 버스카드 사용 메소드 void takeBus(int money, String age){ 상수 생성 (final int CHILD =
 * 500; ~ STUDENT = 800; ~ ADULT = 1400;) 변수 생성 (int charge = 0;
 *
 *
 * switch(age){ case "어린이": charge = CHILD; break; ... }
 *
 * while(true){ if(money - charge > 0 )//돈이 있으면{ syso("버스 탑승 완료."); money -=
 * charge; syso("잔액 : "+money); }else{ syso("잔액이 부족합니다."); break; }
 */
//
//	문제3.
//	★메소드 회원가입★(메소드로 코드 분리하기)★
//
//	회원가입(입력 : 아이디, 닉네임, 비번, 비번확인)
//	→ 배열로 임의로 아이디와 닉네임 만들기(배열은 1차원 배열, 값은 각 3개)
//	→ 회원가입 시 배열에 있는 아이디를 사용한다고 하면 중복된다고 알려주기
//	→ 닉네임도 겹치면 알려주기
//	→ 비번은 두번 입력 받아 두개의 비번이 동일해야 하며, 아스키코드로 암호화
//	→ 겹치는거 없고, 비번도 다 맞으면 "회원가입 성공" 후 끝
//	→ 최종출력 "userName님 환영합니다, 아이디는 userId, 비밀번호는 암호화된 {아스키코드값} 입니다"
//	└ 배열, 메소드, for문, if문, 형변환


