package mart17;

public class TryCatch1 {

	public static void main(String[] args) {
		int sayi = 0;
		int veri[] = { 1, 2, 3 };
		try {
			sayi = 10 / 0;
			System.out.println(veri[4]);

			System.out.println("Try bloğunda hata yok. Catch bloğu çalıştırmaz.");
			System.out.println("Try bloğu sonrası sayi değişkeni: " + sayi);
		}
		// Aritmetik işlem hatası yakalama catch'i
		catch (ArithmeticException e) {
			sayi = 10 / 1;
			System.out.println("Aritmetik işlem hatası.");
			System.out.println("Try bloğu hatalı. Catch bloğu çalıştırıldı.");
			System.out.println("Hatanın tamamı: " + e);
			System.out.println("Hata mesajı: " + e.getMessage());
			System.out.println("Catch bloğu sonrası sayi değişkeni: " + sayi);
		}
		// Array sınırı hatası yakalama catch'i
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(veri[veri.length - 1]);
			System.out.println("Array sınır aşımı hatası.");
		} finally {
			System.out.println("\nHer koşulda çalışır.");
		}
		System.out.println(sayi);
		System.out.println("Program bitti.");

	}

}
