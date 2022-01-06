package projekat_1;

import java.util.Scanner;

public class PastaBar {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Izvolite!");
		String [] stalneMusterije = {"0631111111", "063222222", "063333333", "064444444",
				"065555555", "066666666"};
		String [] niz = {"Makarone", "Spagete", "Bolognese", "Curetina", "Govedja prsuta", 
		"Slanina", "Piletina", "4 sira", "Dimljeni sir", "Parmezan", "Pavlaka", "Pesto sos",
		"Napolitana", "Povrce mix", "Pecurke", "Kutija"};
		int [] cene = {50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20};
	}
	public static int napraviKombinacijuSastojaka (String [] niz, String sastojci) {
		for (int i = 0; i < niz.length; i++) {
			if (niz[i].equals(sastojci)) {
				return i;
			}
		}
		if (sastojci.equals("Poruci")) {
			return 16;}
		else {return 17;}
	}
	public static boolean musterije (String [] stalneMusterije, String brojTelefona) {
		for (int i = 0; i < stalneMusterije.length; i++) {
			if (stalneMusterije[i].equals(brojTelefona)) {
				return true;
			}
		}
		return false;
		
	}
}
