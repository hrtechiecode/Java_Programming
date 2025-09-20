package Dynamic_program.tabulation;

public class Fibonacci {
    public static int fib(int n){
        int []dp=new int[n+1];
        dp[0] = 0; // Fix 2: base case
        dp[1] = 1; // Fix 2: base case
       for(int i=2;i<=n;i++){
           dp[i]=dp[i-1]+dp[i-2];
       }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(Fibonacci.fib(n));
    }
}
