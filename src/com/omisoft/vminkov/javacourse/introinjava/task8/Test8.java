package com.omisoft.vminkov.javacourse.introinjava.task8;

/**
 * Created by developer on 07.11.16.
 */
public class Test8 {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException
    {
        String[] words = {"cat", "dog", "frog", "peacock", "mouse"};
        // Pick random index of words array
        int randomWordNumber;
        randomWordNumber = (int) (Math.random()*words.length);
        // Create an array to store already entered letters
        char[] enteredLetters = new char[words[randomWordNumber].length()];
        int triesCount = 0;
        boolean wordIsGuessed = false;
        do {

            switch (Hangman.enterLetter(words[randomWordNumber], enteredLetters)) {
                case 0:
                    triesCount++;
                    break;
                case 1:
                    triesCount++;
                    break;
                case 2:
                    break;
                case 3:
                    wordIsGuessed = true;
                    break;
            }
        } while (!wordIsGuessed);
        System.out.println("\nThe word is " + words[randomWordNumber] +
                " You missed " + (triesCount -Hangman.findEmptyPosition(enteredLetters)) +
                " time(s)");
    }


}
