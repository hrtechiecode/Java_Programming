import java.util.Scanner;

public class Numeric_Pattern {
    public static void numericrect(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            for(int k=1;k<=i-1;k++){
                System.out.print(k);
            }
            System.out.println();

        }
    }
    public static void onetwo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i+j)%2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("2");
                }
            }
            System.out.println();
        }
    }
    public static void trianglenumeric(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void trianglenumeric2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("i/p no. of rows");
        int n=sc.nextInt();
        System.out.println("numericrec");
        numericrect(n);
        System.out.println("onetwo");
        onetwo(n);
        System.out.println("triangle numeric pattern");
        trianglenumeric(n);
        System.out.println("triangle  different numeric pattern");
        trianglenumeric2(n);

    }
}
