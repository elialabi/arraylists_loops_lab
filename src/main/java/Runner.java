import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list

        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list

        scottishIslands.add(0,"Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"

        scottishIslands.add(2, "Islay");

//        4. Print out the index position of "Skye"

        int index = scottishIslands.indexOf("Skye");
        System.out.println("index position of Skye:" + index);

//        5. Remove "Tresco" from the list by name

        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index

        scottishIslands.remove(5);

//        7. Print the number of islands in your arraylist

        int Islandslength = scottishIslands.size();
        System.out.println(Islandslength);

//        8. Sort the list alphabetically

        Collections.sort(scottishIslands);
        System.out.println(scottishIslands);

//        9. Print out all the islands using a for loop

        for(String island : scottishIslands){
            System.out.println(island);
        }

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers

        List<Integer> evenNumbers = new ArrayList<>();
        for(Integer number:numbers){
            if(number % 2 == 0){
        evenNumbers.add(number);
            }
        }

        System.out.println("Even Numbers: "+ evenNumbers);

//        2. Print the difference between the largest and smallest value

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println(max-min);

//        3. Print True if the list contains a 1 next to a 1 somewhere.



//        4. Print the sum of the numbers,

        int total =0;

        for(Integer number : numbers){
            total+=number;
        }
        System.out.println(total);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.

        ArrayList<Integer> filteredNumbers = new ArrayList<>();

        for(Integer number : numbers){
            if(number < 13){
                filteredNumbers.add(number);
            }
        }
        System.out.println(filteredNumbers);

        int totaL =0;

        for(Integer number : filteredNumbers){
            totaL+=number;
        }
        System.out.println(totaL);


    }

}
