package Java101;
import java.util.Scanner;

public class NotOrtalamasi{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
    int mat,fizik,kimya,muzik,turkce; 
    double toplam = 0;
System.out.print("Matematik notunuzu giriniz: ");
mat = input.nextInt();
System.out.print("Fizik notunuzu giriniz: ");
fizik = input.nextInt();
System.out.print("Kimya notunuzu giriniz: ");
kimya   = input.nextInt();
System.out.print("Muzik notunuzu giriniz: ");
muzik = input.nextInt();
System.out.print("Turkce notunuzu giriniz: ");
turkce = input.nextInt();
if(0<mat && mat<100){
    toplam += mat;
}
if(0<fizik && fizik<100){
    toplam += fizik;
}
if(0<kimya && kimya<100){
    toplam += kimya;
}
if(0<turkce && turkce<100){
    toplam += turkce;
}
if(0<muzik && muzik<100){
    toplam += muzik;
}
double ortalama = (toplam / 5 );
System.out.println("Ortalamaniz: " + ortalama);

String str = (ortalama<55)? "Sinifta kaldi." : "Sinifi gecti";
System.out.println(str);
input.close();
}
}