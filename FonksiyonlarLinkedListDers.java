package mart3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class FonksiyonlarLinkedListDers {
	static Scanner giris = new Scanner(System.in);

	static LinkedList<String> ad = new LinkedList<String>();
	static LinkedList<Byte> vizeNot = new LinkedList<Byte>();
	static LinkedList<Byte> finalNot = new LinkedList<Byte>();
	static LinkedList<Byte> basariNot = new LinkedList<Byte>();

	public static int menu() {
		System.out.println(
				"1- Kayıt girişi\n2-Listeleme\n3-İsim arama\n4-Kayıt düzeltme\n5-Kayıt silme\n6-Ortalama\n7-En Büyük\n8-En Küçük\n9-Çıkış");
		int secim = giris.nextInt();
		return secim;
	}

	public static void KayitGirisi() {
		String isim = İsimKontrol();
		byte vn = SayiKontrol("Vize notunu giriniz: ");
		byte fn = SayiKontrol("Final notunu giriniz: ");

		ad.add(isim);
		vizeNot.add(vn);
		finalNot.add(fn);
		basariNot.add((byte) (vn * .4 + fn * .6));
	}

	private static byte SayiKontrol(String mesaj) {
		byte sayi = 0;
		System.out.print(mesaj);
		sayi = giris.nextByte();

		while (true) {
			if (sayi >= 0 && sayi <= 100)
				return sayi;
			else
				System.out.println("0 ile 100 arasında bir not giriniz.");
			System.out.print(mesaj);
			sayi = giris.nextByte();
		}
	}

	public static String İsimKontrol() {
		System.out.println("Girilecek isim: ");
		String isim = giris.next();
		while (true) {
			if (isim.isEmpty())
				System.out.println("İsim boşluk içeremez.");
			else if (!isim.matches("[a-zA-ZçşiğüöÇŞİĞÜÖ]+"))
				System.out.println("İsim sayı içeremez.");
			else
				return isim;
		}
	}

	public static void Listeleme() {
		if (ad.isEmpty()) {
			System.out.println("Liste boş\n");
		}
		for (int i = 0; i < ad.size(); i++) {
			System.out.println("İsim:" + ad.get(i) + "\tVize notu: " + vizeNot.get(i) + "\tFinal notu: "
					+ finalNot.get(i) + "\tBaşarı notu: " + basariNot.get(i));
		}
	}

	public static void İsimArama() {
		System.out.println("Arayacağınız ismi girin: ");
		String arananİsim = giris.next();
		for (int i = 0; i < ad.size(); i++) {
			if (arananİsim.equalsIgnoreCase(ad.get(i))) {
				System.out.println("Aradığınız isim bulundu:");
				System.out.println("İsim:" + ad.get(i) + "\tVize notu: " + vizeNot.get(i) + "\tFinal notu: "
						+ finalNot.get(i) + "\tBaşarı notu: " + basariNot.get(i));
				return;
			}
		}
		System.out.println("İsim bulunamadı");
	}

	public static void KayıtDüzeltme() {
		System.out.println("Düzeltmek istediğiniz ismi girin: ");
		String düzeltilecekİsim = giris.next();
		byte indis = 0;

		if (ad.indexOf(düzeltilecekİsim) >= 0)
			indis = (byte) ad.indexOf(düzeltilecekİsim);

		System.out.println("Yeni İsmi girin: ");
		String yeniİsim = giris.next();
		ad.set(indis, yeniİsim);

		System.out.println("Yeni vize notunu girin: ");
		byte yeniVize = giris.nextByte();
		vizeNot.set(indis, yeniVize);

		System.out.println("Yeni final notunu girin: ");
		byte yeniFinal = giris.nextByte();
		finalNot.set(indis, yeniFinal);

	}

	public static void Ortalama() {
		byte toplamFinal = 0;
		byte toplamVize = 0;
		byte toplamBasariNotu = 0;

		byte finalOrtalama = 0;
		byte vizeOrtalama = 0;
		byte basariOrtalama = 0;

		for (int i = 0; i < ad.size(); i++) {
			toplamFinal += finalNot.get(i);
			toplamVize += vizeNot.get(i);
			toplamBasariNotu += basariNot.get(i);
		}
		finalOrtalama = (byte) (toplamFinal / finalNot.size());
		vizeOrtalama = (byte) (toplamVize / vizeNot.size());
		basariOrtalama = (byte) (toplamBasariNotu / basariNot.size());

		System.out.println("Sınıfın vize ortalaması: " + vizeOrtalama + "\nSınıfın final ortalaması: " + finalOrtalama
				+ "\nSınıfın başarı notu ortalaması: " + basariOrtalama);
	}

	public static void EnBuyuk() {
		int enbVize = 0;
		int enbFinal = 0;
		int enbBasarinotu = 0;

		for (int i = 0; i < ad.size(); i++) {
			if (enbVize <= vizeNot.get(i)) {
				enbVize = vizeNot.get(i);
			}
			if (enbFinal <= finalNot.get(i)) {
				enbFinal = finalNot.get(i);

			}
			if (enbBasarinotu <= basariNot.get(i)) {
				enbBasarinotu = basariNot.get(i);
			}
		}
		System.out.println("En yüksek vize notu: " + enbVize + "\nEn yüksek final notu: " + enbFinal
				+ "\nEn yüksek başarı notu: " + enbBasarinotu);

	}

	public static void KayıtSilme() {
		String silinecekİsim = "";
		System.out.println("Kaydını sileceğin ismi gir: ");
		silinecekİsim = giris.next();

		int silinecekİndis = ad.indexOf(silinecekİsim);

		ad.remove(silinecekİndis);
		vizeNot.remove(silinecekİndis);
		finalNot.remove(silinecekİndis);
		basariNot.remove(silinecekİndis);
	}

	public static void EnKucuk() {
		int enkVize = vizeNot.get(0);
		int enkFinal = finalNot.get(0);
		int enkBasarinotu = basariNot.get(0);

		for (int i = 0; i < ad.size(); i++) {
			if (enkVize >= vizeNot.get(i)) {
				enkVize = vizeNot.get(i);
			}
			if (enkFinal >= finalNot.get(i)) {
				enkFinal = finalNot.get(i);

			}
			if (enkBasarinotu >= basariNot.get(i)) {
				enkBasarinotu = basariNot.get(i);
			}
		}
		System.out.println("En küçük vize notu: " + enkVize + "\nEn küçük final notu: " + enkFinal
				+ "\nEn küçük başarı notu: " + enkBasarinotu);

	}

}
