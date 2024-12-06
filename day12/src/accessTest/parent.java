package accessTest;

public class parent {
// 필드
	//접근제한 타입변수
	public String publicValue = "public";
	protected String protectedValue = "protected";
	String defaultValue = "default";
	private String privateValue = "private";
	
	//메소드
	public void printAccess() {
		System.out.println(publicValue);
		System.out.println(protectedValue);
		System.out.println(defaultValue);
		System.out.println(privateValue);
	}
	public static void main(String[] args) {
		parent p = new parent();
		p.printAccess();
	}
	
	
}
class SamePackage{
	public void printAccess() {
		parent p = new parent();
		System.out.println();
		
	}

}