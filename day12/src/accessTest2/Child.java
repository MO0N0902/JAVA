package accessTest2;

import accessTest.parent;

public class Child extends parent {
	public void printAcces() {
		System.out.println(publicValue);
		System.out.println(protectedValue);
//		System.out.println(defaultValue);
//		System.out.println(privateValue);
	}
	
}
