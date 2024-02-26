package src.interview.feb2024;

public class ReverseEachWord {
    public static void main(String[] args) {
        String words = "Sundar Mercy Snow";
        reveseWords(words.split("//s+"));
        reverseWor(words);
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

    //******

     static void reverseWor(String settence) {
        // settence = "you shall not pass";
        String words[] = settence.split(" ");
        String ans = "";
        for(int index = words.length-1; index>=0; index--){
            ans=ans+words[index]+" ";
        }
        System.out.println(ans);

        //output : pass not shall you

    }
}
