package Java101;
import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int sayi,us,i,toplam=1;
            System.out.println("Hesaplamak istedigniz uslu sayi islemini giriniz: ");
            sayi = input.nextInt();
            System.out.print(sayi+" ^ ");
            us = input.nextInt();
            for(i = 1;i <= us; i++ ){
                toplam = toplam * sayi;
                
            }System.out.println(toplam);
            
                    input.close();
        }
    }
}
