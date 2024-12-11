package ex02_문준혁;

public class Print {
public static void main(String[] args) {
	//15부터 30까지 합 (while)사용
	//while이 num<=30까지 반복
	//sum +=num;
	//num++;
	//
	int num = 15;
	int sum = 0;
	while(num<=30) {
		sum += num;
		num++;
	}
	System.out.println(sum);
}
}
