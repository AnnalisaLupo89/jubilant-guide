package Giorno7;

public class Audiolibro extends Book1 {

	String durataMinuti;
	
	Audiolibro(String titolo, String autore, String durataMinuti) {
		super(titolo, autore);
		this.durataMinuti=durataMinuti;
		
	}
	
	public String getDurata() {
		return durataMinuti;
}
	public String toString() {
		return super.toString()  + ", Durata: "+durataMinuti;
	}
}
