package accessTest2;

import accessTest.parent;

public class OuterClass {
	public void printAccess() {
		parent p = new parent();
		System.out.println(p.publicValue);
		
	}
}
