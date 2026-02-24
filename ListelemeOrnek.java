package subat24;

import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;

public class ListelemeOrnek {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		ArrayList<String> ad = new ArrayList<String>();
		System.out.println(ad);
		
		//Listeye boş kısma ekleme
		ad.add("Ali");
		System.out.println(ad);
		
		ad.add("Kerem");
		System.out.println(ad);
		
		
		//Listedeki elemanı değiştirme
		ad.set(0, "Mehmet");
		System.out.println(ad);
		
		//Listenin herhangi bir indexine eleman ekleme 

		//	ad.add(index,eklenecek isim)
		
		//Listenin ilk eleman yerine ekler, diğerlerini sağa kaydırır
		ad.add(0,"Cem");
		
		//Listenin sonuna ekleme
		ad.add(ad.size(),"Kemal");
		System.out.println(ad);
		
		
		System.out.println("İsim ara: ");
		String arananAd = giris.next();
		
		for (int i = 0; i < ad.size(); i++) {
			String sorgulananAd = ad.get(i);
			
			if (sorgulananAd.equalsIgnoreCase(arananAd)) {
				System.out.println("İsim bulundu");
			}
			else System.out.println("İsim bulunamadı");
			return;
		}
		
		
		/*Scanner giris = new Scanner(System.in);
		ArrayList<String> ad = new ArrayList<String>();
		System.out.println("Kaç kişi girilecek ? ");
		byte ks = giris.nextByte();
		
		for (int i = 0; i < ks; i++) {
			System.out.println(i+1+".Kişiyi girin");
		}
		
		System.out.println(ad);
		*/
	}

}
