package Java101;
import java.util.Scanner;

public class KuvvetBulma {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int i,j;
System.out.print("Sayi Giriniz: ");
j = input.nextInt();
System.out.println("4 un kuvvetleri:");
            for(i = 1; i < j; i=i*4){
System.out.println(i);
                
            }
            System.out.println("----------------");
            System.out.println("5 in kuvvetleri:");
            for(i = 1; i < j; i=i*5){
                System.out.println(i);
            }
            
            
            
            
            input.close();
        }
    }
}
