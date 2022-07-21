package thisisct.chapter06;

import java.util.*;

class Fruit1 implements Comparator<Fruit1> {

    private String name;
    private int cnt;

    public Fruit1(String name, int cnt){
        this.name = name;
        this.cnt = cnt;
    }

    public String getName() {
        return name;
    }

    public int getCnt() {
        return cnt;
    }

    @Override
    public int compare(Fruit1 o1, Fruit1 o2) {
        if(o1.getCnt() < o2.getCnt()) return -1;
        if(o1.getCnt() > o2.getCnt()) return 1;
        return 0;
    }


}

public class java5int {

    public static void main(String[] args) {
        List<Fruit1> fruitList = new ArrayList<>();
        fruitList.add(new Fruit1("바나나", 2));
        fruitList.add(new Fruit1("당근", 3));
        fruitList.add(new Fruit1("사과", 5));

        fruitList.sort();

        Collections.sort(fruitList, );

        fruitList.stream()
                .forEach(f -> System.out.print("(" + f.getName() + ", " + f.getCnt() + "), "));
    }
}

