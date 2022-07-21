package thisisct.chapter06;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

class Student1 implements Comparable<Student1>{

    private String name;
    private int score;

    public Student1(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student1 o) {
        return Integer.compare(this.score, o.getScore());
    }
}

public class java7colletions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Student1> student1List = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String name = scanner.next();
            int score = scanner.nextInt();
            student1List.add(new Student1(name, score));
        }

        Collections.sort(student1List);

        for (Student1 student1 : student1List) {
            System.out.println(student1.getName());
        }
    }
}
