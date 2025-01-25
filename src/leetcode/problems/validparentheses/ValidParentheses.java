package leetcode.problems.validparentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        var stack = new Stack<String>();
        //Map of opening charactrs
        var openingCharacters = Map.of(
                "(", ")",
                "[", "]",
                "{", "}");
        //Map of closing characters
        var closingCharacters = Map.of(
                ")", "(",
                "]", "[",
                "}", "{");

        for (int i = 0; i < s.length(); i++) {
            System.out.println("Current stack: "+stack);
            //If the character is an opening character, push it to the stack
            var currentCharacter = String.valueOf(s.charAt(i));
            System.out.println("Current character: "+currentCharacter);
            if (openingCharacters.containsKey(currentCharacter)) {
                stack.push(currentCharacter);
            } else {
                //If the stack is empty, then we got more closing than opening characters, not valid!
                if (stack.isEmpty()) {
                    return false;
                }
                //If the character is an closing character, check if the last character was an opening to this one
                //If it is, remove the top of the stack (found the opening and closing character combo)
                //If not, return false, because its trying to close with the wrong character
                if (closingCharacters.get(currentCharacter).equals(stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            }

        }

        System.out.println("Stack final: "+stack);
        return stack.isEmpty();
    }

    public static boolean isValidV2(String s) {
        var stack = new Stack<Character>();
        //Map of closing characters
        var closingCharacters = new HashMap<Character, Character>();
        closingCharacters.put(')', '(');
        closingCharacters.put(']', '[');
        closingCharacters.put('}', '{');

        for (char c : s.toCharArray()) {
            System.out.println("Current stack: "+stack);
            //If the character is an opening character, push it to the stack
            System.out.println("Current character: "+c);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                //If the stack is empty, then we got more closing than opening characters, not valid!
                if (stack.isEmpty()) {
                    return false;
                }
                //If the character is an closing character, check if the last character was an opening to this one
                //If it is, remove the top of the stack (found the opening and closing character combo)
                //If not, return false, because its trying to close with the wrong character
                if (closingCharacters.get(c).equals(stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            }

        }

        System.out.println("Stack final: "+stack);
        return stack.isEmpty();
    }
}
