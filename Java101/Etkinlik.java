package Java101;
import java.util.Scanner;

public class Etkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int derece;
       System.out.print("Hava sicakligini giriniz: "); 
       derece = input.nextInt();
       if(derece<5){
           System.out.println("Kayak yapmaya gidiniz.");
       }
       else if(5<derece&&derece<15){
        System.out.println("Sinemaya gidiniz.");
    }
    else if(15<derece&&derece<25){
        System.out.println("Piknik yapmaya gidiniz.");
    }
    else if(25<derece&&derece<35){
        System.out.println("Yuzmeye gidiniz.");
    }
    else{
        System.out.println("Tanimlanamayan islem.");
    }
        
        
        
        
        
        
        
        input.close();
    }
}
