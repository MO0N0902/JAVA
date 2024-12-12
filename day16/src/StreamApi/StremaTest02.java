package StreamApi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StremaTest02 {
public static void main(String[] args) {
		String[] name = {"짱구", "철수", "훈이", "맹구", "유리"};
		//배열로 스트림 생성
		//Arrays.stream()
		
		Arrays.stream(name).forEach(System.out::println);
	
		
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
		IntStream.rangeClosed(1, 10).forEach(System.out::print);
}
}
