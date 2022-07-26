package thisisct.chapter06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class java6array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int num : arr) System.out.println(num);
    }

}
