package exceptionTest02;

public class MyException extends Exception {
	public MyException() {
		super("음수 입력 불가");
	}
}
