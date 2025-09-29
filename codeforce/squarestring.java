import java.util.*;

public class squarestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int j = 0; j < t; j++) {
            String inp = sc.nextLine();
            int len = inp.length();

            if (len % 2 != 0) {
                System.out.println("NO");
            } else {
                String firstHalf = inp.substring(0, len / 2);
                String secondHalf = inp.substring(len / 2);

                if (firstHalf.equals(secondHalf)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

        sc.close();
    }
}
