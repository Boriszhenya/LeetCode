import java.util.LinkedList;

public class Aufgabe_20 {
    public static boolean isValid(String s) {

        LinkedList<Character> stack = new LinkedList<>(); //для открывающих скобок

        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char c1 = stack.getFirst();
                if ((c1 == '(' && c == ')') || (c1 == '{' && c == '}') || (c1 == '[' && c == ']')) {
                    stack.pop();
                } else  {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {

        String s = "()";
        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = "([])";
        String s31 = "([)]";

        String s4 = "()({[]}())";
        String s5 = "{}";
        String s6 = "}{";
        String s7 = "";
        String s8 = "(()";
        String s9 = "())";
        String s10 = "[(])";


        System.out.println(isValid(s));
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
        System.out.println(isValid(s31));

        System.out.println(isValid(s4));
        System.out.println(isValid(s5));
        System.out.println(isValid(s6));
        System.out.println(isValid(s7));
        System.out.println(isValid(s8));
        System.out.println(isValid(s9));
        System.out.println(isValid(s10));

    }
}
