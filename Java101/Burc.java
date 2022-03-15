package Java101;
import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int gun=0,ay=0;
System.out.print("Dogdugunuz gunu giriniz: ");
gun = input.nextInt();
System.out.print("Dogdugunuz ayi giriniz: ");
ay = input.nextInt();
if(ay == 12 || ay == 1){
    if(gun > 21 && ay ==12){
        System.out.println("Burcunuz Oglak");
    }else if(gun < 20 && ay ==1){
        System.out.println("Burcunuz Oglak");
    }
}       
        if(ay == 1 || ay == 2){
            if(gun > 20 && ay ==1){
                System.out.println("Burcunuz Kova");
            }else if(gun < 19 && ay ==2){
                System.out.println("Burcunuz Kova");
            }
        }
        
        if(ay == 2 || ay == 3){
            if(gun > 19 && ay ==2){
                System.out.println("Burcunuz Balik");
            }else if(gun < 20 && ay ==3){
                System.out.println("Burcunuz Balik");
            }
        }
        if(ay == 3 || ay == 4){
            if(gun > 20 && ay ==3){
                System.out.println("Burcunuz Koc");
            }else if(gun < 20 && ay ==4){
                System.out.println("Burcunuz Koc");
            }
        }
        if(ay == 4 || ay == 5){
            if(gun > 20 && ay ==4){
                System.out.println("Burcunuz Boga");
            }else if(gun < 21 && ay ==5){
                System.out.println("Burcunuz Boga");
            }
        }
        if(ay == 5 || ay == 6){
            if(gun > 21 && ay ==6){
                System.out.println("Burcunuz Ikizler");
            }else if(gun < 22 && ay ==7){
                System.out.println("Burcunuz Ikizler");
            }
        }
        if(ay == 6 || ay == 7){
            if(gun > 22 && ay ==6){
                System.out.println("Burcunuz Yengec");
            }else if(gun < 22 && ay ==7){
                System.out.println("Burcunuz Yengec");
            }
        }
        if(ay == 7 || ay == 8){
            if(gun > 22 && ay ==7){
                System.out.println("Burcunuz Aslan ");
            }else if(gun < 22 && ay ==8){
                System.out.println("Burcunuz Aslan ");
            }
        }
        if(ay == 8 || ay == 9){
            if(gun > 22 && ay ==8){
                System.out.println("Burcunuz Basak");
            }else if(gun < 22 && ay ==9){
                System.out.println("Burcunuz Basak");
            }
        }
        if(ay == 9 || ay == 10){
            if(gun > 22 && ay ==9){
                System.out.println("Burcunuz Terazi");
            }else if(gun < 22 && ay ==10){
                System.out.println("Burcunuz Terazi");
            }
        }
        if(ay == 10 || ay == 11){
            if(gun > 22 && ay ==10){
                System.out.println("Burcunuz Akrep");
            }else if(gun < 21 && ay ==11){
                System.out.println("Burcunuz Akrep");
            }
        }
        if(ay == 11 || ay == 12){
            if(gun > 21 && ay ==11){
                System.out.println("Burcunuz Yay");
            }else if(gun < 21 && ay ==12){
                System.out.println("Burcunuz Yay");
            }
        }
        
input.close();
    }
}
