package method;

public class StackMethod {
   public static void main(String[] args) {
      StackMethod sm = new StackMethod();
      //1. 메인 메소드 실행 -> 스택영역에 메인 스택프레임이 생성
      // result가 메인 스택 프레임에 저장
      //2. add메소드 호출 -> 스택에 add 스택프레임 생성
      // 매개변수 num1, num2, sum변수가 add스택프레임에 저장됨
      // 3. add메소드 종료 -> add스택 프레임 삭제
      // sum, num1, num2가 메모리에서 제거됨
      // 4. main메소드 종료 -> main스택프레임 삭제
      System.out.println(sm.add(10, 20));
      int result = sm.add(10, 10);
      System.out.println(result);
   }
   
   int add(int num1, int num2) {
      int sum = num1 + num2;   
      return sum;
   }
}