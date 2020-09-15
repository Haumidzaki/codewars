import java.util.Arrays;

/*
You are given an array (which will have a length of at least 3,
but could be very large) containing integers. The array is either
entirely comprised of odd integers or entirely comprised of even
integers except for a single integer N. Write a method that takes
the array as an argument and returns this "outlier" N.

Examples
[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21]
Should return: 160 (the only even number)
*/

public class FindOutlier {

    static int find(int[] integers) {
        int countEvenNumber = 0;
        int countOddNumber = 0;

        for (int i : integers) {

            if (i % 2 == 0) {
                countEvenNumber++;
                if (countEvenNumber == 2) {
                    break;
                }
            } else {
                countOddNumber++;
                if (countOddNumber == 2) {
                    break;
                }
            }
        }

        if (countEvenNumber > 1) {
            return Arrays.stream(integers).filter(x -> (x % 2) == 1 || (x % 2) == -1).findFirst().getAsInt();
        } else {
            return Arrays.stream(integers).filter(x -> (x % 2) == 0).findFirst().getAsInt();
        }
    }
}
