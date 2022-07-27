package thisisct.chapter08;

import java.util.Scanner;

public class java6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dp = new int[n];
        for(int i = 0; i < n; i++) dp[i] = scanner.nextInt();
        System.out.println(getScore(dp, n));
    }

    private static int getScore(int[] dp, int n) {
        dp[2] = dp[2] + dp[0];
        for(int i = 3; i < n; i++){
            dp[i] = Math.max(dp[i] + dp[i - 2], dp[i] + dp[i - 3]);
        }

        return Math.max(dp[n - 2], dp[n - 1]);
    }
}
