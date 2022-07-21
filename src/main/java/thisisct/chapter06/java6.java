package thisisct.chapter06;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class java6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        while(n > 0){
            arr.add(scanner.nextInt());
            n--;
        }
//
//        arr.sort();
    }
}
