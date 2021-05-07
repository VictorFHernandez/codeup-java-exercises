import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*

            TODO: Create a HashMap of three people in class with keys using their last name
             and values at those keys using their first name.

             Example

             "Justin" could be returned from nameHashMap.get("Reich")

            BONUS TODO: Create a HashMap containing three people in the class with keys using their
             first name and values that are an ArrayList of strings containing at least two
             objects visible in their background.

             Example

             ArrayList<String> with values ("Codeup Sign", "Black Background", "Nothing Else")
             from backgroundHashMap.get("Justin")

         */
class HashMapMiniExercise{
    public static void main(String[] args) {
        Map<String, String> BadAssNames = new HashMap<>();
        BadAssNames.put("John", "Wick");
        BadAssNames.put("Chuck", "Norris");
        BadAssNames.put("Bruce", "Lee");
    }
}




