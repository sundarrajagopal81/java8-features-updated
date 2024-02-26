package src.interview.feb2024;

public class ReverseTheWords {
    public static void main(String[] args) {
        String settence = "you shall not pass";
        String words[] = settence.split(" ");
        String ans = "";
        for(int index = words.length-1; index>=0; index--){
            ans=ans+words[index]+" ";
        }
        System.out.println(ans);

        //output : pass not shall you

    }
}
