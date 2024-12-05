package method;

public class VarArgs {
public static void main(String[] args) {
	VarArgs va = new VarArgs();
	System.out.println(va);
	va.printNumbers(1,2,3);
	va.printNumbers(1,2,3,4,5);
	va.printNumbers(1,2,3);
	
}
void printNumbers(int ... numbers) {
	System.out.println(numbers);
	for(int num : numbers) {0
		System.out.println(num + "");
	}
	System.out.println();
}
}
