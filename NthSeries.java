import java.text.DecimalFormat;

/*
Task:
Your task is to write a function which returns the sum of following series upto nth term(parameter).

Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
Rules:
You need to round the answer to 2 decimal places and return it as String.

If the given value is 0 then it should return 0.00

You will only be given Natural Numbers as arguments.

Examples:
SeriesSum(1) => 1 = "1.00"
SeriesSum(2) => 1 + 1/4 = "1.25"
SeriesSum(5) => 1 + 1/4 + 1/7 + 1/10 + 1/13 = "1.57"
*/

public class NthSeries {

    public static String seriesSum(int n) {
        double res = 0;
        double count = 1;
        int del = 4;
        if(n == 0){
            return new DecimalFormat("#0.00").format(0).replace(",", ".");
        }else if(n == 1){
            return new DecimalFormat("#0.00").format(count).replace(",", ".");
        }else {
            for (int i = 0; i < n;  i++){
                if(i > 0){
                    res += count/del;
                    del += 3;
                }
            }
            res += count;
            return  new DecimalFormat("#0.00").format(res).replace(",", ".");
        }
    }
}
