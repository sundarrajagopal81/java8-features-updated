package src;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,1,2,3,4,3,5);
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8);


        Set<Integer> set1 = new LinkedHashSet<>(list1);
        Set<Integer> set2 = new LinkedHashSet<>(list2);

       


    }
}
