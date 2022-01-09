package harfsayma;
import java.util.Scanner;
public class Harfsayma{
public static void main(String[] args){
  Scanner scan=new Scanner(System.in);
  System.out.println("Sayı giriniz.");
        int sayı1=scan.nextInt();
        System.out.println("Sayı giriniz");
        int sayı2=scan.nextInt();
        int max=sayı1*sayı2;
        int ekok=0;
        for(int i=max;i>0;i--){
            if(i%sayı1==0 && i%sayı2==0){
                ekok=i;
            }
        }        
        System.out.println("Ekok=" + ekok);
        
    }}
