
package terstencümleyazma;
import java.util.Scanner;
public class Terstencümleyazma {
public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
      System.out.println("Cümle giriniz.");
      String cumle=scan.nextLine();
      for(int i=cumle.length()-1;i>=0;i--){
          System.out.print(cumle.charAt(i));}
                  
      
    }
    
}
