package Java101;
import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
double r,pi=3.14,cevre,alan,dilim,olcu;
        System.out.print("Yaricap Giriniz: ");
r = input.nextDouble();
System.out.print("Daire Dilinin Acisini Giriniz: ");
olcu = input.nextDouble();
alan = pi * r * r;
cevre = 2 * pi * r;
System.out.println("Dairenin Alani: " + alan);
System.out.println("Dairenin Cevresi: " + cevre);

dilim = (pi * (r*r) * olcu) / 360;
System.out.println("Daire diliminin alani: " +dilim);
        input.close();
    }
}
