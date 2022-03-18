package Java101;
import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int i,n,r,toplamn=1,toplamr=1,toplamm=1,komb;
            System.out.print("Kombinasyon n sayisini giriniz: ");
            n = input.nextInt();
            System.out.print("Kombinasyon r sayisini giriniz: ");
            r = input.nextInt();
            for(i = 1; i <= n; i++){
            toplamn = toplamn * i;
            
            }
            for(i = 1; i <= r; i++){
                toplamr = toplamr * i;
                
                }for(i = 1; i <= n-r; i++){
                    toplamm = toplamm * i;
                    
                    }
                
            komb = toplamn / (toplamr * toplamm);
            
                   System.out.println("Kombinayonun sonucu = "+komb);
                    input.close();
        }
    }
}
