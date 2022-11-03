package zadaca6;

public class Proizvod {
	public String ime;
	public int tezina;
	public int cena;
	
	public Proizvod() {
		this.ime = " Chokolado ";
		this.tezina = 100;
		this.cena = 55;
		
		System.out.println("Cenata na " + ime + " so tezina od " +tezina + " g " + " iznesuva " + cena + " denari. ");
	}

}
