package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<String> desiderio = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		String richiesta="";
		
		
		do {
			System.out.println("Per inserire un desiderio scrivi si, mentre per uscire scrivi no");
			richiesta = s.nextLine();
			if(richiesta.equals("si")) {
				System.out.println("Scrivi un desiderio");
				desiderio.add(s.nextLine());
				System.out.println("Hai: " +desiderio.size() + " desideri espressi sino ad ora, vuoi continuare?");
				continue;
			} else if(richiesta.equals("no")) {
				System.out.println("Non hai altri desideri da esprimere, ecco la tua lista:");
				Collections.sort(desiderio);
				for(String list:desiderio) {
					System.out.println(list);
				}
			} else {
				System.out.println("Input non valido");
			}
			
		} while(!richiesta.equals("no"));
		
		
		s.close();
	}
}
