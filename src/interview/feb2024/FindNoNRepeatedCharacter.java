package src.interview.feb2024;

import java.util.HashMap;
import java.util.Map;

public class FindNoNRepeatedCharacter {
    public static void main(String[] args) {
        String text = "AABCDBEF";
        findNonRepeat(text);
    }

    static void findNonRepeat(String str){


        //Approach -1 without using the map
        for(int index =0 ; index < str.length(); index++){
            boolean unique = true;
            for(int indexj=0;indexj < str.length(); indexj++){
                if(index!=indexj && str.charAt(index) == str.charAt(indexj)){
                    unique = false;
                    break;
                }
            }
            if(unique){
                System.out.println("============================");
                System.out.println(str.charAt(index));
                break;
            }
        }

        //Approach -2 withusing map

        Map<Character,Integer> map = new HashMap<>();
        for(int index =0; index < str.length(); index++){
            char ch = str.charAt(index);
            if(map.containsKey(str.charAt(index))){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch, 1);
            }
        }

        for(Map.Entry<Character,Integer> entrySet: map.entrySet()){
            System.out.println("^^^^^^^^^^^^^^^^^^^");
            if(entrySet.getValue()==1){
                System.out.println(entrySet.getKey());
               break;
            }
        }



    }

}
