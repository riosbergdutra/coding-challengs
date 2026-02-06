import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int negative = 0;
        int positive = 0;
        int zero = 0;
        
        for(int num : arr){
            if(num > 0){
            positive++;
            } else if(num < 0){
                negative++;
            }else{
                zero++;
            }
        }
      double p = (double) positive / arr.size();
      double n = (double) negative / arr.size();
      double z = (double) zero / arr.size();
      DecimalFormat df = new DecimalFormat("0.000000");
      
      System.out.println(df.format(p));
      System.out.println(df.format(n));
      System.out.println(df.format(z));

  
    }

    }


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
