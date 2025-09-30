import java.util.*;

public class TwoTowers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();
            String u = sc.next();

            if(isBeautiful(s + u) || isBeautiful(u + s)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    private static boolean isBeautiful(String str){
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)) return false;
        }
        return true;
    }
}
