package string;


import java.util.Scanner;
public class word {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String name=sc.nextLine();
           System.out.println(name);  //op prints as input
        //System.out.println(name[1]);   gives error as it cannot read character
        sc.close();
    }
}
