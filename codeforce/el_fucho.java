import java.util.*;

 public class ElFucho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            int totalMatches = 2 * n - 2;
            System.out.println(totalMatches);
        }

        sc.close();
    }
}
