package Java101;
import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n;
            System.out.print("Enter the value betwwen 1-100: ");
            n = input.nextInt();
            if(n % 2 == 1){
                System.out.println("Weird");
            }else if(n % 2 == 0 && 2<=n && n<=5){
            System.out.println("Not Weird");
                }else if(n % 2 == 0 && 6<=n && n<=20){
            System.out.println("Weird");
                }else if(n % 2 == 0 && 20 <= n){
            System.out.println("Not Weird");
                }
        }
}
    
     
    }

