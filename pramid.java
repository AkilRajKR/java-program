import java.util.Scanner;

public class pramid {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the height of pramid: ");
      int a=sc.nextInt();

     for (int i=0;i<a;i++){
        for (int j=(a-i)-1;j>0;j--){
            System.out.print(" ");
        }
        for (int k=0;k<=i;k++){
            System.out.print((i+1)+" ");
        }System.out.println();
      }  

      for (int i=a-1;i>0;i--){
        for (int j=(a-i);j>0;j--){
            System.out.print(" ");
        }
        for (int k=0;k<i;k++){
            System.out.print((i)+" ");
        }System.out.println();
      }
sc.close();

    }
}

/*EEnter the height of pramid: 4
   1 
  2 2
 3 3 3
4 4 4 4
 3 3 3
  2 2
   1 */

   



 