import java.util.*;
public class subsequence_permutation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<a;i++){
            int b=sc.nextInt();
            sc.nextLine();
            String c=sc.nextLine();
            char[] d=c.toCharArray();
            char[] temp=c.toCharArray();
            Arrays.sort(d);
            int count=0;
            for(int j=0;j<b;j++){
                    
                    if(temp[j]!=d[j]) count++;
            }
            System.out.println(count);
        }
        sc.close();        
    }
}
