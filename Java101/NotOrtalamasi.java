package Java101;
import java.util.Scanner;

public class NotOrtalamasi{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
    int mat,fizik,kimya,inkilap,turkce;
System.out.print("Matematik notunuzu giriniz: ");
mat = input.nextInt();
System.out.print("Fizik notunuzu giriniz: ");
fizik = input.nextInt();
System.out.print("Kimya notunuzu giriniz: ");
kimya   = input.nextInt();
System.out.print("Inkilap notunuzu giriniz: ");
inkilap = input.nextInt();
System.out.print("Turkce notunuzu giriniz: ");
turkce = input.nextInt();
int toplam = (mat + fizik + kimya + inkilap + turkce);
double ortalama = (toplam / 5 );
System.out.println("Ortalamaniz: " + ortalama);

String str = (ortalama<60)? "Sinifta kaldi." : "Sinifi gecti";
System.out.println(str);
input.close();
}
}