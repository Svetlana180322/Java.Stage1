/**
  * The words Homework - 4
  *
  *@author Svetlana Budzinskaia
  *@version 29.05.2022
  */
import java.io.IOException;
import java.util.*;


public class LessonThewordsHomework {

    public static void main(String[] args) {
        // first homework item
        List<String> wordArray = new ArrayList<String>();
        wordArray = ArrayOperation.fillTheArray(wordArray);
        System.out.println(wordArray + "\n");
        ArrayOperation.printUniqueWords(wordArray);
        wordArray.clear();

        // second homework item
        Phonebook phonebook = new Phonebook();

        phonebook.add(2304578, "Ivanov");
        phonebook.add(5678794, "Ivanov");
        phonebook.add(3456783, "Petrov");
        phonebook.add(3456278, "Sidorov");
        phonebook.add(9786053, "Sidorov");
        phonebook.add(6475893, "Sidorov");

        phonebook.get("Ivanov");
        phonebook.get("Petrov");
        phonebook.get("Sidorov");
        phonebook.get("Akulshin");
    }
}
class ArrayOperation {

    public static List<String> fillTheArray(List<String> array) {
        array.add("hello");
        array.add("Hello");
        array.add("car");
        array.add("boy");
        array.add("world");
        array.add("World");
        array.add("hi");
        array.add("bye");
        array.add("Bye");
        array.add("bye");
        return array;
    }

    public static void printUniqueWords(List<String> array) {
        Set<String> tempArray = new LinkedHashSet<>();
        for (String arr : array) {
            String a = arr.toLowerCase();
            tempArray.add(a);
        }
        for (String tempArr : tempArray) {
            int count = 0;
            for (String arr : array) {
                String a = arr.toLowerCase();
                if(tempArr.equals(a)) count++;
            }
            System.out.println("\"" + tempArr + "\"" + " repeated in the list = " + count);
        }
        System.out.println();
    }
}
class Phonebook {

    private Map<Integer, String> phonebook;
    Phonebook() {
        phonebook = new HashMap<>();
    }
    public void add(int number, String surname) {
        phonebook.put(number, surname);
    }
    public void get(String surname){
        String Messege = surname+ ": ";
        if(phonebook.containsValue(surname)) {
            Set<Map.Entry<Integer, String>> set = phonebook.entrySet();
            for (Map.Entry<Integer, String> temp : set) {
                if(temp.getValue().equals(surname)) {
                    Messege = "" + Messege + temp.getKey() + "; ";
                }
            }
            System.out.println(Messege);
        } else {
            System.out.println("Such a name \""+surname+"\" is not on the list.");
        }
    }
}