package objectTest;

public class UserMain {
public static void main(String[] args) {
	User user1 = new User(1, "짱구");
	User user2 = new User(1, "짱구");
	System.out.println(user1.hashCode());
	System.out.println(user2.hashCode());
	
	System.out.println(user1);
	System.out.println(user1.equals(user2));
	
	
}
}