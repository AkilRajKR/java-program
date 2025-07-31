package pattern;

import java.util.Scanner;

public class rightriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Total length: ");
        int a=sc.nextInt();

        for(int i=0;i<a;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }
   sc.close();
    }
}
/*Total length: 5
* 
* *
* * *
* * * *
* * * * * */