package task;

public class PrintString {

	// 필드
	String str1;

	//생성자
	public PrintString(String str1) {
		super();
		this.str1 = str1;
	}
	
	//메소드
	void printStrInt(String str1) {
		try {
			int num = Integer.parseInt(str1); //드래그해서 try catch 생성
			System.out.println("입력한 문자열 : " + str1 + " 변환한 정수 : " + num);
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닌 문자열이 입력되었습니다"); 
			
		}
		
	}
	
	
}
