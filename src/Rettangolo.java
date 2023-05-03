
public class Rettangolo {
	
	double altezza;
	double lunghezza;
	
	public Rettangolo(double altezza, double lunghezza) {
		this.altezza = altezza;
		this.lunghezza = lunghezza;
	}
	
	public double calcolaPerimetro() {
		return (lunghezza + altezza)*2;
	}
	
	public double area() {
		return (lunghezza*altezza);
	}
	
	public static void stampaRettangolo(Rettangolo rettangolo) {

		System.out.println("Il perimetro del rettangolo è: " + rettangolo.calcolaPerimetro());
		System.out.println("L'area del rettangolo è: " + rettangolo.area());
	}
	
	public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {

		System.out.println("Il perimetro del rettangolo r1 è: " + r1.calcolaPerimetro());
		System.out.println("L'area del rettangolo r1 è: " + r1.area());
		
		System.out.println("Il perimetro del rettangolo r2 è: " + r2.calcolaPerimetro());
		System.out.println("L'area del rettangolo r2 è: " + r2.area());
		
		System.out.println("La somma dei perimetri di r1 e r2 è: " + r1.calcolaPerimetro()+r2.calcolaPerimetro());
		System.out.println("La somma delle aree di r1 e r2 è: " + r1.area()+r2.area());
	}
	
}
