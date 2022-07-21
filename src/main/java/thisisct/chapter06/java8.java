package thisisct.chapter06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class java8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        Integer[] a = new Integer[n];
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        Integer[] b = new Integer[n];
        for(int i = 0; i < n; i++){
            b[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        int result = 0;

        for(int i = 0; i < k; i++){
            result += b[i];
        }
        for(int i = k; i < n; i++){
            result += a[i];
        }

        System.out.println(result);
    }
}
