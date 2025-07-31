
import java.util.Scanner;
public class Numsttoend {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Start num");
        int a=sc.nextInt();
        System.out.println("last num");
        int b=sc.nextInt();

        for(int i=a;i<=b;i++){
               System.out.print(i+" ");
        }    sc.close();
    }

}
