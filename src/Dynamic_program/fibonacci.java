package Dynamic_program;
import java.util.*;
public class fibonacci {
    static int[] dp;
//top down
        public static int nthfib(int n) {
            dp = new int[n + 1];
            for(int i=0;i<=n;i++){      // Initialize all values as -1
               dp[i]=-1;
            }
            return fib(n);
        }

        public static int fib(int n) {
          if(n==0||n==1)return n;
            if (dp[n]!= -1) return dp[n];
            dp[n] = fib(n - 1) + fib(n - 2);
            return dp[n];
        }

        public static void main(String[] args) {
            int n = 10;
            System.out.println("Fibonacci of " + n + " = " + nthfib(n));
        }
    }