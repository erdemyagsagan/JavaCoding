package Java101;
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int yil;
System.out.print("Yil giriniz: ");
yil = input.nextInt();

if(yil % 4 == 0){
    if(yil % 100 != 0){
        System.out.println(yil + " Artik Yildir");
    }
    else if((yil % 100 == 0) && (yil % 400 == 0)){
         System.out.println(yil + " Artik Yildir");
    }else{
         System.out.println(yil + " Artik Yil Degildir.");
     }
}
else{
    System.out.println(yil + " Artik Yil Degildir.");
}    
    input.close();
    }
}
