package zadaca5;

public class Predmet {
	// deklariranje na javni atributi
	public String imenapredmet;
	public String profesor;
	public int krediti;
	public String semestar;
	
	//default konstruktor
	public Predmet() {
		
	}
	
	//dinamicki konstruktor, prima ime na predmetot
	public Predmet(String imenapredmet) {
		this.imenapredmet = imenapredmet;
		
	}
	//dinamicki konstruktor koj prima tri argumenti
	public Predmet(String imenapredmet, String profesor, int krediti){
		this.imenapredmet = imenapredmet;
		this.profesor = profesor;
		this.krediti = krediti;
		
	}
		
	

}
