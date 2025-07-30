import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          System.out.print("Enter number: ");
        int a=sc.nextInt();

        if (a%2==0){
            System.out.println("EVEN");
        }else{
             System.out.println("ODD");
        }
    
    }
}
/*Enter number: 125
ODD */