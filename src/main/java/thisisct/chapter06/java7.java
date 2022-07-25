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

        // comparing(Student::getScore) -> naturalOrder와 같은 keyExtractor 없어서
        // 고민하다가 매개변수가 없는 경우 기본적으로 naturalOrder를 사용하는 건가라는 생각을 했다.
        // 이 생각이 맞는지 확인이 필요하다.
        studentList.sort(Comparator.comparing(Student::getScore));

        for(Student s : studentList){
            System.out.println(s.getName());
        }
    }
}
