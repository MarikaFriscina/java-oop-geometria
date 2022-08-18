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
		
		/*ESERCIZIO BASE
		System.out.println("Inserisci la base:");
		int base=scan.nextInt();
		System.out.println("Inserisci l'altezza:");
		int altezza=scan.nextInt();
		
		int area= r.CarcoloArea(base, altezza);
		int perimetro= r.CarcoloPerimetro(base, altezza);
		System.out.println("L'area del rettangolo è: " + area+ ". Mentre il perimetro è: "+ perimetro);
		*/
		
		//BONUS chiedere all’utente per 5 volte di definire le dimensioni di un rettangolo e stampare a video l’area del rettangolo più grande
		int[] base=new int[5];
		int[] altezza=new int[5];
		int basemag=0;
		int altmag=0;
		for(int i=0;i<5;i++) {
			System.out.println("Inserisci la base: ");
			
			base[i]= scan.nextInt();
			
			if(basemag<base[i]) {
				basemag=base[i];
			}
						
		}
		for(int a=0;a<5;a++) {
			System.out.println("Inserisci l'altezza: ");
			
			altezza[a]=scan.nextInt();
			if(basemag<altezza[a]) {
				altmag=altezza[a];
			}
		}
		
		System.out.println("La base maggiore è: "+basemag+ ", l'altezza maggiore è: "+altmag);
		int area= r.CarcoloArea(basemag, altmag);
		int perimetro= r.CarcoloPerimetro(basemag, altmag);
		System.out.println("L'area del rettangolo è: " + area+ ". Mentre il perimetro è: "+ perimetro);
		scan.close();
		
		
		
		
		
		
		

	}
	
	

}
