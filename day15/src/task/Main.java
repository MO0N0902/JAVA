package task;

public class Main {
	   public static void main(String[] args) {
//		   FunctionalInter3 fi3 = new FunctionalInter3() {
//			@Override
//			public int mul(int num1, int num2) {
//				return num1*num2;
//			}
//		   };
		   //람다식으로 줄이면
		   FunctionalInter3 fi3 = (num1, num2) ->num1*num2;
		   System.out.println(fi3.mul(3, 5));
		   FunctionalInter4 fi4 = (str1, str2) -> str1+str2;
		   System.out.println(fi4.combineString("문", "준혁"));
		   }
		   
	   }


