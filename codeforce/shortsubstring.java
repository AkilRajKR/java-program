import java.util.*;

public class shortsubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume newline

        while (t-- > 0) {
            String b = sc.nextLine();
            StringBuilder a = new StringBuilder();
            a.append(b.charAt(0));
            for (int i = 1; i < b.length(); i += 2) {
                a.append(b.charAt(i));
            }
            System.out.println(a.toString());
        }
        sc.close();
    }
}
