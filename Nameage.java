import java.util.Scanner;
public class Nameage {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
          System.out.print("Enter the name: ");
       String name=sc.nextLine();
          System.out.print("Enter the age: ");
       int age=sc.nextInt();

       System.out.println(name + " " + age);

    }
}
/*Enter the name: abc
Enter the age: 23
abc 23 */