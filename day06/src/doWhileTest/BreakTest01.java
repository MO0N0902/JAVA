package doWhileTest;

public class BreakTest01 {
	public static void main(String[] args) {
		//1~10까지 중 5까지만 출력하기
		for(int i = 0; i<10; i++) {
			System.out.println(i+1);
			if(i==5) {
				break;
			}
		}

	//1~10까지중 7까지만 출력
		int num =1;
		while(num<=10) {
			if (num > 7) {
				break;
			}
			System.out.println(num);
			num++;
		}
	
	}


}

