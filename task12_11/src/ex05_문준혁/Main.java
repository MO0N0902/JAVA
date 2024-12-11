package ex05_문준혁;

public class Main {
	public static void main(String[] args) {
		Zoo zoo = new Zoo(Animal[] animal = new animal[3]); //배열의 크기를 3으로 해야되는데
		Pet pet = new Pet(); //이름 입력하려면 pet객체 생성해야되는거 아닌가요?
		zoo.addAnimal(pet.getName("고양이"));
		zoo.addAnimal("호랑이");
		zoo.addAnimal("강아지");
		
		zoo.printAllAnimals();
		
	}
}
