package Java101;
import java.util.Scanner;

public class Basamak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.print("Enter the number: ");
int number = input.nextInt();
int tempNumber,tempNumber2=0;
while(number != 0 ){
    tempNumber = number % 10;
    number = number / 10;
tempNumber2 += tempNumber;
}
System.out.println(""+tempNumber2);
input.close();
    }
}
