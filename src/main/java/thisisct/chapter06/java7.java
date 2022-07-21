package thisisct.chapter06;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

class Student{

    private String name;
    private Integer score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }
}

public class java7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Student> studentList = new ArrayList<>();

        for(int i = 0; i < n; i++){
            String input = scanner.nextLine();
            String[] values = input.split(" ");
            studentList.add(new Student(values[0], Integer.parseInt(values[1])));
        }

        studentList.sort((s1, s2) -> s1.getScore().compareTo(s2.getScore()));

        for(Student s : studentList){
            System.out.println(s.getName());
        }
    }
}
