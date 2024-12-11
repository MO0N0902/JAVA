package ex02_문준혁;

public class Print {
public static void main(String[] args) {
	//15부터 30까지 합 (while)사용
	//***짝수인걸 못봤습니다ㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜ********
	//while이 num<=30까지 반복
	//sum +=num;
	//num++;
	//
	int num = 15;
	int sum = 0;
	while(num<=30) {
		if(num%2 == 0) {
		sum += num; //짝수만뽑아서 sum에 대입...
		}
		num++;
	}
	System.out.println(sum);
}
}
