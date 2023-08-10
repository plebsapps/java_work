package ch.plebsapps.Kassenbon;

public class Kassenbon {
	public static void main(String[] args){
		double wurst = 2.31;
		double kaese = 3.54;
		double brot  = 1.50;
		double dvd = 12.00;
		
		int anz_wurst = 1;
		int anz_kaese = 1;
		int anz_brot  = 1;
		int anz_dvd   = 2;
		
		double brieftasche = 50.00;
		
		double summe = 0;
		
		summe = summe + wurst * anz_wurst;
		summe = summe + kaese * anz_kaese;
		summe = summe + brot * anz_brot;
		summe = summe + dvd * anz_dvd;
		
		if (brieftasche < summe){
			System.out.println("Sie haben nicht genug Geld in Ihrer Brieftasche");
		} else {
			System.out.println(String.format("%-9s %2d x %5.2f CHF", "WURST", anz_wurst, wurst)); 
			System.out.println(String.format("%30.2f CHF", anz_wurst * wurst));

			System.out.println(String.format("%-9s %2d x %5.2f CHF", "Kaese", anz_kaese, kaese)); 
			System.out.println(String.format("%30.2f CHF", anz_kaese * kaese));
			
			System.out.println(String.format("%-9s %2d x %5.2f CHF", "Brot", anz_brot, brot)); 
			System.out.println(String.format("%30.2f CHF", anz_brot * brot));
			
			System.out.println(String.format("%-9s %2d x %5.2f CHF", "DVD", anz_dvd, dvd)); 
			System.out.println(String.format("%30.2f CHF", anz_dvd * dvd));

			System.out.println("---------------------------------------------------------------------");
			System.out.println(String.format("%9s %20.2f CHF","SUMME", summe ));
			System.out.println(String.format("%9s %20.2f CHF","Gegeben", brieftasche));
			
			System.out.println("");
			System.out.println(String.format("%9s %20.2f CHF","Rueckgeld", brieftasche-summe));
		}
	}
}