package jana60;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//una classe Main contenente il metodo main, nel quale chiedete
		//all’utente di inserire, da console, i valori di base e di altezza con
		//cui istanziare un nuovo oggetto Rettangolo. Dopo averlo istanziato, 
		//stampate a video il perimetro e l’area.
		
		Rettangolo r = new Rettangolo();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci la base:");
		int base=scan.nextInt();
		System.out.println("Inserisci l'altezza:");
		int altezza=scan.nextInt();
		
		int area= r.CarcoloArea(base, altezza);
		int perimetro= r.CarcoloPerimetro(base, altezza);
		System.out.println("L'area del rettangolo è: " + area+ ". Mentre il perimetro è: "+ perimetro);
		
		
		scan.close();

	}
	
	

}
