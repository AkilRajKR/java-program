import java.util.Scanner;

public class Arithmeticpro{
    public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     System.out.print("First number: ");
     int a=sc.nextInt();
      System.out.print("Second number: ");
     int b=sc.nextInt();
      System.out.print("Third number: ");
     int c=sc.nextInt();
    
     
     int d=a+b+c;
     int e=a*b*c;

     System.out.println("total multi / total sum: "+(e/d));

    }
}
/*First number:  10
Second number: 20
Third number: 10
total multi / total sum: 50 */