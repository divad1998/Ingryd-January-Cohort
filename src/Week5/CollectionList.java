package Week5;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(90);
        integerList.add(0, 30);
        integerList.addFirst(20);
        System.out.println(integerList);

    }
}
