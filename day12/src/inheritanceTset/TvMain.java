package inheritanceTset;

public class TvMain {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		System.out.println(tv1);
		tv1.powerOnOff();
		
		Tv2 tv2 = new Tv2();
		System.out.println(tv2);
		tv2.nexflix();
		tv2.chDown();
	}


}
