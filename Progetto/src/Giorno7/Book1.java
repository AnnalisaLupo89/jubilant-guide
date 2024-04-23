package Giorno7;



	public class Book1 {

		//attributi della classe Book
		
		
		String titolo;
		String autore;
		
		
		Book1(String titolo, String autore){ //costruttore della classe Book, 3 parametri
			
			//assegno i parametri agli attributi
			
			this.titolo=titolo;
			this.autore=autore;
		}
			
			public String getTitolo () {
				return titolo;
			}
			public String getAutore() {
				return autore;
			}
			
			public String toString() {
				return "Titolo: " + titolo + ", Autore: " + autore;
			}
		
		}

		

