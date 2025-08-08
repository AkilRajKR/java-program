package string;

import java.util.Scanner;

public class asciichar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name=sc.nextLine();
        for(int i=0;i<name.length();i++){
            char c=name.charAt(i);
            System.out.println(i+"->"+(int)c+"->"+c);//note chage of datatype
        }
        sc.close();
    }
}/*
Enter the name: akil
0->97->a
1->107->k
2->105->i
3->108->l */
