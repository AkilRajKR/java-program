package string;

import java.util.Scanner;

public class chars{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
System.out.print("Enter the name: ");
        String name=sc.nextLine();
        for(int i=0;i<name.length();i++){
            char c=name.charAt(i);
            System.out.println(i+"->"+c);
        }

        sc.close();
    }
}
