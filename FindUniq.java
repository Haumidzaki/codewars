/*
There is an array with some numbers. All numbers are equal except for one. Try to find it!

Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
It’s guaranteed that array contains at least 3 numbers.

The tests contain some very huge arrays, so think about performance.

This is the first kata in series:

Find the unique number (this kata)
Find the unique string
Find The Unique
*/

public class FindUniq {
    public static double findUniq(double arr[]) {
        double first = arr[0];
        int count = 0;
        double res = 0;

        for (int i = 1; i < arr.length; i++) {

            if (Double.compare(first, arr[i]) == 0) count++;
            if (count == 3) break;
        }

        if (count == 0) {
            res = first;
        } else {
            for (Double d : arr) {
                if (d.compareTo(first) != 0) {
                    res = d;
                    break;
                }
            }
        }
        return res;
    }
}
