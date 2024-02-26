package src.interview.feb2024;

import java.util.Arrays;

public class CharacterSorting {

    public static void main(String[] args) {

        sortWord("sundar");

    }

    static void sortWord(String word){

        //Approach - 1
        char[] chArr = word.toCharArray();
        char temp;
        for(int i =0 ; i < chArr.length;i++){
            for(int j=i+1;j < chArr.length ; j++){
                if(chArr[i] > chArr[j]){
                temp = chArr[i];
                chArr[i] = chArr[j];
                chArr[j]= temp;
            }}
        }
        System.out.println(new String(chArr));

        // Approach -2

       char[] chArrs= word.toCharArray();

        Arrays.sort(chArrs);

        System.out.println(chArrs);






    }
}
