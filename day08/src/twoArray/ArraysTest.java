package twoArray;

import java.util.Arrays;

//7. Arrays.sort를 이용한 정렬
public class ArraysTest {
public static void main(String[] args) {
	int[] number = {5,2,9,1,6};
	System.out.println("정렬전 : " + Arrays.toString(number));
	
	Arrays.sort(number,0,3); //부분정렬 1~3까지 인덱스 정렬
	
	System.out.println("정렬후 : " + Arrays.toString(number));
}
}
