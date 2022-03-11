package Java101;
import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
double kdvli,kdvfiyati,fiyat;
System.out.print("Almak istediginiz urunun fiyatini giriniz: ");
fiyat = input.nextDouble();
int oran = (fiyat >= 1000) ? 8 : 18;
kdvfiyati = (fiyat * oran ) / 100;
kdvli = fiyat + kdvfiyati;
System.out.println("Aldiginiz urunun KDV li fiyati: "+ kdvli);
System.out.println("Aldiginiz urunun KDV tutari: "+ kdvfiyati);



        input.close();
    }
}
