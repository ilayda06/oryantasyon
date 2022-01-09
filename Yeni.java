
       package yeni;
       import java.util.Scanner;
       public class Yeni{
       public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
       System.out.println("Lütfen bir kelime giriniz.");
       String kelime=scan.nextLine();
       String yenikelime="";
       for(int i=(kelime.length()-1); i>=0;i--){
       yenikelime +=kelime.charAt(i);}
       if(yenikelime.equals(kelime)){
           System.out.println("palindromdur.");}
       else {
           System.out.println("Palindrom değil.");}
       
            
    }
    
}
