package Java101;
import java.util.Scanner;

public class SifreEkrani {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String password1,sifirlama;
    String password2 = "erdem";
    
    System.out.print("Sifre giriniz: ");
password1 = input.nextLine();
if(password1 != password2){
System.out.print("Yanlis sifre girdiniz \nSifrenizi sifirlamak istiyor musunuz\n[evet,hayir]: ");
sifirlama = input.nextLine();
switch (sifirlama) {
  case "evet":
  System.out.print("Yeni sifrenizi girniz: ");
  password1 = input.nextLine();
  if(password1 == password2){
    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
  }else{
    System.out.println("Sifre basariyla olusturuldu!");
  }
    break;
case "hayir":
System.out.println("Sistemden cikis yapildi !");
break;
  default:
  System.out.println("Hatali tuslama");
    break;
}
}
if(password1 == password2){
  System.out.println("Basarili !");
}
    input.close();
  } 
  }
    


