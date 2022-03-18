package Java101;
import java.util.Scanner;

public class TekSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,toplam=0;
        System.out.print("Sayi giriniz: ");
do{
    n = input.nextInt();
if(n % 2 == 0 && n % 4== 0){
toplam += n;
}
}while(n % 2 == 0);
System.out.println("Girdiginiz sayilardan cift sayi ve ayni zamanda 4 un katlari olan sayilarin toplami: "+toplam);
        input.close();
    }
}
