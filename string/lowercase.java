package string;

import java.util.Scanner;

public class lowercase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the name: ");
        String name=sc.nextLine();
int count=0;
String lw="";
        for(int i=0;i<name.length();i++){

            char c=name.charAt(i);

            if(Character.isLowerCase(c)){
                System.out.println(c);
                count++;
                lw+=c;
            }
        }System.out.println("total lower: "+count);
        System.out.print("str lower: "+lw);
sc.close();
    }
}
/*Enter the name: 
AkilRaj K  R
k
i
l
a
j
total lower: 5str lower: kilaj    */