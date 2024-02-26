package src.interview.feb2024;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstrwithoutRepeatingChar {

    public static void main(String[] args) {


        lengthOfLongestSubString("abbac");

        lengthOfLongestSubString("java");


    }

    static void  lengthOfLongestSubString(String str){
        String longestSubString = null;
        int longestSubstringLength = 0;
        Map<Character,Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        for(int index =0 ;index < arr.length; index++) {
            char ch = arr[index];
            if (!map.containsKey(ch)) {
                map.put(ch, index);
            } else {
                index = map.get(ch);
                map.clear();
            }

            if(map.size() > longestSubstringLength){
                longestSubstringLength = map.size();
                longestSubString = map.keySet().toString();
            }
        }

        System.out.println("The longest substring:"+longestSubString);
        System.out.println("The longest Substring length:"+longestSubstringLength);

    }
}
