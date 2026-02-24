package subat24;

import java.util.ArrayList;
import java.util.Scanner;

public class ListelemeBen {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		ArrayList<String> ad = new ArrayList<String>();
		System.out.println("Kaç kişi girilecek ? ");
		byte ks = giris.nextByte();
		
		for (int i = 0; i < ks; i++) {
			System.out.println(i+1+".Kişiyi girin");
			ad.add(giris.next());
		}
		ad.toArray();
		System.out.println(ad);
		


	}

}
