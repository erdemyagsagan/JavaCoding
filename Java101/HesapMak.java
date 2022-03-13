package Java101;
import java.util.Scanner;

public class HesapMak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int a,sayi1,sayi2,islem;
System.out.print("1. Sayiyi giriniz: ");
sayi1 = input.nextInt();
System.out.print("2. Sayiyi giriniz: ");
sayi2 = input.nextInt();
System.out.print("\n1.Toplama\n2.Cikarma\n3.Carpma\n4.Bolme\n Yapmak istedigniz islemi seciniz: ");
islem = input.nextInt();
switch(islem){
case 1:
a = sayi1 + sayi2;
System.out.println("Islemin sonucu: "+ a);
break;
case 2:
a = sayi1 - sayi2;
System.out.println("Islemin sonucu: "+ a);
break;
case 3:
a = sayi1 * sayi2;
System.out.println("Islemin sonucu: "+ a);
break;
case 4:
a = sayi1 / sayi2;
System.out.println("Islemin sonucu: "+ a);
break;
default:
System.out.println("Gecersiz islem");
break;
}


input.close();
    }
}
