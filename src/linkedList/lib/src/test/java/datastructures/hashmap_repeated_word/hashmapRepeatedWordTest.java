package datastructures.hashmap_repeated_word;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import dataStructures.hashmap_repeated_word.Hashmap_Repeated_Word;
public class hashmapRepeatedWordTest {
    @Test
    void testFindRepeatedWord(){
        String input = "hello all, hello zaid";
        String result = Hashmap_Repeated_Word.repeatedWord(input);

        assertEquals("hello" , result);
    }

    @Test
    void testFindRepeatedWordWithNoRepeatedWords(){
        String input = "hello all, my name is zaid";
        assertNull(Hashmap_Repeated_Word.repeatedWord(input));
    }
}
