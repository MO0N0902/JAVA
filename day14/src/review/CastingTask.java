package review;

public class CastingTask {
	 public static void main(String[] args) {
		printMode(new Ballad());
		printMode(new HipHop());
		printMode(new Rock());
		
		 
	    
	   }
	 static void printMode(Music m) {
		 if(m instanceof Ballad) {
			 m.mode();
			 ((Ballad) m).onlyBallad();
		
		 } else if(m instanceof HipHop) {
			 m.mode();
			 ((HipHop) m).onlyHipHop();
		 } else if(m instanceof Rock) {
			 m.mode();
			 ((Rock) m).onlyRock();
		 }
	 }

}
