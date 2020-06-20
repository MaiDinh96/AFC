package app;
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

public class App {
   
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int Alice = 0;
        int Bob = 0;
        List<Integer> result = new LinkedList<Integer>();
                if(a.get(0)>b.get(0))
                    Alice +=1;
                if(a.get(1)==b.get(1))
                        Alice+=0;
                        Bob+=0;
                if(a.get(2)<b.get(2))
                        Bob+=1;
        result.add(0, Alice);
        result.add(1, Bob);
        return result; 
    }

    static long aVeryBigSum(long[] ar) {
        long sum=0;
        for (int i = 0; i < ar.length; i++) {
            sum+=ar[i];
        }
        return sum;
    }

    public int squareDigits(int n) {
        // TODO Implement me
        String result="";
        while(n!=0){
            // select every single element from end to start
            // 9119 > %10 = 9 > "81" > /10= 911
            // 911 > 1 > "1" > "811"
            int digit =n%10;
            result = digit*digit + result;
            n /= 10;
        }
        return Integer.parseInt(result);
      }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}