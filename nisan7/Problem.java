package nisan7;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem {
	static Scanner giris = new Scanner(System.in);

	public static void main(String[] args) {
	ArrayList<String> urunisimleri = new ArrayList<String>();
	ArrayList<Float> urunfiyatlari = new ArrayList<Float>();
	ArrayList<Byte> urunmiktarlari = new ArrayList<Byte>();
	ArrayList<String> urunturleri = new ArrayList<String>();
	
		byte secim = 0;
		do{
		System.out.println("1-Kayıt giriş\n"
				+ "2-Türüne göre listele\n"
				+ "3-Kayıt Düzeltme\n"
				+ "4-Kayıt silme\n"
				+ "5-Ürün satış\n"
				+ "6-Ürün alış\n"
				+ "7-Kafedeki toplam ürün bedeli\n"
				+ "8-Ortalama,En büyük ve En küçük fiyatları listele\n"
				+ "9-Çıkış\n"
				+ "Seçim yapınız: ");
		
		secim = giris.nextByte();
		switch (secim) {
		case 1: {
			KayitGiris(urunisimleri,urunfiyatlari,urunmiktarlari,urunturleri);
		}break;
		case 2: {
			Listeleme(urunisimleri,urunfiyatlari,urunmiktarlari,urunturleri);
			
		}break;
		case 3:{
			KayitDuzeltme(urunisimleri,urunfiyatlari,urunmiktarlari,urunturleri);
			
		}break;
		case 4:{
			KayitSilme(urunisimleri,urunfiyatlari,urunmiktarlari,urunturleri);
			
		}break;
		case 5: {
			
			
		}break;
		default:
			System.out.println("Geçersiz seçim yapıldı.");
			}
		
		}while(secim!=0);
	}
	private static void KayitSilme(ArrayList<String> urunisimleri, ArrayList<Float> urunfiyatlari,
			ArrayList<Byte> urunmiktarlari, ArrayList<String> urunturleri) {
		// TODO Auto-generated method stub
		
	}
	private static void KayitDuzeltme(ArrayList<String> urunisimleri, ArrayList<Float> urunfiyatlari,
			ArrayList<Byte> urunmiktarlari, ArrayList<String> urunturleri) {
		// TODO Auto-generated method stub
		
	}
	private static void Listeleme(ArrayList<String> urunisimleri, ArrayList<Float> urunfiyatlari,
			ArrayList<Byte> urunmiktarlari, ArrayList<String> urunturleri) {
		// TODO Auto-generated method stub
		
	}
	private static void KayitGiris(ArrayList<String> urunisimleri, ArrayList<Float> urunfiyatlari,
			ArrayList<Byte> urunmiktarlari, ArrayList<String> urunturleri) {
		System.out.println("Eklenecek ürünün ismini girin: ");
		String eklenecekİsim = giris.next();
		String kontrolisim= IsimKontrol(eklenecekİsim);
		urunisimleri.add(kontrolisim);
		System.out.println(kontrolisim);
		System.out.println("Eklenecek ürünün fiyatını girin: ");
		urunfiyatlari.add(giris.nextFloat());
		System.out.println("Eklenecek ürünün miktarını girin: ");
		urunmiktarlari.add(giris.nextByte());
		
		byte secim2 = 0;
		while (secim2!=1 & secim2!=2) {
			System.out.println("Eklenecek ürünün türünü girin:\n1-Sıcak\n2-Soğuk ");{
			secim2 =giris.nextByte();
			if(secim2==1)
				urunturleri.add("Sıcak");
			else if (secim2==2)
				urunturleri.add("Soğuk");
			}
		}
		
	}
	private static String IsimKontrol(String eklenenİsim) {
		
	if(eklenenİsim.matches(".*[0-9].*") == true) 
		
		System.out.println(eklenenİsim.replaceAll("//d", ""));
		System.out.println(eklenenİsim);
		
	
	
	return eklenenİsim;
	
	}

}
