package task;

public class ForTask01 {
	public static void main(String[] args) {
		// 1. 1 ~ 100까지 출력 tab키만큼 간격 띄우고 10마다 줄바꿈
		// 1 2 3 4 5 6 7 8 9 10
		// 11 12 13.. 20
		// 21 22 ........ 30
		// 91 ... 100

		// for 외부문 작성 for(i = 1; i <=100 i++){}
//	   for(int i = 1; i <= 100; i++) {
//		   if(i%10 == 1) {
//			   System.out.println(); // 10으로 나눴을때 나머지가 1이되면 줄바꿈
//		   }
//	   System.out.printf("%d\t",i); //tab키 간격으로 i출력
//	   }
//	   //	10마다 줄바꿈 if문으로 작성
//	   
//	   // 출력문 작성 pritf("%d \t",i)

		// 2. A~F출력
//      int a = 'A';
//      for(int i  = 65; i <75; i++) {//A~F의 아스키코드 번호 확인후 i 범위 설정
//    	  char A = (char)i; //i를 char형태로 형변환 
//      }
//      System.out.print(i);// 출력문
//     
		// 3. aBcDeFgHiJkLmNoPqRsTuVwXyZ 출력
//      for(int i =97; (i <123 && i%2 == 1); i++) {
//    	  

//    	  }

		// 4.1) 1부터 100까지 숫자 중 3의 배수 또는 5의 배수만 한 줄에 5개씩 띄어쓰기로 구분되도록 출력
		//
//      for(int i = 1; i <=100; i++) { //i가 1부터 100까지 하나씩 늘어나느 for문 작성
//    	if (i %3 ==0 || i%5 == 0) { // if문 활용해서 3과 5의 배수일때만 출력하도록 설정
//    		System.out.printf("%d ",i); // 띄어쓰기는 성공했지만 한줄에 5개 설정이 안됨
//    	}  
//    	
//      }
//      }
//    	   

		// 2) 5의 배수 또는 5의 배수 숫자들의 합을 구하기
//		int sum = 0;
//		int sumx = 0;
//		for (int i = 1; i <= 100; i++) { // i가 1부터 100까지 하나씩 늘어나느 for문 작성
//			if (i % 3 == 0 || i % 5 == 0) { // if문 활용해서 3과 5의 배수인것만 선택되도록 설정
//				sum = +i; // 통과한 값을 sum에 더함
//			} else
//				sumx = +i; // 그외의 값은 sumxㅇ에 더함
//		}
//		System.out.println(sum); // sum 출력
	}
}
