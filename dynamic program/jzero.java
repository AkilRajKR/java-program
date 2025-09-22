import java.util.*;
public class jzero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
       int h=0;

       for(int i=0;i<a;i++){
           if(arr[i]!=0){
            arr[h]=arr[i];
            h++;
           }
        }
       for(;h<a;h++){    
            arr[h]=0;  
        }
        System.out.print(Arrays.toString(arr));
        sc.close();
    }
}
/*PS E:\placement\java\dynamic program> javac .\jzero.java
PS E:\placement\java\dynamic program> java .\jzero.java
9
8
0
4
0
2
0
13
55
1005
[8, 4, 2, 13, 55, 1005, 0, 0, 0] */