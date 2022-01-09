package fibonachi;
public class Fibonachi{
    public static void main(String[] args){
        int birinci= 1;
        int ikinci=1;
    System.out.print(birinci+ " "+ikinci+" ");
    int yeni;
    for(int i=1;i<9;i++){
    yeni=birinci+ikinci;
        System.out.print(yeni+" ");
    birinci=ikinci;
    ikinci=yeni;
    }
     
    }
}

