package ex03_문준혁;

public class Stars1 {
public static void main(String[] args) {
	int height = 2;
	for(int i=0; i<=height; i++) {
		for(int j=0; j<height-i; j++) {
		System.out.print(" ");	
		}
		for(int j = 0; j<i+1; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
