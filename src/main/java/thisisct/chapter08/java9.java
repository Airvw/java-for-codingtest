package thisisct.chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class java9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] coins = new int[n];
        int[] dp = new int[10001];
        Arrays.fill(dp, 10001);

        for(int i = 0; i < n; i++) coins[i] = sc.nextInt();

        dp[0] = 0;
        for(int i = 0; i < n; i++){  // 0, 1
            for(int j = coins[i]; j <= m; j++){
                if(dp[j - coins[i]] != 10001) dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
            }
        }

        if(dp[m] == 10001) System.out.println(-1);
        else System.out.println(dp[m]);
    }
}
