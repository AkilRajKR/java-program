import java.util.*;

public class creatingwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < t; i++) {
            String[] arr = sc.nextLine().split(" ");
            String a = arr[0];
            String b = arr[1];

            String newA = b.charAt(0) + a.substring(1);
            String newB = a.charAt(0) + b.substring(1);

            System.out.println(newA + " " + newB);
        }
        sc.close();
    }
}
/*import java.util.*;

public class creatingwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        for (int i = 0; i < t; i++) {
            String[] arr = sc.nextLine().split(" ");
            String a = arr[0];
            String b = arr[1];

            // Convert to char arrays
            char[] ca = a.toCharArray();
            char[] cb = b.toCharArray();

            // Swap the first characters
            char temp = ca[0];
            ca[0] = cb[0];
            cb[0] = temp;

            // Build new strings
            a = new String(ca);
            b = new String(cb);

            System.out.println(a + " " + b);
        }

        sc.close();
    }
}
 */