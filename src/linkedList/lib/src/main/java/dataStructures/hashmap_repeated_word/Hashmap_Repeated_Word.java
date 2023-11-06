package dataStructures.hashmap_repeated_word;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hashmap_Repeated_Word {

    public static String repeatedWord(String input){
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
        String input1 = "Once upon a time, there was a brave princess who...";
        String input2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String input3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";

        System.out.println(repeatedWord(input1));
        System.out.println(repeatedWord(input2));
        System.out.println(repeatedWord(input3));
    }
}
