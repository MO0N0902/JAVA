package task;

public class SumprintMain {
public static void main(String[] args) {
	Sumprint sp = new Sumprint(0);
	
	try {
		sp.sumNum(7);
	} catch (SumException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
