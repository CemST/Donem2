package subat17;

import java.util.Scanner;

public class IkıBoyutluDizilerOrnek {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);

		String il[] = { "Edirne  ", "İstanbul", "Ankara  " };
		String ay[] = { "Ocak", "Şubat" };
		int satirSayisi = il.length;
		int sutunSayisi = ay.length;
		int satis[][] = new int[satirSayisi][sutunSayisi];
		int toplam[] = new int[satirSayisi];
		int enBuyuk[] = new int[satirSayisi];
		int enKucuk[] = new int[satirSayisi];
		
		int sutunToplam[] = new int[sutunSayisi];
		
		

		for (int i = 0; i < satirSayisi; i++) {
			for (int j = 0; j < sutunSayisi; j++) {
				System.out.println(il[i] + " ilinin " + ay[j] + " ayı satışı gir: ");
				satis[i][j] = giris.nextInt();

			}
		}
		// Hesaplama kısımları

		
		
		//Sutün toplamı bulma
		for (int i = 0; i < satirSayisi; i++) {
			for (int j = 0; j < sutunSayisi; j++) {
				sutunToplam[j] += satis[i][j];
			}
		}
	
		
		// En büyük bulma
		for (int i = 0; i < satirSayisi; i++) {
			enBuyuk[i] = satis[0][0];
			for (int j = 0; j < sutunSayisi; j++) {
				if (satis[i][j] > enBuyuk[i])
					enBuyuk[i] = satis[i][j];
			}
		}
		// En küçük bulma
		for (int i = 0; i < satirSayisi; i++) {
			enKucuk[i] = satis[0][0];
			for (int j = 0; j < sutunSayisi; j++) {
				if (satis[i][j] < enKucuk[i])
					enKucuk[i] = satis[i][j];
			}
		}

		// Toplam bulma
		for (int i = 0; i < satirSayisi; i++) {
			for (int j = 0; j < sutunSayisi; j++) {
				toplam[i] += satis[i][j];
			}
		}

		// Yazdırma kısımları
		System.out.print("İller		");
		for (int i = 0; i < sutunSayisi; i++) {
			System.out.print(ay[i] + "\t");
		}
		System.out.println("Toplam\tOrt  Enbüyük  Enküçük");
		for (int i = 0; i < satirSayisi; i++) {
			System.out.print(il[i] + "\t");

			for (int j = 0; j < sutunSayisi; j++) {
				System.out.print(satis[i][j] + "\t");
			}
			System.out.println(toplam[i]+"\t"+toplam[i]/2+"\t"+enBuyuk[i]+"\t"+enKucuk[i]);
		}
		System.out.print("Toplam\t");
		for (int j = 0; j < sutunSayisi; j++) {
			System.out.print("\t"+sutunToplam[j]);
		}
		int geneltoplam = 0;
		for (int i = 0; i < sutunToplam.length; i++) {
			geneltoplam+=toplam[i];
		}
		//System.out.println(geneltoplam);
		
		
	}

}
