import java.util.ArrayList;
import java.util.Scanner;

public class Problem {
	static Scanner giris = new Scanner(System.in);

	public static void main(String[] args) {
	ArrayList<String> urunisimleri = new ArrayList<String>();
	ArrayList<Float> urunfiyatlari = new ArrayList<Float>();
	ArrayList<Byte> urunmiktarlari = new ArrayList<Byte>();
	ArrayList<String> urunturleri = new ArrayList<String>();
	
		while (true) {
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
		
		byte secim = giris.nextByte();
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
			UrunSatis(urunisimleri,urunfiyatlari,urunmiktarlari,urunturleri);
			
		}break;
		
		case 6: {
			UrunAlis(urunisimleri,urunfiyatlari,urunmiktarlari,urunturleri);
			
		}break;
		
		case 7: {
			ToplamBedel(urunisimleri,urunfiyatlari,urunmiktarlari,urunturleri);
			
		}break;
		
		case 8:{
			byte secim1=1;
			while (secim1!=0) {
				System.out.println("Hangisini yapmak istersin: \n0-Geri dön\n1-Ortalama Hesapla\n2-En yüksek fiyata sahip ürünü bul\n3-En düşük fiyata sahip ürünü bul");
				secim1 = giris.nextByte();
				switch (secim1) {
				
				case 0:break;
				
				case 1:{
					Ortalama(urunisimleri,urunfiyatlari,urunmiktarlari,urunturleri);				
					
				}break;

				case 2:{
					EnYuksek(urunisimleri,urunfiyatlari,urunmiktarlari,urunturleri);
					
				}break;
				
				case 3:{
					EnDusuk(urunisimleri,urunfiyatlari,urunmiktarlari,urunturleri);
					
				}break;
				
				default:
					System.out.println("Geçersiz seçim yaptınız.");
				}
			}
		}break;
		
		case 9:{
			System.out.println("Çıkış yapıldı.");
			System.exit(0);
		}break;
		
		default:
			System.out.println("Geçersiz seçim yapıldı.");
			}
		
		}
	}
	private static void EnDusuk(ArrayList<String> urunisimleri, ArrayList<Float> urunfiyatlari,
			ArrayList<Byte> urunmiktarlari, ArrayList<String> urunturleri) {
		float enDusukFiyat;
		if (urunisimleri.size()>0) {
			enDusukFiyat = urunfiyatlari.get(0);
			for (int i = 0; i < urunisimleri.size(); i++) {
				if (urunfiyatlari.get(i)<=enDusukFiyat){
					enDusukFiyat = urunfiyatlari.get(i);
				}
			
			}System.out.println("En düşük ürün fiyatı: "+enDusukFiyat);
			
			return;
		
		}else {System.out.println("Stokta ürün yok.");return;}
		
	}
	private static void EnYuksek(ArrayList<String> urunisimleri, ArrayList<Float> urunfiyatlari,
			ArrayList<Byte> urunmiktarlari, ArrayList<String> urunturleri) {
		float enYuksekFiyat;
		if (urunisimleri.size()>0) {
			enYuksekFiyat = urunfiyatlari.get(0);
			for (int i = 0; i < urunisimleri.size(); i++) {
				if (urunfiyatlari.get(i)>=enYuksekFiyat){
					enYuksekFiyat = urunfiyatlari.get(i);
				}
			
			}System.out.println("En yüksek ürün fiyatı: "+enYuksekFiyat);
			
			return;
		
		}else {System.out.println("Stokta ürün yok.");return;}
		
	}
	private static void Ortalama(ArrayList<String> urunisimleri, ArrayList<Float> urunfiyatlari,
			ArrayList<Byte> urunmiktarlari, ArrayList<String> urunturleri) {
		int urunfiyattoplam = 0;
		int urunsayisi = urunisimleri.size();
		if (urunisimleri.size()>0) {
			
			for (int i = 0; i < urunisimleri.size(); i++) {
			urunfiyattoplam += urunfiyatlari.get(i);
			}
			
			System.out.println("Ürünlerin ortalama fiyatı: "+(float)(urunfiyattoplam/urunsayisi));
			return;
			
		}else {System.out.println("Stokta ürün yok.");return;}
			
		
	}
	private static void ToplamBedel(ArrayList<String> urunisimleri, ArrayList<Float> urunfiyatlari,
			ArrayList<Byte> urunmiktarlari, ArrayList<String> urunturleri) {
		int toplamBedel = 0;
		
		if (urunisimleri.size()>0) {
			
				for (int i = 0; i < urunisimleri.size(); i++) {
					toplamBedel += (urunfiyatlari.get(i)*urunmiktarlari.get(i));
				}
				
				System.out.println("Ürünlerin toplam satış bedeli: "+toplamBedel);
				return;
			
			}else {System.out.println("Stokta ürün yok.");return;}
		
	}
	private static void UrunAlis(ArrayList<String> urunisimleri, ArrayList<Float> urunfiyatlari,
			ArrayList<Byte> urunmiktarlari, ArrayList<String> urunturleri) {
		
		System.out.println("Alınan ürünün ismini girin: ");
		urunisimleri.add(giris.next());
		
		System.out.println("Ürünün satış fiyatını girin: ");
		urunfiyatlari.add(giris.nextFloat());
		
		System.out.println("Alınan ürün miktarını girin: ");
		urunmiktarlari.add(giris.nextByte());
		
		byte secim2 = 0;
		while (secim2!=1 & secim2!=2) {
			System.out.println("Alınan ürünün türünü girin:\n1-Sıcak\n2-Soğuk ");
			secim2 =giris.nextByte();
			if(secim2==1)
				urunturleri.add("Sıcak");
			else if (secim2==2) {
				urunturleri.add("Soğuk");				
			}
		}
		
	}
	private static void UrunSatis(ArrayList<String> urunisimleri, ArrayList<Float> urunfiyatlari,
			ArrayList<Byte> urunmiktarlari, ArrayList<String> urunturleri) {
		
		String satilacakUrun;
		int satilacakIndex;
		byte satilacakMiktar;
		
		System.out.println("Satılacak ürünün ismini gir: ");
		satilacakUrun = giris.next();
		
		for (int i = 0; i < urunisimleri.size(); i++) {
			if (satilacakUrun.equalsIgnoreCase(urunisimleri.get(i))){
				satilacakIndex = urunisimleri.indexOf(urunisimleri.get(i));
				System.out.println("Ürün bulundu.\nEldeki ürün adeti: "+urunmiktarlari.get(satilacakIndex));
				
				System.out.println("Üründen kaç adet satılacak: ");
				satilacakMiktar = giris.nextByte();
				
				if (satilacakMiktar < urunmiktarlari.get(satilacakIndex)) {
					urunmiktarlari.set(satilacakIndex, (byte) (urunmiktarlari.get(satilacakIndex)-satilacakMiktar));
					System.out.println(satilacakMiktar+" "+urunisimleri.get(satilacakIndex)+" satıldı.\nElde kalan "+urunisimleri.get(satilacakIndex)+" miktarı: "+urunmiktarlari.get(satilacakIndex));
		
				}else if (satilacakMiktar == urunmiktarlari.get(satilacakIndex) & urunmiktarlari.size() != 1) {
					
					urunisimleri.remove(satilacakIndex);
					urunfiyatlari.remove(satilacakIndex);
					urunmiktarlari.remove(satilacakIndex);
					urunturleri.remove(satilacakIndex);
					
					System.out.println(satilacakMiktar+"ürün satıldı.\nElde bu üründen başka kalmadığından ürün listeden silindi.");
					
				}else if (urunmiktarlari.size() == 1){
					urunisimleri.clear();
					urunfiyatlari.clear();
					urunmiktarlari.clear();
					urunturleri.clear();
					
				}else{
					System.out.println("Elinde olan üründen fazlasını satamazsın.");
					}
				
				return;
			}
		}System.out.println("Ürün bulunamadı");
		
		
		
	}
	private static void KayitSilme(ArrayList<String> urunisimleri, ArrayList<Float> urunfiyatlari,
			ArrayList<Byte> urunmiktarlari, ArrayList<String> urunturleri) {
		System.out.println("Silinecek ürünün ismini girin: ");
		
		String silinecekUrun = giris.next();
		int silinecekIndex;
		
		for (int i = 0; i < urunisimleri.size(); i++) {
			if (silinecekUrun.equalsIgnoreCase(urunisimleri.get(i))){
				silinecekIndex = urunisimleri.indexOf(urunisimleri.get(i));
				System.out.println("Ürün bulundu.\nÜrünün indeksi: "+silinecekIndex);
				
				urunisimleri.remove(silinecekIndex);
				urunfiyatlari.remove(silinecekIndex);
				urunmiktarlari.remove(silinecekIndex);
				urunturleri.remove(silinecekIndex);
				
				System.out.println("\nÜrün silme işlemi tamamlandı.\n");
				
				return;
			}
		}System.out.println("Ürün bulunamadı");
		
	}
	private static void KayitDuzeltme(ArrayList<String> urunisimleri, ArrayList<Float> urunfiyatlari,
			ArrayList<Byte> urunmiktarlari, ArrayList<String> urunturleri) {
		System.out.println("Düzeltilecek ürünün ismini girin: ");
		
		String duzeltilecekUrun = giris.next();
		int duzeltilecekIndex;
		
		for (int i = 0; i < urunisimleri.size(); i++) {
			if (duzeltilecekUrun.equalsIgnoreCase(urunisimleri.get(i))){
				duzeltilecekIndex = urunisimleri.indexOf(urunisimleri.get(i));
				System.out.println("Ürün bulundu.\nÜrünün indeksi: "+duzeltilecekIndex);
				
				System.out.println("Yeni ürün adını girin: ");
				urunisimleri.set(duzeltilecekIndex, giris.next());
				
				System.out.println("Yeni ürün birim fiyatı girin: ");
				urunfiyatlari.set(duzeltilecekIndex, giris.nextFloat());	
				
				System.out.println("Yeni ürün miktarını girin: ");
				urunmiktarlari.set(duzeltilecekIndex, giris.nextByte());
				
				byte secim2 = 0;
				while (secim2!=1 & secim2!=2) {
					System.out.println("Yeni ürün türünü girin:\n1-Sıcak\n2-Soğuk ");
					secim2 =giris.nextByte();
					if(secim2==1)
						urunturleri.set(duzeltilecekIndex, "Sıcak");
					else if (secim2==2) {
						urunturleri.set(duzeltilecekIndex, "Soğuk");	
					}
					return;
					}
				
				}
		}System.out.println("Ürün bulunamadı.\n");
		
		//urunisimleri.set(duzeltilecekIndex, giris.next());

	}
	private static void Listeleme(ArrayList<String> urunisimleri, ArrayList<Float> urunfiyatlari,
			ArrayList<Byte> urunmiktarlari, ArrayList<String> urunturleri) {
		
		
		if (urunisimleri.size() != 0) {
			for (int i = 0; i < urunisimleri.size(); i++) {
				System.out.println("\n"+(i+1)+".Ürünün;"
						+ "\nİsmi: "+urunisimleri.get(i)+
						"\nBirim Fiyatı: "+urunfiyatlari.get(i)+
						"\nMiktarı: "+urunmiktarlari.get(i)+
						"\nTürü: "+urunturleri.get(i)+"\n");
			}
			
		}else System.out.println("Liste boş.\n");
		
	}
	private static void KayitGiris(ArrayList<String> urunisimleri, ArrayList<Float> urunfiyatlari,
			ArrayList<Byte> urunmiktarlari, ArrayList<String> urunturleri) {
		System.out.println("Eklenecek ürünün ismini girin: ");
		String eklenecekİsim = giris.next();
		String kontroledilmisisim= IsimKontrol(eklenecekİsim);
		urunisimleri.add(kontroledilmisisim);
		System.out.println(kontroledilmisisim);
		System.out.println("Eklenecek ürünün fiyatını girin: ");
		urunfiyatlari.add(giris.nextFloat());
		System.out.println("Eklenecek ürünün miktarını girin: ");
		urunmiktarlari.add(giris.nextByte());
		
		byte secim2 = 0;
		while (secim2!=1 & secim2!=2) {
			System.out.println("Eklenecek ürünün türünü girin:\n1-Sıcak\n2-Soğuk ");
			secim2 =giris.nextByte();
			if(secim2==1) {
				urunturleri.add("Sıcak");
				
			}else if (secim2==2) {
				urunturleri.add("Soğuk");				
			}
			
		}
		System.out.println("Kayıt başarılı!\n\n");
	}
	private static String IsimKontrol(String eklenenİsim) {
		String eklenecek;
		
		
	eklenecek = eklenenİsim.replaceAll("\\d", "");
	
	return eklenecek;
	
	}

}