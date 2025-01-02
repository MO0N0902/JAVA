package teamTask02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {

	

	public static void main(String[] args) {
		// ID를 저장할 arrayList 생성
		List<String> ID = new ArrayList<>();
		ID.add("1");
		ID.add("2");
		ID.add("3");

		// map에 사원 이름 등록 (w. key값)
		Idname.put("1", "문준혁");
		Idname.put("2", "임초현");
		Idname.put("3", "황어진");

		// map에 사원 나이 등록 (w. key값)
		IdAge.put("1", 27);
		IdAge.put("2", 22);
		IdAge.put("3", 27);

		// map에 사원 부서 등록 (w. key값)
		Iddepart.put("1", "개발");
		Iddepart.put("2", "개발");
		Iddepart.put("3", "보안");

		// 사원정보 출력
		printInfo();
		System.out.println();
		

		// 전체 사원 연봉 입력
		Employee.addPay3(ID);
		System.out.println(IdPay); // 연봉 출력
		System.out.println();

		//연봉입력후 사원정보 출력
		printInfo();
		System.out.println();
		
		System.out.println();
		TeamLeader("2");
		

		
	}
	// 나이, 이름, 부서, 연봉을 저장할 hashMap 생성

	private static HashMap<String, Integer> IdAge = new HashMap<>();
	private static HashMap<String, String> Idname = new HashMap<>();
	private static HashMap<String, String> Iddepart = new HashMap<>();
	private static HashMap<String, Integer> IdPay = new HashMap<>();

	// 연봉 3000추가 메소드
	public static void addPay3(List<String> id) {
		// arrayList에 있는 ID 수만큼 개개인에게 연봉 3000씩 입력
		for (int i = 0; i < id.size(); i++) {
			IdPay.put(id.get(i) + "", 3000);
		}
		System.out.println("");
	}

	// 팀장만 호출 메소드
	public static void TeamLeader(String Keynum) {
		if (Idname.containsKey("2")) {
			System.out.println("팀장 개인 정보");
			System.out.println("이름 : " + Idname.get("2"));
			System.out.println("나이 : " + IdAge.get("2"));
			System.out.println("부서 : " + Iddepart.get("2"));
		}
	}
	//전 사원 정보 출력 메소드
	public static void printInfo() {
		// 이름, 나이, 부서 출력을 위한 entry 생성
		Set<Entry<String, String>> items1 = Idname.entrySet();
		Set<Entry<String, Integer>> items2 = IdAge.entrySet();
		Set<Entry<String, String>> items3 = Iddepart.entrySet();
		Set<Entry<String, Integer>> items4 = IdPay.entrySet();

		System.out.println("\t사원1 \t 사원2 \t 사원3");
		System.out.print("이름 \t");
		// 사원id와 이름출력
		for (Entry<String, String> entry : items1) {
			System.out.print(entry + "\t");
		}
		System.out.println();
		// 사원id와 부서 출력
		System.out.print("부서 \t");
		for (Entry<String, String> entry : items3) {
			System.out.print(entry + "\t");
		}
		System.out.println();
		// 사원 id와 나이출력
		System.out.print("나이 \t");
		for (Entry<String, Integer> entry : items2) {
			System.out.print(entry + "\t");
		}
		System.out.println();
		//사원id와 연봉출력
		System.out.print("연봉 \t");
		for (Entry<String, Integer> entry : items4) {
			System.out.print(entry + "\t");
		}
	}
}
