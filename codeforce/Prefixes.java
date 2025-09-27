
import java.util.*;

public class Prefixes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] arr = s.toCharArray();

        int ops = 0;

        for (int i = 0; i < n; i += 2) {
            if (arr[i] == arr[i + 1]) {
                arr[i + 1] = (arr[i] == 'a') ? 'b' : 'a';
                ops++;
            }
        }

        System.out.println(ops);
        System.out.println(new String(arr));
        sc.close();
    }
}

