package Java101;
import java.util.Scanner;

public class CiftSayi {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int i,a,toplam=0;
System.out.print("Sayi Giriniz: ");
i = input.nextInt();
System.out.println(i+" kadar olan Cift sayilar: ");
for(a = 1; a <= i; a += 2){
    System.out.println(a);
}
System.out.println("\n----------------------\n");
System.out.println(i+" kadar olan sayilardan 3 ve 4 e tam bolunenlerin ortalamasi: \n");
for(a = 1; a <= i; a += 2){
    if(i % 3 == 0 || i % 4 == 0 ){
toplam += i;

    }
    

}System.out.println(toplam / 2+" ");





input.close();

}
    


}