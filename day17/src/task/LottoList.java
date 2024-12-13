package task;

import java.util.ArrayList;
import java.util.Random;

public class LottoList {
public static void main(String[] args) {
	//ArrayList, HashSat을 사용하여 중복을 허용하지 않는 6개의 랜덤숫자를 저장
	//Random 클래스를 이요하여 1부터 45사이의 랜덤 숫자를 생성
	// 정렬해서 출력
	
	//로직구성
	//ArrayList로 객체 생성하여 List 선언
	// for문 사용해서 list에 1-45의값 넣어주기
	// 램덤클래스 이용해서 6개의 숫자 뽑기
	// sort이용해서 정렬후 출력
	
	ArrayList<Integer> al = new ArrayList<>();
	for(int i =1; i<46; i++) {
		al.add(i);
	}
	System.out.println(al);
	
	
}
}
