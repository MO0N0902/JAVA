package task;

import java.util.Scanner;

public class Task01 {
   public static void main(String[] args) {
      
//      1. 한개의 정수를 입력받아 짝수인지 홀수인지 출력하기
//      입력 : 8
//      출력 : 짝수입니다
      //삼항연산자 사용
     Scanner sc = new Scanner (System.in);//스캐너 클래스 import
//      int num = 0;//입력받을 변수 저장
//      String result ="";//결과값 변수 저장
//      System.out.println("한개의 정수를 입력하세요");//입력문 작성
//      num = sc.nextInt();//입력받은값 저장
//       result = num % 2 == 0 ? "짝수입니다" : "홀수입니다";//2로 나눴을때 나머지가 0이라면 "짝수" 출력 나머지가 0이 아니라면 "홀수"출력
//      System.out.println(result);
      
      //if문 사용
      
//      int num1 = 0;
//      System.out.println("한개의 정수를 입력하세요");//입력문
//      num1 = sc.nextInt();
//      if (num1%2==0) {
//      System.out.println("짝수입니다");
//   }else {
//      System.out.println("홀수입니다");
//   }
//      
      
//
//      2. 한개의 정수를 입력받아 양수, 음수, 0인지 출력하기
//      입력 : -5
//      출력 : 음수입니다
//
//      입력 : 100
//      출력 : 양수입니다
//
//      입력 : 0
//      출력 : 0입니다
      
      //삼항연산자 사용
//      int num2 = 0;//변수 저장
//      String result1 = "";
//      System.out.println("한개의 정수를 입력하세요");
//      num2 = sc.nextInt();
//      result1 = num2 > 0? "양수입니다" : num2 < 0? "음수입니다" : "0입니다" ;
//      System.out.println("입력한 정수는" + result1);
      
      
      //if문 사용
//      int num2 = 0; // 변수생성
//      System.out.println("하나의 정수를 입력하세요"); //입력문 작성
//      num2 = sc.nextInt(); //입력한 정수를 num2에 저장
//      if (num2 >0) { 
//         System.out.println("양수입니다"); //num2가 0보다 크다면 양수입니다 출력
//      }else if (num2 < 0){
//         System.out.println("음수입니다");//num2가 0보다 작다면 음수입니다 출력
//      }else {
//         System.out.println("0입니다");//둘다 아니라면 0입니다 출력
//      }
      
//
//      3. 나이를 입력받아 다음 기준으로 출력하기
//         0~12: 어린이
//         13~19: 청소년
//         20 이상: 성인
//
//      나이입력 : 16
//      청소년입니다
      
      //삼항연산자 사용
//      int age = 0; //나이변수 저장
//      String result3 = ""; //결과값 저장
//      System.out.println("나이를 입력해주세요"); //입력문 작성
//      age = sc.nextInt(); //입력한 숫자를 나이로 저장
//      result3 = age > 19 ? "성인입니다" : (age <20 && age>12)? "청소년입니다" : "어린이 입니다";
////      19세 초과는 성인으로 12보다 높고 20보다 적은건 청소년 그외는 어린이로 분류
//      System.out.println(result3);
     
     // if문 사용
//        int age = 0;
//        System.out.println("나이를 입력해 주세요");
//        age = sc.nextInt();
//        if (age > 19) {
//           System.out.println("성인입니다");
//        }else if(age < 13) {
//           System.out.println("어린이입니다");
//        }else {
//           System.out.println("청소년입니다");
//        }
        
           
//      4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기(단, 삼항연산자만 이용할 것)
//         입력 : 5 1 9
//         출력 : 1 5 9
     
     System.out.println("첫번쩨 정수를 입력해주세요");
     int num1 = sc.nextInt();
     System.out.println("두번쩨 정수를 입력해주세요");
     int num2 = sc.nextInt();
     System.out.println("세번쩨 정수를 입력해주세요");
     int num3 = sc.nextInt();
     
     int max = num1>num2 ? (num1>num3? num1 : num3) : (num2>num3? num2 : num3);
     int min = num1<num2 ? (num1<num3? num1 : num3) : (num2<num3? num2 : num3);
     int mid = (num1+num2+num3) -(max + min);
     
     System.out.println("입력 : " + num1 + " "+ num2 + " "+ num3);
     System.out.println("출력 : " + min +" "+ mid +" "+ max);
     
     //변수 3개 만들어
//     int num4, num5, num6 = 0;
//     String result4 = "";
//     //입력문
//     System.out.println("서로다른 세개의 정수를 입력해주세요");
//     //입력값 저장
//     num4 = sc.nextInt();
//     num5 = sc.nextInt();
//     num6 = sc.nextInt();
//     result4 = num4 <num5 <num6 ? "출력 :" + num4 + num5 + num6 :
//              num4 <num6 <num5 ? "출력 :" + num4 + num6 + num5 :
//              num5 < num4 < num6 ? "출력 :" +num5 + num4 + num6 :
//              num5 < num6 < num5 ? "출력 :" +num5 + num6 + num5 :
//              num6 < num4 < num5 ? "출력 :" +num6 + num4 + num5 : "출력 :" + num6 +num5 +num4;
     //
//
//      5. 사용자로부터 문자열을 입력받고 "X"만 입력했을 경우에만 종료 메시지를 출력하고 그 외에는 입력한 문자열을 출력하기
//      //while문 사용
        //문자열 변수 만들기
//        String answer = "";
//        //입력문
//        System.out.println("문자열 입력(X를 입력하면 프로그램 종료)");
//        //입력한 문자 저장
//        answer = sc.next();
//        while(answer != "x") {
//           System.out.println(answer);
//           System.out.println("문자열 입력(X를 입력하면 프로그램 종료)");
//           answer = sc.next();
//        }
//           System.out.println("프로그램 종료");
//           sc.close();
//           
           
//
//      6. 사용자가 입력한 숫자에 해당하는 구구단을 출력하기
//     int choice = 0; //선택할 숫자 변수 만들기
//     while(choice !=10) {
//    	 System.out.println("원하는 숫자의 구구단이 나타납니다");
//    	 choice = sc.nextInt();
//    		
//    		 for(int i = 1; i <10; i++) {
//    		 System.out.printf("%d x %d = %d\n",choice,i, (choice*i));
//    		 }
//    		 
//    	 }
    	 
    	 
     
   
     
//      단을 입력하세요 : 3단
//      출력
//      3 x 1 = 3
//      3 x 2 = 6
//      ...
//      3 x 9 = 27
//
//
//      7. ATM 메뉴에서 입금, 출금, 잔액 조회를 구현하세요.
//    
     
//     int menu = 0, money=10000, charge = 0, Withdrawal = 0;//메뉴 입력 변수와 잔액 변수 생성
//     while(menu !=4) {
//        System.out.printf("\nATM 메뉴의 번호를 선택하세요 : \n1. 잔액조회 \n2. 입금\n3. 출금\n4. 종료 \n선택 : ");
//        menu = sc.nextInt();
//        switch(menu){
//        case 1 :
//           System.out.println("잔액은" + (money + charge - Withdrawal) + "입니다");
//           break;
//        // 문제점 및 해결방법
//           // 문제점 : 입금을 하고 잔액을 조회했을때 금액이 초기금액과 동일함
//           //해결방법 : 잔액을 잔액에 입금액을 더한것과 출금액을 뺀것으로 설정함
//        case 2 : 
//           System.out.println("얼마를 입금하시겠습니까?");
//           charge = sc.nextInt();
//           if(charge > 0) {
//              System.out.println("잔액은" + (money + charge - Withdrawal) + "입니다.");
//              break;
//           }else {
//              System.out.println("입금 실패했습니다.");
//              break;
//           } 
//           
//        case 3 :
//           System.out.println("얼마를 출금하시겠습니까?");
//           Withdrawal =sc.nextInt();
//           if(Withdrawal <= money) {
//              System.out.println(Withdrawal + "원 출금했습니다. " +"잔액은" +(money + charge - Withdrawal) +"입니다.");
//              break;
//           }else {
//              System.out.println("잔액이 부족합니다.");
//              break;
//           }
//           
//           default :
//              break;
//           
//           }
//        }
//     System.out.println("프로그램 종료");
//     sc.close();
     }
 //4번을 입력하기 전까지 꺼지지 않기위해서 while 문으로 시작
     //case문으로 각 숫자를 입력하면 해당 메뉴로 이동
     //case1 잔액조회 메뉴의 경우 초기잔액 출력과 입금메뉴에서 추가된 금액을 더하기
     //case2 입금과 같은경우 얼마를 입금하는지에대한 입력문과 입금한 금액을 잔액에 더하기
     //case3 출금은 얼마를 출금할건지에 대한 입력문과 출금한 금액을 잔액에서 빼기
     //case4 종료
     //default 5이상의 숫자를 입력했을때 올바른 메뉴 선택 메세지 출력
     
     
     
//      [조건]
//      초기 잔액은 10000원으로 설정
//      메뉴에서 선택에 따라 작업 수행
//      종료 시 프로그램 종료
//
//      String msg =  "\nATM 메뉴의 번호를 선택하세요 : "
//                  + "1. 잔액 조회"
//                  + "2. 입금"
//                  + "3. 출금"
//                  + "4. 종료"
//                  + "선택 : ");


   
}

