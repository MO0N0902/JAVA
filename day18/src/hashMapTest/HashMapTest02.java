package hashMapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public class HashMapTest02 {
	public static void main(String[] args) {
		
//		HashMap<String, Integer> map = new HashMap<>();
		
//		System.out.println(map);
//		map.put("a", 1);
//		map.put("b", 2);
//		map.put("c", 3);
//		map.put("d", 4);
//		System.out.println(map);
//		
//		//key는 중복 불가능, value 중복 가능
//		System.out.println(map.get("d"));
//		
//		System.out.println(map.size());
//		//key값만 모아서 출력
//		System.out.println(map.keySet());
//		
//		//value값만 모아서 출력
//		System.out.println(map.values());
		
		HashMap<String, Integer> mart = new HashMap<>();
		HashMap<String, String> mart2 = new HashMap<>();
		
		mart.put("새우깡", 2200);
		mart.put("빼빼로", 2000);
		mart.put("포카칩", 2500);
		mart.put("양파링", 2000);
//		System.out.println(mart);
		
		mart2.put("새우깡", "12월 16일");
		mart2.put("빼빼로", "12월 18일");
		mart2.put("포카칩", "12월 19일");
		mart2.put("양파링", "12월 20일");
		
//		//검색
//		System.out.println(mart.get("새우깡"));
//		System.out.println(mart.get("양파깡"));
//		
//		//삭제
//		mart.remove("빼빼로");
//		System.out.println(mart);
//		
//		//길이 size
//		System.out.println(mart.size());
//		
		// key에 포함되어있는지 확인
		// value에 포함되어있는지 확인
//		System.out.println(mart.containsKey("포카칩"));
//		System.out.println(mart.containsValue("1000"));
		
		while(mart.containsKey("포카칩")) {
			System.out.println(mart.get("포카칩"));
			break;
		}
	      // Iterator
	      // keySet -> key만 가져오기
//	      System.out.println(mart.keySet());
//	      Iterator<String> iter = mart.keySet().iterator();
//	      while (iter.hasNext()) {
//	         System.out.println(iter.next());
//	      }
//
//	      // values에서 value만 가져오기
//	      System.out.println(mart.values());
//	      Iterator<Integer> iter2 = mart.values().iterator();
//	      System.out.println(iter2);
//	      while (iter2.hasNext()) {
//	         System.out.println(iter2.next());
//	      }

	      // Entry key, value 한쌍씩 가져오기
	      Set<Entry<String, Integer>> items = mart.entrySet();
	      Set<Entry<String, String>> items2 = mart2.entrySet();
//	      System.out.println(items2 + "\t");
//	      System.out.print(items + );
	      
//	     System.out.println("\t과자1 \t\t과자2");
//	      System.out.print("가격 \t");
//	      
//	      for (Entry<String, Integer> entry : items) {
//	         System.out.print(entry+"\t");
//	         
//	      }
//	      System.out.println();
//	      System.out.print("유통기한 \t");
//	    
//	      for (Entry<String, String> entry : items2) {
//	    	  
//		         System.out.print(entry+"\t");
//		         
//		      }
//	      for(int i = 0; i <items.size(); i++) {
//	    	  System.out.println(items.get("포카칩"));
//	      }
		
	}
}
