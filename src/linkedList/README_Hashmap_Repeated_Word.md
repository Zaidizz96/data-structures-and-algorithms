# Challenge Title
this challenge for finding the first repeated word in a string and return the word.
## Whiteboard Process
![Whiteboard](../../assets/whiteboard%20hashmap%20repeated%20words%20.png)
<!-- Replace "whiteboard.png" with the actual image file name and path -->

## Approach & Efficiency
I solved this challenge using a Java program that tokenizes the input string into words, counts their occurrences, and returns the first repeated word found in the input string. The approach is as follows:

1. Tokenize the input string into words using a regular expression pattern.
2. Use a HashMap to count the occurrences of each word.
3. Iterate through the words and check for repeated words.
4. Return the first repeated word found.

The time complexity of this solution is O(N), where N is the number of words in the input string. The space complexity is O(M), where M is the number of unique words in the input string.

## Solution
To run the code, you can use the following Java code:

```java
public class RepeatedWordFinder {
    public static String repeatedWord(String input) {
    Pattern wordPattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = wordPattern.matcher(input.toLowerCase());

        HashMap<String , Integer> wordsOccur = new HashMap<>();

        while (matcher.find()){
            String word = matcher.group();
            if (wordsOccur.containsKey(word)){
                return word;
            }else {
                wordsOccur.put(word , 1);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String input = "Once upon a time, there was a brave princess who...";
        String result = findFirstRepeatedWord(input);
        System.out.println("First repeated word: " + result);
    }
}
