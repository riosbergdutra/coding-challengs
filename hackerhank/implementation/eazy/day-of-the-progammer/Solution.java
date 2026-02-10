import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.time.format.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        int dayOfYear = 256;
        
        DateTimeFormatter formatter = 
        DateTimeFormatter.ofPattern("dd.MM.yyyy");
        
        LocalDate date = LocalDate.ofYearDay(year, dayOfYear);
        String  result = date.format(formatter);

        if(year % 4 == 0 && year < 1918){
           date = LocalDate.of(year, 9, 12);
           result = date.format(formatter);
        } else if (year == 1918){
           date = LocalDate.of(year, 9, 26);
           result = date.format(formatter);
        } else if ((year % 400 == 0) || 
            (year % 4 == 0 && year % 100 != 0)) {
            date = LocalDate.of(year, 9, 12);
            result = date.format(formatter);
}
        

        return result;
        
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
