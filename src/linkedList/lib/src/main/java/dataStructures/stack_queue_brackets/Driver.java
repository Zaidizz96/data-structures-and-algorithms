package dataStructures.stack_queue_brackets;



public class Driver {
    public static void main(String[] args) {
        BracketValidator bracketValidator = new BracketValidator();
        System.out.println(bracketValidator.validateBrackets("()"));           // true
        System.out.println(bracketValidator.validateBrackets("()[]{}"));       // true
        System.out.println(bracketValidator.validateBrackets("(]"));           // false
        System.out.println(bracketValidator.validateBrackets("([)]"));         // false
        System.out.println(bracketValidator.validateBrackets("{[]}"));         // true
        System.out.println(bracketValidator.validateBrackets("{{{{{{"));       // false
        System.out.println(bracketValidator.validateBrackets("}}}}}}"));       // false
    }
}
