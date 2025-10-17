import java.util.*;

 public class Incremental_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int maxA = 0;
            for (int i = 0; i < m; i++) {
                int val = sc.nextInt();
                maxA = Math.max(maxA, val);
            }
            int count = n - maxA + 1;
            System.out.println(count);
        }

        sc.close();
    }
}
