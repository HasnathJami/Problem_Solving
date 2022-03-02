// { Driver Code Starts

import java.util.*;
import java.lang.*;
import java.io.*;

class Anagram {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str = br.readLine();
            String s1 = str.split(" ")[0];
            String s2 = str.split(" ")[1];

            Solution obj = new Solution();

            if (obj.isAnagram(s1, s2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }


        }
    }
}// } Driver Code Ends


class Solution {
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a, String b) {
        // Your code here
        int check = 0;
        TreeMap<Character, Integer> hm = new TreeMap();

        for (int i = 0; i < a.length(); i++) {
            if (hm.containsKey(a.charAt(i))) {
                hm.put(a.charAt(i), hm.get(a.charAt(i)) + 1);
            } else {
                hm.put(a.charAt(i), 1);
            }

        }

        //System.out.println(hm.values());

        for (int i = 0; i < b.length(); i++) {
            if (hm.containsKey(b.charAt(i))) {
                hm.put(b.charAt(i), hm.get(b.charAt(i)) - 1);
            } else {
                hm.put(b.charAt(i), 1);
            }
        }

        //System.out.println(hm.values());

        for (int i : hm.values()) {
            if (i != 0) {
                return false;
            }
        }

//        for(Map.Entry m:hm.entrySet())
//        {
//            System.out.println(m.getKey()+" "+m.getValue());
//        }


        return true;



    }
}