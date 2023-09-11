package dataStructures.stack_queue_brackets;

import static dataStructures.stack_queue_brackets.BracketValidator.validateBrackets;

public class Driver {
    public static void main(String[] args) {
        System.out.println(validateBrackets("()"));           // true
        System.out.println(validateBrackets("()[]{}"));       // true
        System.out.println(validateBrackets("(]"));           // false
        System.out.println(validateBrackets("([)]"));         // false
        System.out.println(validateBrackets("{[]}"));         // true
        System.out.println(validateBrackets("{{{{{{"));       // false
        System.out.println(validateBrackets("}}}}}}"));       // false
    }
}
