package src.interview.feb2024;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountCharsInAString {

    public static void main(String[] args) {

        String settence = "sundarrajagopal";

        countChars(settence.toCharArray());

    }

    private static void countChars(char[] charArr) {
        Map<Character,Integer> map = new HashMap<>();
        for(Character  character : charArr){
            if(map.containsKey(character)){
                map.put(character, map.get(character)+1);
            }else{
                map.put(character,1);
            }
        }

        System.out.println(map);
    }


}
