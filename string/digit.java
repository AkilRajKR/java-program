package string;

import java.util.Scanner;

public class digit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the name: ");
        String name=sc.nextLine();

        for(int i=0;i<name.length();i++){

            char c=name.charAt(i);
            if(Character.isDigit(c))
                 System.out.print(c);

        }
sc.close();
    }
}/*Enter the name: 
Ak9ilraj12
912 */