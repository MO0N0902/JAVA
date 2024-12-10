package abstractTest2;

public class AnimalMain {
	public static void main(String[] args) {
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		System.out.println(animal1);
		System.out.println(animal2);
		
		animal1.crying();
		animal2.crying();
	}
}
