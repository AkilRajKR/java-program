package array;
import java.util.Scanner;
public class forlooparray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array");
        int a=sc.nextInt();
         int[] arr=new int[a];
        for(int i=0;i<a;i++){
            System.out.print("Enter "+i +" number: ");
            arr[i]=sc.nextInt();
        }
          for(int i=0;i<a;i++){
             System.out.print("array "+i +" =>: ");
            System.out.println(arr[i]);
          }

          System.out.print("Middle element: ");
         int c=a/2;
            System.out.println(arr[c]);

         sc.close();
    }
}
/*Enter the size of array
7
Enter 0 number: 25
Enter 1 number: 65
Enter 2 number: 32
Enter 3 number: 87
Enter 4 number: 959
Enter 5 number: 654
Enter 6 number: 321
array 0 =>: 25
array 1 =>: 65
array 2 =>: 32
array 3 =>: 87
array 4 =>: 959
array 5 =>: 654
array 6 =>: 321
Middle element: 87
PS E:\placement\java\array> java .\forlooparray.java
Enter the size of array
4
Enter 0 number: 25
Enter 1 number: 32
Enter 2 number: 41
Enter 3 number: 54
array 0 =>: 25
array 1 =>: 32
array 2 =>: 41
array 3 =>: 54
Middle element: 41 */