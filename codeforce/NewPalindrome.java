import java.util.*;

public class NewPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int tc = 0; tc < t; tc++) {
            String s = sc.nextLine().trim();
            int n = s.length();

            int[] cnt = new int[26];
            for (int i = 0; i < n; i++) {
                cnt[s.charAt(i) - 'a']++;
            }

            int distinct = 0;
            for (int i = 0; i < 26; i++) {
                if (cnt[i] > 0) distinct++;
            }

            if (distinct == 1) {
                           System.out.println("NO");
                continue;
            }
 int halfDistinct = 0;
            for (int i = 0; i < 26; i++) {
                if (cnt[i] / 2 > 0) halfDistinct++;
            }

            if (halfDistinct > 1) System.out.println("YES");
            else System.out.println("NO");
        }

        sc.close();
    }
}
