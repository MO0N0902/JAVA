package review;

enum Oper{
	PLUS("+"){
		public int apply(int num1, int num2) {return num1+num2;}
	},
	MINUS("-"){
		public int appply(int num1, int num2) {return num1-num2;}
	};
	private final String symbol;
	
	Oper(String symbol){
		this.symbol = symbol;
	}
	
}

public class LambdaMain {

}
