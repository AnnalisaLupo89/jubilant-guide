package Giorno7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;


	public class Biblioteca{ //classe Biblioteca
		
		HashMap<String,Book1> biblioMap	= new HashMap<>();
		String catalogo = "catalogo.txt";
		
		
	public void leggiCatalogo() {
				
			
			try {
			BufferedReader br = new BufferedReader(new FileReader(catalogo));
			String tomo; //riga letta in catalogo.txt
			while((tomo = br.readLine()) != null) { //loop per leggere tutto il txt
				String [] libri = tomo.split(","); //array per storare i "pezzetti" di tomo
				//System.out.println(tomo);
				if(libri.length==3) {
					
				biblioMap.put(libri[0].trim(), (new Book1(libri[1].trim(), libri[2].trim()))); //(id, (titolo, autore))
			
			
			}else if(libri.length==4){
				biblioMap.put(libri[0].trim(), (new Audiolibro(libri[1].trim(), libri[2].trim(), libri[3].trim())));
			}	
				
			}
			 br.close();
			
			} catch (IOException e) {
				e.printStackTrace();
				
			}
			
	}		
	
	public void stampaCatalogo() {
		for (Entry<String, Book1> entry : biblioMap.entrySet()) { //for each per hashmap 
			
			
			System.out.println(entry.toString());
		
	
			 }
	}

	
		public void salva() {
			
			try {
				
				BufferedWriter bw = new BufferedWriter(new FileWriter(catalogo));
				
					
			for (Entry<String, Book1> entry : biblioMap.entrySet()) {
				
	
				try {
					bw.write(entry.getKey()+", "+entry.getValue().getTitolo()+", "+ entry.getValue().getAutore()+", "+((Audiolibro) entry.getValue()).getDurata());
					bw.newLine();
				}
				catch (Exception e) {
					bw.write(entry.getKey()+", "+entry.getValue().getTitolo()+", "+ entry.getValue().getAutore());
					bw.newLine();
				}
			
			}
			bw.close();
			//System.out.println("HO SCRITTO");
			
			}catch(IOException e) {
				e.printStackTrace();
				 
			}
			
			
		}
		
		public void addBook(String a, String b, String c, String d) {
			biblioMap.put(a,(new Audiolibro (b, c, d)));
			//System.out.println("Aggiunto audiolibro");
			salva();
			
		}
		
		public void addBook(String a, String b, String c) {	
			
		
			biblioMap.put(a, (new Book1(b, c))); 
		
			//System.out.println("Aggiunto libro");
			salva();
		
			
		}
		
		public void deleteBook(String a) {	
			
			
			biblioMap.remove(a); 
		
			
			salva();		
			
		}
		
	public void leggiCatalogo2(String cata2) {
				
			
			try {
			BufferedReader br = new BufferedReader(new FileReader(cata2));
			String tomo; //riga letta in catalogo.txt
			while((tomo = br.readLine()) != null) { //loop per leggere tutto il txt
				String [] libri = tomo.split(","); //array per storare i "pezzetti" di tomo
				//System.out.println(tomo);
				if(libri.length==3) {
					
				biblioMap.put(libri[0].trim(), (new Book1(libri[1].trim(), libri[2].trim()))); //(id, (titolo, autore))
			
			
			}else if(libri.length==4){
				biblioMap.put(libri[0].trim(), (new Audiolibro(libri[1].trim(), libri[2].trim(), libri[3].trim())));
			}	
				
			}
			 br.close();
			
			} catch (IOException e) {
				e.printStackTrace();
				
			}
			System.out.println("TI STO LEGGENDO");
	}	
		
			
		}
	
	
	
	
	
	
		
	

