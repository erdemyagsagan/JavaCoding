package Java101;
import java.util.Scanner;

public class EnBuyukEnKucuk {
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        int i,k=1,n,max=0,min=10000000;
        System.out.print("Kac tane sayi gireceksiniz: ");
        n = input.nextInt();
        for(i = 1; i <= n ; i++){
            System.out.print(i+". Sayiyi giriniz: ");
            k = input.nextInt();
        if (k > max) {
                max = k;
        
        }
        if (k < min) {
                min = k;  
        }
        }
            System.out.print("Minimum deger: "+min+"\nMaksimum deger: "+max);
        
            input.close();
    }
}
}
