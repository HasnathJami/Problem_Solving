// { Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

public class ValidateAnIPAddress {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution3 obj = new Solution3();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution3 {

    public boolean isValid(String s) {
        // Write your code here

//        String s1 = s.split("\\.")[0];
//        String s2 = s.split("\\.")[1];
//        String s3 = s.split("\\.")[2];
//        String s4 = s.split("\\.")[3];
//

        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) >= '2' && s.charAt(i + 1) >= '5' && s.charAt(i + 2) >= '6') {
                return false;
            }
        }
        // if(  s.matches("[1-9][0-9]{0,2}[.][1-9][0-9]{0,2}[.][1-9][0-9]{0,2}[.][1-9][0-9]{0,2}")  )
        if (s.matches("[1-9]?[1-9]?[0-9][.][1-9]?[1-9]?[0-9][.][1-9]?[1-9]?[0-9][.][1-9]?[1-9]?[0-9]")) return true;

        return false;
    }

}