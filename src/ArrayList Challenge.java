/*

            TODO:
               1. Create a class called CollectionsPractice with a main method.
               2. Create a static method, upperLastElement, that takes in an array list and
                  returns the array list with last string upper case. An empty array list
                  should be returned if the passed array list is empty. If the passed array
                  list only has one string, uppercase it.
               3. In the main method, create an array list of first name strings of three people in Marco.
               4. Test the upperLastElement method on your array of Marco people.

               Examples

               ArrayList<String> names1 = new ArrayList<>(Arrays.asList("Justin, "Douglas", "Kenneth"));
               upperLastElement(names) should return "Justin", "Douglas", "KENNETH"

               ArrayList<String> names2 = new ArrayList<>(Arrays.asList("Kenneth"));
               upperLastElement(names2) should return "KENNETH"

               ArrayList<String> names3 = new ArrayList<>();
               upperLastElement(names3) should return an empty array list

         */

import java.util.Arrays;
import java.util.ArrayList;

class CollectionsPractice{
    public static void main(String[] args){

        upperLastElement();
    }

    public static ArrayList<String> theOffice = new ArrayList<>(Arrays.asList(
            "michael",
            "jim",
            "Pam",
            "Dwigth",
            "Creed",
            "Stanley",
            "Angela",
            "Ryan"
    ));

    static void upperLastElement(){
        System.out.println(theOffice);
    }
}
