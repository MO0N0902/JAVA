package classBasic2;

//3. 클래스 특징
public class StudentMain {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name ="짱구";
		st1.age = 5;
		st1.gpa = 4.5;
		System.out.println("이름 : " + st1.name);
		System.out.println("나이 : " + st1.age);
		System.out.println("학점 : " + st1.gpa);
	}
}
