package Java101;
import java.util.Scanner;

public class Atm {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
String kullaniciadi,sifre;
int bakiye=10000,yattut,cektut;
System.out.print("Kullanici Adinizi Giriniz: ");
kullaniciadi = input.nextLine();
System.out.print("\nSifrenizi Giriniz: ");
sifre = input.nextLine();
if(kullaniciadi.equals ("34343434") && sifre.equals("123456789")){
System.out.println("Giris Basarili");
System.out.println("1-Para yatırma\n" +
"2-Para Çekme\n" +
"3-Bakiye Sorgula\n" +
"4-EFT/Havale\n" + "5-Çıkış Yap");
int i = input.nextInt();
switch (i) {
    case 1:
      System.out.print("Yatirmak istediginiz tutari giriniz: "); 
yattut = input.nextInt();
bakiye += yattut;
System.out.println("Para yatirma islemi basarili !\nGuncel bakiyeniz: " + bakiye+"TL");
        break;
        case 2:
      System.out.print("Cekmek istediginiz tutari giriniz: "); 
cektut = input.nextInt();
if(cektut > bakiye){
    System.out.println("Yetersiz Bakiye !");
    System.out.println("Guncel bakiyeniz: "+bakiye+"TL");
}else{
bakiye -= cektut;
System.out.println("Para cekme islemi basarili !\nGuncel bakiyeniz: " + bakiye+"TL");
}
        break;
        case 3:
        System.out.print("Bakiyeniz: "+bakiye+"TL"); 
  
          break;
          case 4:
      System.out.print("EFT/Havale yapmak istediginiz iban adresini giriniz: "); 
        System.out.print("Yatirmak istediginiz tutari giriniz: "); 
yattut = input.nextInt();
if(yattut <= bakiye){
bakiye -= yattut;
    System.out.println("Para gonderme islemi basarili !\nGuncel bakiyeniz: " + bakiye+"TL");
}
else{
    System.out.println("Yetersiz Bakiye !");
    System.out.println("Guncel bakiyeniz: "+bakiye+"TL");
}
        break;
        case 5:
        System.out.println("Cikis yapildi !");
   
}

}else{
    System.out.println("Hatali giris tekrar deneyiniz.");
}


    input.close();
}
    
}
