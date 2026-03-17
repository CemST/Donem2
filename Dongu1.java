package mart17;

import java.util.ArrayList;
import java.util.Iterator;

public class Dongu1 {

	public static void main(String[] args) {
		String adlar[] = { "Sinan", "Kemal", "Cem" };
		System.out.println("foreach dongusu");
		//foreach dongusu
		for (String ad : adlar) {
			System.out.println(ad);
		}
		System.out.println("---------------------------");
		ArrayList<String> isimler = new ArrayList<String>();
		isimler.add("Mehmet");
		isimler.add("Kerem");
		isimler.add("Ahmet");
		
		System.out.println("foreach dongusu");
		
		//foreach dongusu
		for (String isim : isimler) {
			System.out.println(isim);
		}
		System.out.println("---------------------------");

		// for dongusu iterator
		System.out.println("\nfor dongusu iterator ile");
		for (Iterator iterator = isimler.iterator(); iterator.hasNext();) {

			String isim = (String) iterator.next();

			System.out.println(isim);
		}
		System.out.println("---------------------------");
		System.out.println("geçici değişkenli for dongusu");
		
		//geçici değişkenli for dongusu
		for (int i = 0; i < adlar.length; i++) {
			System.out.println(adlar[i]);
		}
		
		System.out.println("---------------------------");
		System.out.println("Geçici değişkenli forEach dongusu");
		//Geçici değişkenli forEach
		isimler.forEach(veri->{System.out.println(veri);});
		
		
		
	}
}
