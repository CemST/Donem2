package nisan7;

import java.util.Scanner;

public class RecursiveFonksiyon {

	public static void main(String[] args) {
	Scanner giris = new Scanner(System.in);
	
	System.out.println("Kaçın faktoriyeli hesaplanacak");
	int sayi = giris.nextInt();
	int fsonuc = ForDongu(sayi);
	System.out.println(fsonuc);
	int rsonuc = RecursiveDongu(sayi);
	System.out.println(rsonuc);
	
	}

	
	
	private static int ForDongu(int sayi) {
	int sonuc = 1;
		for (int i = sayi; i > 1 ; i--) {
			sonuc *=i;
		}
		return sonuc;
	}

	private static int RecursiveDongu(int sayi) {
		if (sayi<=1) return 1;	
		else return sayi*RecursiveDongu(sayi-1);
	}

}
