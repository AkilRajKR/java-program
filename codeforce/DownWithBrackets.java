import java.util.Scanner;

public class DownWithBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();    
        int count=0;     
        while (t-- > 0) {
            String s = sc.nextLine();
            int n = s.length();
            if (n == 2) {
                System.out.println("NO");
                continue;
            }
            boolean allNested = true;
            if (s.charAt(0) == '(' && s.charAt(n - 1) == ')') {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
