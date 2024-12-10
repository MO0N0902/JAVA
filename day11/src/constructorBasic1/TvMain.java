package constructorBasic1;

public class TvMain {
public static void main(String[] args) {
	 Tv myTv1 = new Tv(false, 0, 0, null, null);
     Tv myTv2 = new Tv();
     
     //필드 초기화
     myTv1.brand = "LG";
     myTv1.color = "black";
     myTv1.ch = 10; //초기채널
     myTv1.vol = 5; //초기볼륨
     
    
     
     myTv2.brand = "SAMSUNG";
     myTv2.color = "black";
     myTv2.ch = 10; //초기채널
     myTv2.vol = 5; //초기볼륨
     
     System.out.println(myTv1 +" TV를 조작합니다");
     System.out.println(myTv1.power);
//     myTv1.powerOnOff();
//     myTv1.  
}
}
