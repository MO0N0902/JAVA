package methodTest;

public class MethodTest01 {
	 //10을 더해주는 메소드 정의
	//1) 기능 => 값에 + 10을 하는 기능
	//2) 리턴타입 => 뭔지모르겠으면 void
	//void
	//void addTen
	//4) 매개변수 생각
//	void addTen(int num){
	//5) 실행할 문장을 생각한다
// int result = num+10;
	//return result
	 int addTen(int num) {
		int result = num+10;
		return result;
	}
	

	
public static void main(String[] args) {
	MethodTest01 mt = new MethodTest01();
	// 메소드 호출
	System.out.println(mt.addTen(5));

}
}
