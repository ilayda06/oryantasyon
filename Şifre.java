package şifre;
import java.util.Scanner;
public class Şifre{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
String şifre= "1978";
    System.out.println("Şifre giriniz.");
String girilen= scan.nextLine();
if(şifre.equals(girilen)){
    System.out.println("Giriş başarılı");
}
else{
    System.out.println("Giriş başarısız");
}
    }
}