import java.util.*;
public class digitminimization {
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        for(int i=0;i<a;i++){
            int b=sc.nextInt();
            if(b<100&&b>10){
                System.out.println(b%10);
            }else{
                int min=Integer.MAX_VALUE;
                while(b!=0){
                    int temp=b%10;
                    min=temp<min?temp:min;
                    b/=10;
                }
                System.out.println(min);
            }
        }
        sc.close();
    }
}
