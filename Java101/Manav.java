package Java101;
import java.util.Scanner;


public class Manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
double armut,elma,domates,muz,patlican,toplam;
System.out.print("Kac kilo Armut aldiniz: ");
armut = 2.14*input.nextDouble();
System.out.print("\nKac kilo Elma aldiniz: ");
elma = 3.67 * input.nextDouble();
System.out.print("\nKac kilo Domates aldiniz: ");
domates = 1.11*input.nextDouble();
System.out.print("\nKac kilo Muz aldiniz: ");
muz = 0.95*input.nextDouble();
System.out.print("\nKac kilo Patlican aldiniz: ");
patlican = 5*input.nextDouble();
toplam = armut + elma + domates + muz + patlican;
System.out.println("Toplam tutar: "+toplam);


        input.close();
    }
}
