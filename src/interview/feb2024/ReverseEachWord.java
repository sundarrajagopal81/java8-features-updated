package src.interview.feb2024;

public class ReverseEachWord {
    public static void main(String[] args) {
        String words = "Sundar Mercy Snow";
        reveseWords(words.split("//s+"));
    }

    static void reveseWords(String[] words){

        String  output = "";
        for(String word : words){
            String resultWord="";
            for(int index=word.length()-1; index>=0;index--){
                resultWord+=word.charAt(index)+" ";
            }

            output =output + resultWord;
        }
        System.out.println(output);
    }
}
