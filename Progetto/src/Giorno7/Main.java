package Giorno7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Biblioteca b = new Biblioteca();
		b.leggiCatalogo();
		
		
		while(true) {
		
		System.out.println("Ciao! Cosa vuoi fare? Seleziona un'opzione:\n\n 1. Aggiungi libro/audiolibro\n 2. Elimina libro/audiolibro\n 3. Aggiungi dati da file\n 4. Visualizza catalogo\n 5. Esci"
				+ "");
		Scanner scanner = new Scanner (System.in);
		int scelta = scanner.nextInt();
		
		
		switch(scelta) {
			case 1:
				System.out.println("Vuoi inserire un:\n 1. libro \n 2. audiolibro");
				int volume = scanner.nextInt();
				scanner.nextLine();
				if(volume==1) {
					
					System.out.println("Inserisci l'ID:");
					String id = scanner.nextLine();
					System.out.println("Inserisci il titolo:");
					String titolo = scanner.nextLine();
					System.out.println("Inserisci l'autore:");			
					String autore = scanner.nextLine();
					
					b.addBook(id, titolo, autore);
				}else if(volume==2) {
					System.out.println("Inserisci l'ID:");
					String id = scanner.nextLine();
					System.out.println("Inserisci il titolo:");
					String titolo = scanner.nextLine();
					System.out.println("Inserisci l'autore:");			
					String autore = scanner.nextLine();
					System.out.println("Inserisci la durata:");			
					String durata = scanner.nextLine();
					b.addBook(id, titolo, autore, durata);
				}
				break;
			case 2:
				System.out.println("Inserisci l'ID del volume da eliminare:");
				scanner.nextLine();
				String id = scanner.nextLine();
				b.deleteBook(id);
				break;
				
			case 3:
				System.out.println("Da che file vuoi aggiungere dati?");
				scanner.nextLine();
				String nuovo = scanner.nextLine();
				b.leggiCatalogo2(nuovo);
				b.salva();
				break;
			
			case 4:
				System.out.println("Ecco il catalogo completo:\n");
				b.stampaCatalogo();
				break;
				
			case 5:
				System.out.println("Ciao, alla prossima!");
			break;
			
			default: System.out.println("Inserisci un'opzione da 1 a 5, altrimenti non posso aiutarti");
			scanner.close();
		}
		
		}

			
	}
		}
