package ch.plebsapps.übungsaufgaben.kassenbon;

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
			System.out.printf("%-9s %2d x %5.2f CHF%n", "WURST", anz_wurst, wurst);
			System.out.printf("%30.2f CHF%n", anz_wurst * wurst);

			System.out.printf("%-9s %2d x %5.2f CHF%n", "Kaese", anz_kaese, kaese);
			System.out.printf("%30.2f CHF%n", anz_kaese * kaese);
			
			System.out.printf("%-9s %2d x %5.2f CHF%n", "Brot", anz_brot, brot);
			System.out.printf("%30.2f CHF%n", anz_brot * brot);
			
			System.out.printf("%-9s %2d x %5.2f CHF%n", "DVD", anz_dvd, dvd);
			System.out.printf("%30.2f CHF%n", anz_dvd * dvd);

			System.out.println("---------------------------------------------------------------------");
			System.out.printf("%9s %20.2f CHF%n","SUMME", summe );
			System.out.printf("%9s %20.2f CHF%n","Gegeben", brieftasche);
			
			System.out.println();
			System.out.printf("%9s %20.2f CHF%n","Rueckgeld", brieftasche-summe);
		}
	}
}