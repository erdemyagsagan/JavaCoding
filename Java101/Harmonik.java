package Java101;
import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double n,i,a,toplam=0;
            
            System.out.println("N sayisini giriniz: ");
            n = input.nextDouble();
            for(i = 1; i<=n ; i++){
                a = 1/i;
                toplam += a;
                }
                System.out.println("Harmonik dizinin toplami: "+toplam);
            
                    input.close();
        }
    }
}
