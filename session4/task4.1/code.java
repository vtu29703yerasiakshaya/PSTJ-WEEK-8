import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
 // Use a HashSet to store unique pairs
        Set<String> uniquePairs = new HashSet<>();

        for (int i = 0; i < t; i++) {
            // Combine left and right into a single string key
            String pair = pair_left[i] + "," + pair_right[i];
            uniquePairs.add(pair);

            // Print the current number of unique pairs
            System.out.println(uniquePairs.size());
        }

        s.close();

   }
}
