package Exercise1_5;

public class TestMain {
	public static void main(String[] args) {
		Animal animal1 = new Animal("Bun");
		System.out.println(animal1.toString());
		
		Mammal mam1 = new Mammal("Bun");
		System.out.println(mam1.toString());
		
		Cat cat1 = new Cat("Bon");
		System.out.println(cat1.toString());
		
		Dog dog1 = new Dog("Bin");
		System.out.println(dog1.toString());
	}
}
