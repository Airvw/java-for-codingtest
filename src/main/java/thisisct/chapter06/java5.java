package thisisct.chapter06;


import java.util.ArrayList;
import java.util.*;

class Fruit{

    private String name;
    private int cnt;

    public Fruit(String name, int cnt){
        this.name = name;
        this.cnt = cnt;
    }

    public String getName() {
        return name;
    }

    public Integer getCnt() {
        return cnt;
    }
}

public class java5 {

    public static void main(String[] args) {
        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit("바나나", 2));
        fruitList.add(new Fruit("당근", 3));
        fruitList.add(new Fruit("사과", 5));

        fruitList.sort((o1, o2) -> o1.getCnt().compareTo(o2.getCnt()));

        fruitList.stream()
                .forEach(f -> System.out.print("(" + f.getName() + ", " + f.getCnt() + "), "));
    }
}
