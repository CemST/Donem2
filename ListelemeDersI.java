package subat24;

import java.util.ArrayList;
import java.util.Scanner;

public class ListelemeDersI {
	static Scanner giris = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<String> ad = new ArrayList<String>();
		ArrayList<Byte> vizeNot = new ArrayList<Byte>();
		ArrayList<Byte> finalNot = new ArrayList<Byte>();
		ArrayList<Byte> basariNot = new ArrayList<Byte>();

		byte secim = 0;

		while (secim != 8) {
			System.out.println("Seçim yapınız.");
			System.out.println(
					"1-Kayıt girişi\n2-Listeleme\n3-İsim arama\n4-Düzeltme\n5-Silme\n6-Ortalamalar\n7-En Büyük\n8-Çıkış");
			secim = giris.nextByte();
			switch (secim) {
			case 1: {
				KayitGiris(ad, vizeNot, finalNot);
				break;
			}
			case 2: {
				Listeleme(ad, vizeNot, finalNot, basariNot);
				break;
			}
			case 3: {
				İsimArama(ad, vizeNot, finalNot, basariNot);
				break;
			}
			case 4: {
				Düzeltme(ad, vizeNot, finalNot, basariNot);
				break;
			}
			case 5: {
				Silme(ad, vizeNot, finalNot, basariNot);
				break;
			}
			case 8: {
				System.out.println("Sistem kapatıldı.");
				System.exit(0);

			}
			default:
				System.out.println("Hatalı seçim yaptınız.");
			}

		}

	}

	private static void İsimArama(ArrayList<String> ad, ArrayList<Byte> vizeNot, ArrayList<Byte> finalNot,
			ArrayList<Byte> basariNot) {
		System.out.println("İsim araması yapın");
		String arananİsim = giris.next();
		for (int i = 0; i < ad.size(); i++) {
			String sorgulananİsim = ad.get(i);

			if (arananİsim.equalsIgnoreCase(sorgulananİsim)) {
				System.out.println("İsim bulundu.");
				System.out.println("Ad: " + ad.get(i));
				System.out.println("Vize: " + vizeNot.get(i));
				System.out.println("Final: " + finalNot.get(i));
				System.out.println("Başarı: " + basariNot.get(i));

			} else
				System.out.println("İsim bulunamadı.");
		}

	}

	private static void Düzeltme(ArrayList<String> ad, ArrayList<Byte> vizeNot, ArrayList<Byte> finalNot,
			ArrayList<Byte> basariNot) {
		byte düzeltilenFinal = 0;
		byte düzeltilenVize = 0;

		System.out.println("Düzeltilecek ismi girin: ");
		String düzeltilecekİsim = giris.next();
		byte düzeltilecekİndis = (byte) ad.indexOf(düzeltilecekİsim);

		System.out.println("Yeni ismi girin: ");
		ad.set(düzeltilecekİndis, giris.next());

		System.out.println("Yeni vize notunu girin: ");
		vizeNot.set(düzeltilecekİndis, giris.nextByte());
		düzeltilenVize = giris.nextByte();

		System.out.println("Yeni final notunu girin: ");
		finalNot.set(düzeltilecekİndis, giris.nextByte());
		düzeltilenFinal = giris.nextByte();

		basariNot.set(düzeltilecekİndis, (byte)(düzeltilenFinal*0.6+düzeltilenVize*0.4));

	}

	private static void Listeleme(ArrayList<String> ad, ArrayList<Byte> vizeNot, ArrayList<Byte> finalNot,
			ArrayList<Byte> basariNot) {
		for (int i = 0; i < ad.size(); i++) {
			System.out.println("Ad: " + ad.get(i));
			System.out.println("Vize: " + vizeNot.get(i));
			System.out.println("Final: " + finalNot.get(i));
			System.out.println("Başarı: " + basariNot.get(i));
		}

	}

	private static void Silme(ArrayList<String> ad, ArrayList<Byte> vizeNot, ArrayList<Byte> finalNot,
			ArrayList<Byte> basariNot) {
		String silinecekİsim = null;
		
		System.out.println("Silinecek ismi girin: ");
		silinecekİsim = giris.next();
		
		ad.remove(ad.indexOf(silinecekİsim));
		vizeNot.remove(ad.indexOf(silinecekİsim));
		finalNot.remove(ad.indexOf(silinecekİsim));
		basariNot.remove(ad.indexOf(silinecekİsim));
		
	}

	private static void KayitGiris(ArrayList<String> ad, ArrayList<Byte> vizeNot, ArrayList<Byte> finalNot,	ArrayList<Byte> basariNot) {

		byte eklenenVize = 0;
		byte eklenenFinal = 0;
		
		System.out.println("Kişinin ismini gir: ");
		ad.add(giris.next());
		
		System.out.println("vize notunu gir: ");
		vizeNot.add(giris.nextByte());
		eklenenVize = giris.nextByte();
		
		System.out.println("final notunu gir: ");
		finalNot.add(giris.nextByte());
		eklenenFinal = giris.nextByte();
		
		basariNot.add((byte) (eklenenVize*0.4+eklenenFinal*0.6));

	}

}
