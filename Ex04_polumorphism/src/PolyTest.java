
public class PolyTest {
	
	public static void makeSoundTest(Animal animal){
		animal.makeSound();
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Animal animal = new Animal();
		
		makeSoundTest(cat);
		makeSoundTest(dog);
		makeSoundTest(animal);
	}

}
