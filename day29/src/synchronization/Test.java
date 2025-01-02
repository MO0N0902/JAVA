package synchronization;

public class Test implements Runnable {
   // 필드
   private int number;

   // 생성자
   public Test() {
      super();
      this.number = 10;
   }

   @Override
   public void run() {
      for (int i = 0; i < 5; i++) {
         try {
            Thread.sleep(500);
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }

   // 메소드
   public void sub(int number) {
      String name = Thread.currentThread().getName();
      this.number -= number;
      System.out.println(name + " : -" + number);
      System.out.println("현재 number : " + this.number);
   }

}
