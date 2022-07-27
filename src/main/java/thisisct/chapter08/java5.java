package thisisct.chapter08;

import java.util.Scanner;

public class java5 {

    public static int[] dp = new int[30001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(makeOne(n));
    }

    private static int makeOne(int n) {

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + 1;
            if(i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            if(i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            if(i % 5 == 0) dp[i] = Math.min(dp[i], dp[i / 5] + 1);
        }
        return dp[n];
    }
}
