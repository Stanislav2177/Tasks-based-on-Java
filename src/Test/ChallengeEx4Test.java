package Test;

import ChallengeEx4.WordCheck;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChallengeEx4Test {

    @Test
    void test1(){
        WordCheck wordCheck = new WordCheck();
        int crossLetters = wordCheck.crossLetters("codewars", "hackerrank");

        assertEquals(crossLetters, 10);
    }

    @Test
    void test2(){
        WordCheck wordCheck = new WordCheck();
        int crossLetters = wordCheck.crossLetters("cow", "cow");

        assertEquals(crossLetters, 0);
    }

    @Test
    void test3(){
        WordCheck wordCheck = new WordCheck();
        int crossLetters = wordCheck.crossLetters("ChallengeEx4TestJavaToCheckLetters", "Java");

        assertEquals(crossLetters, 30);
    }


}
