package typeCasting;

public class TypeCasting03 {

	public static void main(String[] args) {
		
		//문자열 => 다른자료형으로 형변환
	      String data1 = "10"; 
	      String data2 = "abc";
	      System.out.println(data1 + 1); //문자열 + 1 => 연결
	      System.out.println(data2);
	      int result = Integer.parseInt(data1);
	      long result2 = Long.parseLong(data1);
	      double result3 = Double.parseDouble(data1); //10.0
	      float result4 = Float.parseFloat(data1); //10.0
	      char result5 = "abc".charAt(0);
	      boolean result6 = Boolean.parseBoolean("false");
	      //parseBoolean() 메소드는 문자열을 boolean 값 변환한다
	      //문자열이 true이면 true를 반환하고 그렇지 않으면 false를 반환한다
	      System.out.println(result + 1); //정수 + 1 => 덧셈연산
	      System.out.println(result2 + 1); //정수 + 1 => 덧셈연산
	      System.out.println(result3); //
	      System.out.println(result4);
	      System.out.println(result5);
	      System.out.println(result6);
	      
	      //다른 자료형 => 문자열로 변환
	      int num = 10;
	      double num2 = 10.5;
	      char num3 = 'a';
	      boolean num4 = true;
	      
	      System.out.println(num + "입니다");
	      String data = 10 + "";
	      System.out.println(data + 1);
	}

}
