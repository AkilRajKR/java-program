import java.util.*;
public class lovestory {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.nextLine();
        for(int j=0;j<a;j++){
            String inp=sc.nextLine();
            String given="codeforces";
            int count=0;
            for(int i=0;i<given.length();i++){
                if(given.charAt(i)!=(inp.charAt(i))) count++;
            }
            System.out.println(count);
        }
        
        sc.close();
    }
}
