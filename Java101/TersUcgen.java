package Java101;
import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int basamak,i,n,j,k=1;
        System.out.print("Basamak sayisini giriniz: ");
        basamak = input.nextInt();
        System.out.print(" ");
     for(i=basamak; 0 < i; i--){
       
        for(n=1; n <= (i*2-1);n++){
              
            System.out.print("*");
            }System.out.println(); 
            for(j = 1; k == j; j++){
                System.out.print(" ");
                k +=j;
     }
            }
    
        
        
        input.close();
    }
    }
