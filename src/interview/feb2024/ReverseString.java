package src.interview.feb2024;

public class ReverseString {
    public static void main(String[] args) {
        reverseString("hello");
    }

    static void reverseString(String word){
        //Approach - 1;
        for(int index=word.length()-1;index>=0;index--){
            System.out.print(word.charAt(index));
        }
        //Approach - 2;
        System.out.println("\n++++++++++++++++++++++++++");
        char[] wordChars=word.toCharArray();
        for(int index=wordChars.length-1; index>=0; index--){
            System.out.print(wordChars[index]);
        }
        //Approach -3
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
