package oops;

import java.util.Scanner;

public class find {  //class
    


    void evenorodd(int num){   //function
        if(num%2==0){
            System.out.println(num+" is a Even number");
        }
        else{
            System.out.println(num+" is a odd number");
        }
    }

    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);   //object
              System.out.print("Enter the number: ");
            int a=sc.nextInt();


        find fn=new find();
        fn.evenorodd(a);
        sc.close();
    }
}
/*PS E:\placement\java\oops> java .\find.java
Enter the number: 956158
956158 is a Even number
PS E:\placement\java\oops> java .\find.java
Enter the number: 447
447 is a odd number */