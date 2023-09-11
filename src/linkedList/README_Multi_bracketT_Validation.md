# Challenge Title
Multi-bracket Validation

## Description
This code challenge involves writing a function to validate whether brackets in a given string are balanced. The three types of brackets to consider are:
- Round Brackets: ()
- Square Brackets: []
- Curly Brackets: {}

## Whiteboard Process
![Whiteboard](../../assets/whiteboard_Multi-bracket%20Validation..png)

## Approach & Efficiency
I used a stack data structure to track the opening brackets. For each character in the input string, I checked if it was an opening bracket and pushed it onto the stack. If it was a closing bracket, I compared it with the top element of the stack to ensure it matched the corresponding opening bracket. If there was a mismatch or if the stack was empty when encountering a closing bracket, I returned `False`. At the end of the process, if the stack was empty, I returned `True` to indicate balanced brackets.

The time complexity of this approach is O(n), where n is the length of the input string, because we iterate through the string once. The space complexity is also O(n) in the worst case because the stack can potentially contain all opening brackets.

## Solution
To run the code, you can use the following Java code as an example:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(BracketValidator.validateBrackets("()"));           // true
        System.out.println(BracketValidator.validateBrackets("()[]{}"));       // true
        System.out.println(BracketValidator.validateBrackets("(]"));           // false
        System.out.println(BracketValidator.validateBrackets("([)]"));         // false
        System.out.println(BracketValidator.validateBrackets("{[]}"));         // true
        System.out.println(BracketValidator.validateBrackets("{{{{{{"));       // false
        System.out.println(BracketValidator.validateBrackets("}}}}}}"));       // false
    }
}
    