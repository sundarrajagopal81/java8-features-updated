package src.interview.feb2024;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharsFromString {
    public static void main(String[] args) {
        String word = "programming";
        removeDuplicateChars(word);
    }

    private static void removeDuplicateChars(String word) {

        System.out.println("Complate string:::"+ word);
        //Approach -1
        StringBuilder stringBuilder = new StringBuilder();
        word.chars().distinct().forEach(p-> stringBuilder.append((char)p));
        System.out.println(stringBuilder);

        //Approach -2

        StringBuilder  stringBuilder1 = new StringBuilder();
        for(int index = 0; index < word.length(); index++){

            char ch = word.charAt(index);
            int chIndex  = word.indexOf(ch,index+1);
            if(chIndex == -1){
                stringBuilder1.append(word.charAt(index));
            }
        }
        System.out.println(stringBuilder1);


        // Approach -3

        char charactors[] = word.toCharArray();
        StringBuilder stringBuilder2 = new StringBuilder();
        for(int index =0; index < charactors.length; index++){
            boolean match = false;
            for(int indexj=index+1; indexj < charactors.length ; indexj++){
                if(charactors[index] == charactors[indexj]) {
                    match = true;
                    break;
                }
            }
            if(!match){
                stringBuilder2.append(charactors[index]);
            }
        }
        System.out.println(stringBuilder2);

        // Approach -4
        StringBuilder stringBuilder3 = new StringBuilder();
        Set<Character> set  = new LinkedHashSet();
        char chars[] =  word.toCharArray();

        for(int index =0; index < word.length(); index++) {
            set.add(chars[index]);
        }

        for(Character character: set)
        {
            stringBuilder3.append(character);
        }

        System.out.println(stringBuilder3);
    }
}
