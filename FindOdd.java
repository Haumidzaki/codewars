import java.util.*;
import java.util.stream.Collectors;

/*
Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.
*/

public class FindOdd {
    public static int findIt(int[] a) {
        int res = 0;
        List<Integer> listInt = Arrays.stream(a).boxed().collect(Collectors.toList());

        for(Integer i : listInt){
            if(Collections.frequency(listInt,i) % 2 == 1){
                res = i;
                break;
            }
        }
        return res;
    }
}
