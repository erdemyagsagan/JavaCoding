package Java101;
import java.util.Scanner;

public class Taksimetre {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
double km,acilis,ucret;

System.out.print("Gideceginiz yer kac km uzakta?: ");
km = input.nextDouble();

System.out.println("Ucret: ");
acilis = 10;

ucret = acilis + (km*2.20);
ucret = (ucret < 20) ? 20 : ucret;

System.out.print("Ucret: " + ucret);
       input.close();
   } 
}
