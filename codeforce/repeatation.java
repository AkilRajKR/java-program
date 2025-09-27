import java.util.Scanner;
public class repeatation {
    public static void main(String[] agrs){
       Scanner sc=new Scanner(System.in);
       
       int a=sc.nextInt();
       sc.nextLine();
         for(int i=0;i<a;i++){
            int count=0;
            String b=sc.nextLine();
            int len =b.length();
             for(int j=0;j<len-1;j++){
                    if(b.charAt(j)==b.charAt(j+1)){
                            count++;
                    }
             }
             System.out.println(count);
         }
         sc.close();
    }
}
