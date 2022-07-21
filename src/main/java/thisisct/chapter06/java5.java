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

        // List<E>의 default method인 sort를 사용. Collections.sort(fruitList, Comparator)를 활용하는 것과 같은 의미.
        fruitList.sort(Comparator.comparing(Fruit::getCnt));

        fruitList
                .forEach(f -> System.out.print("(" + f.getName() + ", " + f.getCnt() + "), "));
    }
}
