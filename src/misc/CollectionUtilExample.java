package misc;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtilExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("orange");

        List<String> list2 = new ArrayList<>();
        list2.add("orange");
        list2.add("apple");

        // Example of using CollectionUtils.intersection
        List<String> intersection = new ArrayList<>(CollectionUtils.intersection(list1, list2));
        System.out.println("Intersection: " + intersection); // Output: [banana]

        // Example of using CollectionUtils.union
        List<String> union = new ArrayList<>(CollectionUtils.union(list1, list2));
        System.out.println("Union: " + union); // Output: [apple, banana, orange, grape]

        // Example of using CollectionUtils.disjunction
        List<String> disjunction = new ArrayList<>(CollectionUtils.disjunction(list1, list2));
        System.out.println("Disjunction: " + disjunction); // Output: [apple, orange, grape]
        List<String>newcollection=new ArrayList<>(CollectionUtils.retainAll(list1,list2));
        System.out.println(newcollection);

    }
}
