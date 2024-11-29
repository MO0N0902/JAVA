package print;

public class PrintTask {

	public static void main(String[] args) {
		
			//1. 프린트f를 사용해 형식에 맞게 출력하기
			//이름 : 본인이름
			//나이 : 본인나이
			//취미 : 취미
			//키 : 실수형 2자리까지
			//몸무게 :  실수형 3자리까지
		String name = "문준혁";
		String hobby = "탁구";
		double height =  168;
		double weight = 59;
		int age = 28;
		System.out.printf("이름 : %s\n나이 : %d\n취미 : %s\n키 : %.2f\n몸무게: %.3f", name, age, hobby, height, weight);
		
		System.out.println("\n========================");

			//2. 10진수의 값 255를 8진수, 16진수, 10진수로 각각 출력하기
		System.out.printf("\n8진수 : %o", 255);
		System.out.printf("\n16진수 : %x", 255);
		System.out.printf("\n10진수 : %d", 255);
		
			//3. 상품정보를 println과 printf를 사용하여 아래 형식으로 출력하기
			// 각 자리수는 5자리로 정렬, tab가 2번 사용
		
//      -------------------------
//      상품명         가격
//      -------------------------
//      메로나         1500원
//      누네띠네       1200원
//      꼬북칩         2000원
//      초코파이       3000원
//      -------------------------
		String PN = "상품명";
		String PN1 = "메로나";
		String PN2 = "누네띠네";
		String PN3 = "꼬북칩";
		String PN4 = "초고파이";
		String price = "가격";
		
		
		System.out.println("\n=======================");
		System.out.printf("%-5s \t\t %-5s", PN, price);
		System.out.println("\n=======================");
		System.out.printf("\n%-5s \t\t %-5d원", PN1, 1500);
		System.out.printf("\n%-5s \t\t %-5d원", PN2, 1200);
		System.out.printf("\n%-5s \t\t %-5d원", PN3, 2000);
		System.out.printf("\n%-5s \t\t %-5d원", PN4, 3000);
		System.out.println("\n=======================");
		
		//4. 봄여름가을겨울을 아래와 같이 출력하기
	      //출력문 1번으로 아래와 같이 출력하기
	      System.out.println("봄\n\t\t여름\n\t가을\n\t\t겨울");
	      
	}

}
