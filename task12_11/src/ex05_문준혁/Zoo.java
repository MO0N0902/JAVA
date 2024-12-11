package ex05_문준혁;

public class Zoo {
	//필드
	Animal[] animal;
	int animalCount;
	
	//생성자
	public Zoo(Animal[] animal) { //배열의 크기를 매개변수로 받는다는 말을 이해하지 못했습니다
									// 이건 배열자체를 매개변수로 받는거아닌가 헷갈립니다.
		this.animal = animal;
	}
	//메소드 
	void addAnimal(Animal animal) { //배열의 크기만큼 동물을 추가
		for(int i = 0; i <this.animal.length; i++) {
			this.animal[i] = animal;
		}System.out.println("더이상 동물을 추가할 수 없습니다");
	}
	void printAllAnimals() {
		for(int i = 0; i <this.animalCount; i++) {
		System.out.println("동물 이름 : " + animal[i].getName());
		animal[i].performActions();
		}
	}
	
	}
	

