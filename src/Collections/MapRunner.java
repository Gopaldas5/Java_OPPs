package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

    public static void main(String[] args) {
        String str = "This is a awesome occasion. " +
                     "This has never happened before.";
        Map<Character, Integer> occurrences = new HashMap<>();
        char[] characters = str.toCharArray();

        for(char character : characters) {
            //Get the character
            Integer integer = occurrences.get(character);
            if(integer == null) {
                occurrences.put(character, 1);
            } else {
                occurrences.put(character, integer+1);
            }
        }
        System.out.println(occurrences);

        String[] words = str.split(" ");
        Map<String, Integer> StringOccurances = new HashMap<>();
        //Get the String
        for(String word : words) {
            Integer number = StringOccurances.get(word);
            if(number == null) {
                StringOccurances.put(word, 1);
            } else {
                StringOccurances.put(word, number + 1);
            }
        }
        System.out.println(StringOccurances);
    }

}
