package task;

import java.util.Scanner;

public class PrintStringMain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("문자열을 입력해주세요 : ");
	String str1 = sc.next();
	
	PrintString ps = new PrintString(str1);
	ps.printStrInt(str1);
	
}
}

