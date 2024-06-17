/* PROVA DI VALUTAZIONE INTERMEDIA JAITA12
 * 
4. Fai un esempio di classe astratta e di una sua sottoclasse 
(possibilmente non uno di quelli visti a lezione 😉);
fai un esempio di polimorfismo in cui vengono utilizzate tali classi
*/
package org.generation.italy;

import java.util.ArrayList;

import org.generation.italy.model.Dispositivo;
import org.generation.italy.model.Fisso;
import org.generation.italy.model.Portatile;

public class Main {
	
public static void main(String[] args) {
	
		System.out.println("\n");
	
		Fisso f = new Fisso ("Asus", 32);
		System.out.println(f.toString());
		f.faiBackup();				
		f.aggiorna();	
		
		System.out.println("\n");
		
		Portatile p = new Portatile ("MacBook", 8);
		System.out.println(p.toString());
		p.faiBackup();			
		p.aggiorna();	
		
		System.out.println("\n");
		
		ArrayList<Dispositivo> elencoDispositivi=new ArrayList<Dispositivo>();
		
		elencoDispositivi.add(f);		//polimorfismo: l'animale è un gatto
		elencoDispositivi.add(p);		//polimorfismo: l'animale è un cane
		elencoDispositivi.add(new Fisso("HP",64));
		elencoDispositivi.add(new Portatile("Lenovo",16));
		
		System.out.println("Backup dei dispositivi nell'elenco:");
		for(Dispositivo disp:elencoDispositivi) {
			disp.faiBackup();
			disp.aggiorna();  
			System.out.println();
		}
	}
}
		