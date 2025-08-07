package pattern;
import java.util.Scanner;
public class number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        for(int i=0;i<a;i++){
           int num = i + 1; // Starting number for each row
            for(int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num + (a - j - 1); // Update number for next column in the row
            }
            System.out.println();
        }
        sc.close();
    }
}
