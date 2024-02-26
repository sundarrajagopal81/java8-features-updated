package src.interview.feb2024;

public class removeAllTheWhiteSpace {
    public static void main(String[] args) {

        String name ="  a  b  c    d   e   e  re f g g j    ";

        System.out.println(name);

        System.out.println(name.trim());
        String str = name.replaceAll("\\s","");

        System.out.println(str);
    }
}
