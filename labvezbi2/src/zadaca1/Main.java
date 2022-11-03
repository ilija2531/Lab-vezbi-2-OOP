package zadaca1;

public class Main {

	public static void main(String[] args) {
		
		Student object1 = new Student();
		object1.firstName = "Ilija ";
		object1.lastName = " Bogdanovski ";
		object1.index = 902;
		
		System.out.println("Podatoci za prv objekt: ");
		System.out.println(object1.firstName + " " + object1.lastName + " " + object1.index);
		
		Student object2 = new Student ("Petar ", "Petrovski ", 777);
		
		System.out.println("Podatoci za vtor objekt: ");
		System.out.println(object2.firstName + " " + object2.lastName + " " + object2.index);

	}

}
