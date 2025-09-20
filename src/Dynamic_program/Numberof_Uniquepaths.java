package Dynamic_program;

import java.util.Scanner;

public class Numberof_Uniquepaths {
    static int dp[][];
    public static int Numberofuniquepaths(int m,int  n){
        if(m==1||n==1)return 1;
        if(m==0||n==0)return 0;
        if(dp[m][n]!=-1)return dp[m][n];
        int rt=Numberofuniquepaths(m,n-1);
        int down=Numberofuniquepaths(m-1,n);
        return dp[m][n]=rt+down;
    }
    public static int uniquepaths(int m,int  n){
        dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        return Numberofuniquepaths(m,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of row");
        int m=sc.nextInt();
        System.out.println("enter no. of column");
        int n= sc.nextInt();
        System.out.println(uniquepaths(m,n));
    }
}
