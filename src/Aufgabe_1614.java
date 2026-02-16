import java.util.LinkedList;
//пока не верно
public class Aufgabe_1614 {
    public static int maxDepth(String s) {

        int sum = 0;
        int depth = 0;
        LinkedList<Character> stack = new LinkedList<>(); //для открывающих скобок

        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            System.out.print(c);
            System.out.print(" ");
            if (c == '(' || c == ')') {
                stack.push(c);
            }
        }
        boolean flag = true;
        while (!stack.isEmpty()) {
            char c = stack.pop();
            if (c == ')' && flag) {
                sum++;

            } else if (c == '('&& flag) {
                flag = false;
                sum--;
            } else {
                flag = true;
            }
        }
        System.out.println("sum = " + sum );
        System.out.println("depth = " + depth);
        return sum;
    }


    public static void main(String[] args) {

        String s = "(1+(2*3)+((8)/4))+1";
        String s1 = "(1)+((2))+(((3)))";
        String s2 = "()(())((()()))";


        System.out.println(maxDepth(s));
        System.out.println(maxDepth(s1));
        System.out.println(maxDepth(s2));


    }
}

