package src.interview;

import java.util.Arrays;

public class Anagram {
    public static void main(String args[]){

        String name = "Sundar";
        String name1 = "radunS";

        name.toLowerCase();
        name1.toLowerCase();

        int nameLen  = name.length();
        int name1Len = name.length();

        if(name1Len==name1Len){


            char[] nameArr = name.toCharArray();
            char[] name1Arr = name1.toCharArray();

            Arrays.sort(nameArr);
            Arrays.sort(name1Arr);

            boolean isEqual =  Arrays.equals(nameArr,name1Arr);

            if(isEqual){
                System.out.println(name+","+name+" Are anagram");
            }else{
                System.out.println(name+" ,"+ name1+" Are not anagram");
            }



        }







    }

}
