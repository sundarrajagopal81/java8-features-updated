package src.interview.feb2024;

import java.util.Arrays;

public class CharWithOccurance {
    public static void main(String[] args) {
        charWithOccurance("rrrrrrrrrrrrrrrrrrrSundarrr",'r');
    }
    static void charWithOccurance(String str, char ch){
        if(str.indexOf(ch)==-1){
            System.out.println("No char avaiable..");
            System.exit(0);
        }

        char[] charArr = str.toCharArray();
        int count =1;
//        for(int index =0 ;index < str.length(); index++){
//
//             if(charArr[index] == ch){
//               charArr[index] = String.valueOf(count).charAt(0);
//               count++;
//            }
//        }

        for(int index =0; index < str.length();index++){
            char chr = str.charAt(index);
            if(chr == ch){
              str =   str.replaceFirst(String.valueOf(ch),String.valueOf(count));
              count++;
            }
        }

        System.out.println(str);

    }
}
