package Java101;
import java.util.Scanner;


public class VKI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
double kilo,boy,indeks;
System.out.print("Boyunuzu giriniz(metre cinsinden): ");
boy = input.nextDouble();
System.out.print("Kilonuzu giriniz: ");
kilo = input.nextDouble();
indeks = kilo / (boy*boy); 

System.out.println("Vucut kitle indeksiniz: " + indeks );

        input.close();
    }
}
