package Java101;
import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int km,yolculuktipi,yas;
double fiyat;
System.out.print("Gitmek istediginiz yerin kac kilometre uzakta oldugunu giriniz: ");
km = input.nextInt();
fiyat = km * 0.10 ;
System.out.print("Kac yasinda oldugunuzu giriniz: ");
yas = input.nextInt();
if(yas < 12){
    fiyat = fiyat / 2;
}else if(11 < yas && yas < 25){
fiyat = fiyat * 0.90;
}else if (yas > 64){
    fiyat = fiyat * 0.70;
}

System.out.print("Yolculuk tipini seciniz\nGidis Donus icin 1\nSadece gidis icin 2\n               :  ");
yolculuktipi = input.nextInt();
if(yolculuktipi == 1){
    fiyat = fiyat * 0.80;
}
System.out.print("Toplam fiyat: " +fiyat );
System.out.print("TL");




        input.close();
    }
}
