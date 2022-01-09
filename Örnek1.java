
package örnek1;
import java.util.Objects;
import java.util.Scanner;

public class Örnek1 {
    public static void main(String[] args) {
    Scanner klavye=new Scanner (System.in);
    System.out.println("A Sayısını Giriniz");
    Double A=klavye.nextDouble();
    System.out.println("B Sayısını giriniz");
    Double B=klavye.nextDouble();
    if(Objects.equals(A,B))
    System.out.println("A EŞİT B");
    else if(A>B)
    System.out.println("A BÜYÜKTÜR");
    else System.out.println("B BÜYÜKTÜR");
    
    
    }}
    

