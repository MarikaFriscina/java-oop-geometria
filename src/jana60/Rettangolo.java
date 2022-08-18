package jana60;

public class Rettangolo {		
	
	public int CarcoloArea(int base, int altezza) {
		int area= (base*altezza)/2;
		return area;
	}
	
	public int CarcoloPerimetro(int base, int altezza) {
		int perimetro= (base+altezza)*2;
		return perimetro;
	}
	
}
