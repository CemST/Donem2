package mart24;

import java.util.ArrayList;
import java.util.Scanner;

public class SinavCalisma {
	static Scanner giris = new Scanner(System.in);

	public static void main(String[] args) {
		// Kişinin adı medeni durumu, çocuk sayısı, brüt maaşı girilip net maaş
		// hesaplanırken evli ise brüt maaşa 5000, her çocuk için 2500 eklensin
		// net maaş toplam maaştan %25 gelir vergisi düşülerek hesaplansın
		/*
		 * 1-Veri girişi 2-Listeleme 3-İsim arama 4-Çocuk sayısı, ort, net maaş ort
		 * 5-Evlilerin bilgileri 6-Kayıt Düzeltme 7-Veri silme 8-Çıkış
		 */

		ArrayList<String> adlar = new ArrayList<String>();
		ArrayList<Byte> cocukSayisi = new ArrayList<Byte>();
		ArrayList<Boolean> evliMi = new ArrayList<Boolean>();
		ArrayList<Integer> brutMaas = new ArrayList<Integer>();
		ArrayList<Integer> netMaas = new ArrayList<Integer>();

		byte secim = 0;
		while (true) {
			System.out.println(
					"Yapılacak işlemi seçin:\n\n1-Veri girişi\n2-Listeleme\n3-İsim Arama\n4-Çocuk Sayısı Ortalaması ve Net Maaş Ortalamasını Göster\n5-Evlilerin bilgileri\n6-Kayıt düzeltme\n7-Veri silme\n8-Çıkış");
			secim = giris.nextByte();

			switch (secim) {
			case 1: {
				VeriGirisi(adlar, cocukSayisi, evliMi, brutMaas, netMaas);
				break;
			}

			case 2: {

				Listeleme(adlar, cocukSayisi, evliMi, brutMaas, netMaas);
				break;
			}

			case 3: {

				İsimArama(adlar, cocukSayisi, evliMi, brutMaas, netMaas);
				break;

			}

			case 4: {

				Ortalamalar(cocukSayisi, netMaas);

			}

			default:
				System.out.println("Geçersiz seçim");
			}

		}

	}

	private static void Ortalamalar(ArrayList<Byte> cocukSayisi, ArrayList<Integer> netMaas) {
		int cstoplam = 0;
		int maasToplam = 0;

		int maasOrt;
		int csOrt;
		
		for (int i = 0; i < cocukSayisi.size(); i++) {
			cstoplam += cocukSayisi.get(i);
			maasToplam += netMaas.get(i);
		}
		
		csOrt = cstoplam/cocukSayisi.size();	
		maasOrt = maasToplam/netMaas.size();
	}

	private static void İsimArama(ArrayList<String> adlar, ArrayList<Byte> cocukSayisi, ArrayList<Boolean> evliMi,
			ArrayList<Integer> brutMaas, ArrayList<Integer> netMaas) {
		String arananİsim;
		System.out.println("Aramak istediğiniz ismi giriniz: ");
		arananİsim = giris.next();

		for (int i = 0; i < adlar.size(); i++) {
			if (arananİsim.equalsIgnoreCase(adlar.get(i))) {
				System.out.println("İsim bulundu!\n\n");
				System.out.println();
				return;
			}
		}
		System.out.println("İsim bulunamadı");
		return;

	}

	private static void Listeleme(ArrayList<String> adlar, ArrayList<Byte> cocukSayisi, ArrayList<Boolean> evliMi,
			ArrayList<Integer> brutMaas, ArrayList<Integer> netMaas) {
		String medeniDurum = "";

		for (int i = 0; i < adlar.size(); i++) {
			if (evliMi.get(i) == true)
				medeniDurum = "evli";
			else if (evliMi.get(i) == false)
				medeniDurum = "bekar";

			System.out.printf(
					i + 1 + ".Kişinin adı: %s\nÇocuk sayısı: %d\nMedeni durumu: %s\nBrüt Maaşı: %d\nNet Maaşı: %d\n\n",
					adlar.get(i), cocukSayisi.get(i), medeniDurum, brutMaas.get(i), netMaas.get(i));
		}

	}

	private static void VeriGirisi(ArrayList<String> adlar, ArrayList<Byte> cocukSayisi, ArrayList<Boolean> evliMi,
			ArrayList<Integer> brutMaas, ArrayList<Integer> netMaas) {
		String ad;
		byte cs;
		byte medeniDurum;
		int maas;

		System.out.println("Girilecek isim: ");
		ad = giris.next();
		adlar.add(ad);

		System.out.println("Kişinin çocuk sayısı: ");
		cs = giris.nextByte();
		cocukSayisi.add(cs);

		System.out.println("Kişinin brüt maaşı: ");
		maas = giris.nextInt();
		brutMaas.add(maas);

		System.out.println("Kişinin medeni durumu:(1-Evli,2-Bekar) ");
		medeniDurum = giris.nextByte();
		if (medeniDurum == 1) {
			evliMi.add(true);
		} else if (medeniDurum == 2) {
			evliMi.add(false);
		} else {
			System.out.println("Geçersiz seçim yaptınız.");
		}
		byte index = (byte) (brutMaas.size() - 1);
		byte medeniDurumBonus = 0;

		if (evliMi.get(index) == true) {
			medeniDurumBonus = 1;
		} else
			medeniDurumBonus = 0;

		netMaas.add((int) ((brutMaas.get(index) + cocukSayisi.get(index) * 2500 + medeniDurumBonus * 5000) * .75));
	}

}
