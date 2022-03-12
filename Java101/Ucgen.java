package Java101;
import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in) ;
int a,b;
double c,alan,cevre;
System.out.print("Ucgenin iki kenar olcusunun uzunluklarini giriniz.\na = ");
a = input.nextInt();
System.out.print("b = ");
b = input.nextInt();

c= Math.sqrt((a*a) + (b*b));
System.out.println("Ucgenin uzun kenari: " + c );

alan = (b * a) / 2;
cevre = (a + b + c);
System.out.println("\nUcgenin alani: " + alan);
System.out.println("Ucgenin cevresi: " + cevre);




input.close();
    }
}
