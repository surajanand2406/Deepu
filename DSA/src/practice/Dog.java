package practice;

public class Dog extends Animal {
	
	public void eat() {
		System.out.println("Dog eat");
	}

	public static void main(String[] args) throws Exception {
		Animal a = new Dog();
		Dog d = new Dog();
		
		a.eat();
		d.eat();
		

	}

}
