package thisisct.chapter07;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class java5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hashSet.add(scanner.nextInt());
        }
        int m = scanner.nextInt();
        int[] targets = new int[m];
        for(int i = 0; i < m; i++){
            targets[i] = scanner.nextInt();
        }

        for(int target : targets){
            if(hashSet.contains(target))
                System.out.print("yes ");
            else System.out.print("no ");
        }

    }
}
