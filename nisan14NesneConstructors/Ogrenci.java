package nisan14NesneConstructors;

public class Ogrenci {
	private String ad;
	private String soyad;
	private int dogumTarihi;
	private byte vn, fn, bn;

	// Constructors
	public Ogrenci(String ad, String soyad, int dogumTarihi, int vn, int fn) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.dogumTarihi = dogumTarihi;
		this.vn = (byte) vn;
		this.fn = (byte) fn;
	}

	public Ogrenci() {
		super();
		System.out.println("Boş kurucu");
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(int dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public int getVn() {
		return (byte) vn;
	}

	public void setVn(int i) {
		this.vn = (byte) i;
	}

	public int getFn() {
		return (byte) fn;
	}

	public void setFn(int i) {
		this.fn = (byte) i;
	}

	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", soyad=" + soyad + ", dogumTarihi=" + dogumTarihi + ", vn=" + vn + ", fn=" + fn
				+ ", bn=" + bn + "]";
	}

	public int yasHesap() {
		return 2026 - dogumTarihi;
	}

	public void bilgileriGoster() {
		System.out.println("Ad: " + ad);
		System.out.println("Soyad: " + soyad);
		System.out.println("Yaş : " + yasHesap());
		System.out.println("Başarı notu: " + basariNot());
	}

	public byte basariNot() {
		return (byte) (vn * .4 + fn * .6);

	}
}
