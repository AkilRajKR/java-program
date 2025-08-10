package string;

import java.util.Scanner;

public class uppercase {
    public static void main(String[] args){
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name=sc.nextLine();
        
        for (int i=0;i<name.length();i++){
            char c=name.charAt(i);
            if(Character.isUpperCase(c)){
                count++;
                System.out.println(c);
            }
            

        }    System.out.print("total upercase: "+count);
sc.close();
    }
}
/* Enter the name: AkilRaj K R
A
R
K
R
total upercase: 4
 */