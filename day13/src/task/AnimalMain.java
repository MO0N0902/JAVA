package task;

public class AnimalMain {
   public static void main(String[] args) {
		Animal a = new Animal();
	   	Dog d = new Dog();
		Cat c = new Cat();
		Mouse m = new Mouse();
		
	printCrying(m);
	printCrying(a);
	printCrying(d);
	printCrying(c);
	
	 Cat cat = new Cat();
     printCrying(cat); //객체 생성후 출력도 가능하지만
     
     printCrying(new Dog()); // 객체생성과 호출을 한번에 할 수 있다/

     Animal[] ani = { new Cat(), new Dog(), new Mouse() };
     System.out.println(ani);
     System.out.println(ani[0]);

     // 공통메소드 호출 다운 캐스팅으로 고유 메소드 호출
     for (Animal animal : ani) {
        printCrying(animal);
     }
     


	
		

//   Animal 클래스
//   부모클래스
//   필드: 없음
//   메소드: cry() (소리를 출력)
//   
//   Cat 클래스
//   부모클래스를 상속받는 자식클래스
//   필드: 없음
//   메소드: cry() 오버라이딩 (고양이 소리를 출력)
//      play() 스크래치 놀이를 합니다 출력
//      
//   Dog 클래스
//   부모클래스를 상속받는 자식클래스
//   필드: 없음
//   메소드: cry() 오버라이딩 (개 소리를 출력)
//      walk() 산책을 갑니다 출력
//   
//   Mouse 클래스
//   부모클래스를 상속받는 자식클래스
//   필드: 없음
//   메소드: cry() 오버라이딩 (쥐 소리를 출력)
//      sleep() 고양이를 피해 잠을 잡니다 출력
//      
//   AnimalMain 클래스
//   Animal 클래스의 객체 생성
//   각 클래스의 객체 생성
//   메소드 : main메소드
//   printCrying(Animal animal)메소드   
//      (조건문으로 instanceof 사용해서 해당 하는 것에 맞는 객체의 메소드가 사용되도록 진행-다운캐스팅 이용)
//   
//   (각 객체를 넣었을 때 결과 출력-어떤과정이 진행되었는지 주석달아 작성)

   }
   
//   Animal a = new Dog();
   
   static void printCrying(Animal a) {
	  if(a instanceof Dog){
		  a.cry();
		  ((Dog) a).walk();
	  }else if(a instanceof Cat) {
		  a.cry();
		  ((Cat) a).play();
	  }else if(a instanceof Mouse) {
		  a.cry();
		  ((Mouse) a).sleep();
	  }
   }
   
////   void printCrying(Animal a) {
//	   if(a instanceof Dog) {
//		   ((dog)a).cry();
//	   }
//   }
}
