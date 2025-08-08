

package oops.function;
import java.util.Scanner;
public class returnfun {
    int getsop(int money){
        int price=18;
        int bal=money-price;
        return bal;
   
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the money give: ");
        int money=sc.nextInt();

        returnfun ret=new returnfun();
        int balan=  ret.getsop(money);
        System.out.println("Return money: "+balan);
sc.close();
    }

}
