package interfaceTest3;

public class CalculImpl implements Calculator{
	public static void main(String[] args) {
		CalculImpl cal = new CalculImpl();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.add(-10, 20));
		
	}
	

}
