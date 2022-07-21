package thisisct.chapter07;

import java.util.Scanner;

public class java1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String target = scanner.next();

        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.next();
        }

        System.out.println(sequentialSearch(arr, target));
    }

    private static int sequentialSearch(String[] arr, String target) {
        for(int i = 0; i < arr.length; i++){
            if(target.equals(arr[i])){
                return i + 1;
            }
        }

        return -1;
    }
}
