package inherianceConstructor2;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
public static void main(String[] args) {
	Car c1 =new Car();
	Car c2 = new Car("기아","black", 10000);
	System.out.println(c1);
	System.out.println(c2);
	
	c1.brand = "현대";
	System.out.println(c1.brand);
	System.out.println(c2.brand);
	
	SuperCar sc1 = new SuperCar();
	SuperCar sc2 = new SuperCar("bmw","남색",30000,true);
	
	System.out.println(sc1.brand);
	System.out.println(sc2.brand);
	
}
}
