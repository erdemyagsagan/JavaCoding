package Java101;
import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int yil,zod;
System.out.print("Dogum yilinizi giriniz: ");
yil = input.nextInt();
zod = yil % 12;
switch(zod){
case 0:
System.out.print("Maymun");
 break; 
case 1:
System.out.print("Horoz");
break;
case 2:
System.out.print("Kopek");
break;
case 3:
System.out.print("DOmuz");
break;
case 4:
System.out.print("Fare");
break;
case 5:
System.out.print("Okuz");
break;
case 6:
System.out.print("Kaplan");
break;
case 7:
System.out.print("Tavsan");
break;
case 8:
System.out.print("Ejderha");
break;
case 9:
System.out.print("Yilan");
break;
case 10:
System.out.print("At");
break;
case 11:
System.out.print("Koyun");
break;
}
        input.close();
}
}
