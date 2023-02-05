package Java101;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,i=1;
        int ebob=0,ekok;
        System.out.print("Enter first number= ");
        n1 = input.nextInt();
        System.out.print("\nEnter second number= ");
        n2 = input.nextInt();
        while(i <= n1){
            
if (n1 % i == 0  && n2 % i == 0){
  ebob = i;
}
  i++;
        }
System.out.println("ebob: "+ebob);
ekok = (n1*n2)/ebob;
System.out.println("ekok: "+ekok);
input.close();
    }
}
