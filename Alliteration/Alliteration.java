/**
 @Author:
 Period:
 Date Started: Dec 09, 2016
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.ArrayList; 
import java.util.Arrays;

public class Alliteration {

private static String[] _trivialWords = {"i", "a", "about", "an", "and", "are", "as", "at", "be", "by",
        "com", "for", "from", "how", "in", "is", "it", "of", "on",
        "or", "that", "the", "this", "to", "was", "what", "when",
        "where", "who", "will", "with", "the"};

public static void main(String[] args) {


    String input = new String("The daily diary of the American dream\n" +
            "For the sky and the sea, and the sea and the sky\n" +
            "Three grey geese in a green field grazing, Grey were the geese and green was the grazing.\n" +
            "But a better butter makes a batter better.\n" +
            "\"His soul swooned slowly as he heard the snow falling faintly through the universe and faintly falling, like the descent of their last end, upon all the living and the dead.\"\n" +
            "Whisper words of wisdom, let it be.\n" +
            "They paved paradise and put up a parking lot.\n" +
            "So what we gonna have, dessert or disaster?");

    String[] sentences = input.split("\n");

    for (String singleSentence : sentences) {
        findAlliteration(singleSentence);
    }

}

public static void findAlliteration(String sentence) {


    ArrayList<String> trivialWordsList = new ArrayList<>(Arrays.asList(_trivialWords));


    ArrayList<String> rawWords = new ArrayList<>();
    String[] split = sentence.split(" ");
    for (int i = 0; i < split.length; i++) {
        String word = split[i];

        if (!trivialWordsList.contains(word)) {
            rawWords.add(word.replaceAll("\\W", "").toLowerCase());
        }

    }

    ArrayList<String> matches = new ArrayList<>();
    for (int i = 1; i < rawWords.size(); ++i) {
        char first = rawWords.get(i - 1).charAt(0);
        char second = rawWords.get(i).charAt(0);

        if (first == second) {

            if (!matches.contains(rawWords.get(i - 1)))
                matches.add(rawWords.get(i - 1));

            if (!matches.contains(rawWords.get(i)))
                matches.add(rawWords.get(i));


        }
    }
    System.out.println(matches);

}
}