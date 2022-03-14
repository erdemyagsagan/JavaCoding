package Java101;
import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
String adi,sifre;
int a;
System.out.print("Kullanici adinizi giriniz: ");
adi = input.nextLine();
System.out.print("Sifrenizi giriniz: ");
sifre = input.nextLine();
if(adi.equals("erdem3417")&&sifre.equals("123456789")){
System.out.println("Giris Basarili");
}else{
System.out.println("Yanlis Bilgi Girisi");
System.out.print("Sifreyi Sifirlamak Icin 1 Cikmak icin 2 yi tuslayin: ");
a = input.nextInt();
if(a == 1){
System.out.print("Yeni sifrenizi giriniz: ");
}

}









        input.close();
    }
}
