package objectTest;

public class EqaulsTest {
public static void main(String[] args) {
	Person p1 = new Person("철수",22);
	Person p2 = new Person("영희",20);
	Person p3 = new Person("철수",20);
	
	System.out.println(p1);
	System.out.println(p2);

	
//	System.out.println(p1==p2);
//	System.out.println(p1==p3);
//	System.out.println(p1.equals(p2));
	System.out.println(p1.equals(p3));
	
	
}
}
