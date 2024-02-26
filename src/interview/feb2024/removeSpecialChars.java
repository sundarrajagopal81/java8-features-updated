package src.interview.feb2024;

public class removeSpecialChars {

    public static void main(String[] args) {
        String name = "$ja!va$&st%ar%";
        String name1 = name.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(name1);
    }
}
