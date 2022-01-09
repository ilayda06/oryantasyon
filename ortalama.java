
package ortalama;
import java.util.Scanner;
public class ortalama {
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
    System.out.println("Birinci sayıyı giriniz.");
    int sayı1=scan.nextInt();
    System.out.println("İkinci sayıyı giriniz");
    int sayı2=scan.nextInt();
  float toplam=sayı1+sayı2;
  float ortalama=toplam/2;
   
    System.out.println(ortalama);
    
        
    } 
}