package nisan14NesneConstructors;

public class SinifDersMain {

	public static void main(String[] args) {

		Ogrenci ogr1 = new Ogrenci();

		/*
		 * Boş olanlara bu şekilde erişilmez, .get... ve .set... fonksiyonları ile
		 * erişilmesi istenir.
		 */
		// ogr1.ad="Cem Sinan";
		// ogr1.soyad="Türkcan";
		// ogr1.dogumTarihi=2008;
		// ogr1.vn = 100;
		// ogr1.fn = 80;
		ogr1.setAd("Cem Sinan");
		ogr1.setSoyad("Türkcan");
		ogr1.setDogumTarihi(2008);
		ogr1.setVn(100);
		ogr1.setFn(80);

		ogr1.bilgileriGoster();
		// System.out.println(ogr1);;

		Ogrenci ogr2 = new Ogrenci("Kerem Efe", "Bilgin", 2006, 60, 90);
		ogr2.bilgileriGoster();

	}

}
