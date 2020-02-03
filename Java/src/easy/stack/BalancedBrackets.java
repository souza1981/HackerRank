package easy.stack;

import java.util.Stack;

public class BalancedBrackets {

    static String isBalanced(String s) {

        if (s.length() % 2 > 0) return "NO";

        char openA = '{';
        char closeA = '}';
        char openB = '(';
        char closeB = ')';
        char openC = '[';
        char closeC = ']';

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char actual = s.charAt(i);
            if (actual == openA ||
            actual == openB ||
            actual == openC){
                stack.push(actual);
            } else {
                if (stack.isEmpty()){
                    return "NO";
                }
                char topo = stack.pop();
                if (topo == openA && actual != closeA ||
                topo == openB && actual != closeB ||
                topo == openC && actual != closeC){
                    return "NO";
                }
            }
        }
        if (stack.isEmpty()){
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        System.out.println(BalancedBrackets.isBalanced("{[()]}"));
        System.out.println(BalancedBrackets.isBalanced("{[(])}"));
        System.out.println(BalancedBrackets.isBalanced("{{[[(())]]}}"));
    }

}
