package Java101;
import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int a,b,c;
        System.out.println("Ilk sayiyi giriniz: ");
a = input.nextInt();
System.out.println("Ikinci sayiyi giriniz: ");
b = input.nextInt();
System.out.println("Ucuncu sayiyi giriniz: ");
c = input.nextInt();
if(a > b && a > c){
if(b > c){
System.out.println("a > b > c");
}else{
    System.out.println("a > c > b");
}
}
if(b > a && b > c){
    if(a > c){
    System.out.println("b > a > c");
    }else{
        System.out.println("b > c > a");
    }
    }
    if(c > b && a < c){
        if(b > a){
        System.out.println("c > b > a");
        }else{
            System.out.println("c > a > b");
        }
        }

    
        input.close();
    }
}
