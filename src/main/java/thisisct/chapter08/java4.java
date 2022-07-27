package thisisct.chapter08;

import java.util.Scanner;

public class java4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dp = new int[n + 1];
        System.out.println(makeOne(dp, n));
    }

    private static int makeOne(int[] dp, int n) {
        dp[2] = 1;
        dp[3] = 1;
        dp[5] = 1;

        for(int i = 4; i <= n; i++){
            if(dp[i] == 0) dp[i] = (int)1e9;

            if(i % 5 == 0) dp[i] = Math.min(dp[i], dp[i / 5] + 1);
            if(i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            if(i % 2 == 0) dp[i] = Math.min(dp[i] ,dp[i / 2] + 1);
            dp[i] = Math.min(dp[i], dp[i - 1] + 1);
        }
        return dp[n];
    }
}
