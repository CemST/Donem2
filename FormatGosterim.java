package mart17;

public class FormatGosterim {

	public static void main(String[] args) {
	byte vNot = 60;
	String isim = "Cem";
	int numara = 1234;
		
		yazdir(vNot,isim,numara);

	}

	private static void yazdir(byte vNot, String isim, int numara) {
		System.out.printf("%s isimli %n%d numaralı öğrencinin;%nNotu %d ",isim,numara,vNot);
		
	}

}
