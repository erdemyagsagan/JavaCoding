package Java101;
import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int n,toplam=0;
        System.out.print("Bir sayi giriniz: ");
n = input.nextInt();
for(int i=1; i<n; i++){
if(n % i == 0){
    toplam += i;
}
}if(toplam == n){
    System.out.print(n+" Mukemmel bir sayidir.");
}else{
    System.out.print(n+" Mukemmel sayi degildir.");
}
        input.close();
    }
}
