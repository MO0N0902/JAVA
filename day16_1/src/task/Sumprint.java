package task;

import java.util.Scanner;

public class Sumprint {
	Scanner sc = new Scanner(System.in);
	//필드
	int num;

	// 생성자
	public Sumprint(int num) {
		super();
		this.num = num;
	}
	
	//메소드
	void sumNum() {
		int sum =0;
		System.out.println("1부터 입력한 수까지 덧셈을 진행합니다");
		try {
			num=sc.nextInt();
			for(int i=1; i<=num; i++) {
				sum +=i;
			}
		} catch (Exception e) {
			System.out.println("정수의 형태로 입력해주세요");
			e.printStackTrace();
		}
		
		
		System.out.println("1부터" + num + "까지의 합은" + sum + "입니다");
		}
	}


