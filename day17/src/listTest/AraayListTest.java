package listTest;

import java.util.ArrayList;

public class AraayListTest {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	
	System.out.println(al);
	System.out.println(al.toString());
	
	//요소추가 add
	al.add(1);
	al.add(2);
	System.out.println(al);
	al.add(0.5);
	System.out.println(al);
	al.add(1);
	System.out.println(al);
	
	//ArrayList의 크기를 반복하여 요소 출력
	for(int i =0; i<al.size(); i++) {
		System.out.println(i + ":" + al.get(i));
	}
	
	ArrayList<Integer>al2 = new ArrayList<Integer>();
	for(int i = 0; i < 10; i ++) {
		al2.add((10-i)*10);
	}
	System.out.println(al2);
	System.out.println();
	
	
	for(int data : al2) {
		System.out.println(data);
	}
	
}
}
