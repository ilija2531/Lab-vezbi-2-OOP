package zadaca2;

public class Main {

	public static void main(String[] args) {
		Vraboten object = new Vraboten();
		object.firstName = "Marko ";
		object.lastName = " Ristevski ";
		object.plata = 30000;
		
		System.out.println("Imeto na vraboteniot e: " + object.firstName);
		System.out.println("Prezimeto na vraboteniot e: " + object.lastName);
		System.out.println("Negovata plata iznesuva: " + object.plata + " denari. ");
		

	}

}
