

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.Math.*;

public class commonprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        sc.close();

        long g = gcd(a, b);
        if (g == 1) {
            System.out.println(-1);
            return;
        }
        for (long i = 2; i <=Math.sqrt(g) ; i++) {
            if (g % i == 0) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(g);
    }

    static long gcd(long x, long y) {
        while (y != 0) {
            long temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}


/*Common Prime
87% Success
16302 Attempts
20 Points
1s Time Limit
256MB Memory
1024 KB Max Code
Given two numbers 
 and 
, find the smallest prime number that divides both of them or state that such number does not exist.

Input

First and only line of input contains two integers 
 and 
.

Output

Print the smallest common prime divisor of 
 and 
 or 
 if it does not exist.

Constraints


Examples
Input

3 6
Output

3
Explanation
\(3\) is the smallest common prime factor of \(3\) and \(6\). */