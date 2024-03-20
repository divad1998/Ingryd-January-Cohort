package Week5;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {

    public static void main(String[] args) {
        //does the new var replace the old var?
        Set<Integer> set = new HashSet<>();
        var firstVar = 1;
        var secondVar = 1;

        set.add(firstVar);
        set.add(secondVar);

        System.out.println("This set contains firstVar: " + set.contains(firstVar));
        System.out.println("This set contains secondVar: " + set.contains(secondVar));

        System.out.println(set);

    }
}
