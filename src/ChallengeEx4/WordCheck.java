package ChallengeEx4;

import java.util.Arrays;
import java.util.Scanner;

public class WordCheck {
//    In a magical world there is an elf that loves to write the words he hears.
//    Every time he hears a word he writes it down. And since he loves words and
//    letters so much he checks if the new word is similar to the previous one.
//    So he crosses out letters until the two words contain the same letters.
//    Please write a program that will help our kind elf.

    public WordCheck(){

    }

    public int crossLetters(String firstWord, String secondWord){
        for (int i = 0; i < firstWord.length(); i++) {
            char letter = firstWord.charAt(i);

            if (secondWord.indexOf(letter) >= 0) {
                firstWord = firstWord.substring(0, i) + firstWord.substring(i + 1);
                secondWord = secondWord.substring(0, secondWord.indexOf(letter)) + secondWord.substring(secondWord.indexOf(letter) + 1);
                i--;
            }
        }
        return firstWord.length() + secondWord.length();
    }

}
