/**
 * https://simplesolution.dev/
 */
package simplesolution.dev;

import java.util.*;

public class ArrayListExamples {

    public static void main(String... args) {
        addOneElementToList();
        addListOfElementToList();
        accessElementFromArrayList();
        checkAnElementExistInArrayList();
        updateElementInArrayList();
        removeElementFromArrayList();
        loopArrayList();
        sortingArrayList();
        convertArrayListToArray();
    }

    private static void addOneElementToList() {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C");
        list.add("C++");
        System.out.println(list);

        list.add(1, "JavaScript");
        System.out.println(list);
    }

    private static void addListOfElementToList() {
        List<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("C");
        list1.add("C++");

        List<String> list2 = new ArrayList<>();
        list2.add("Python");
        list2.add("Go");

        // Add all elements of list2 to list1
        list1.addAll(list2);
        System.out.println(list1);

        List<String> list3 = new ArrayList<>();
        list3.add("C#");
        list3.add("JavaScript");

        // Add all elements of list3 to list1 at a specified index
        list1.addAll(2, list3);
        System.out.println(list1);
    }

    private static void accessElementFromArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("Python");
        list.add("Go");
        list.add("C#");
        list.add("JavaScript");
        list.add("Python");

        // get element by its index
        System.out.println(list.get(0));

        // get index of specified element
        System.out.println(list.indexOf("C++"));

        // get last index in list of an specified element
        System.out.println(list.lastIndexOf("Python"));

        // get a sub list of elements by start and end index
        System.out.println(list.subList(2, 4));
    }

    private static void checkAnElementExistInArrayList() {
        List<String> list = new ArrayList<>();
        // check the list is empty or not before adding element
        System.out.println(list.isEmpty());

        list.add("Java");
        list.add("C");
        list.add("C++");

        System.out.println(list.contains("Java"));
        System.out.println(list.contains("JavaScript"));

        // check the list is empty or not after adding element
        System.out.println(list.isEmpty());
    }

    private static void updateElementInArrayList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("Python");
        list.add("Go");
        list.add("C#");
        list.add("JS");

        System.out.println(list);

        List<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("JS");
        // Retain in list which element exist in list2
        list.retainAll(list2);
        System.out.println(list);

        // Update element from JS to JavaScript
        list.set(1, "JavaScript");

        System.out.println(list);
        // Replace all element which result return from lambda expression
        list.replaceAll(element -> element + " Programming Language");
        System.out.println(list);

        System.out.println(list.size());
    }

    private static void removeElementFromArrayList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("Python");
        list.add("Go");
        list.add("C#");
        list.add("JavaScript");
        list.add("Kotlin");

        System.out.println(list);

        // Remove by index
        list.remove(3);
        System.out.println(list);

        // Remove by element value
        list.remove("JavaScript");
        System.out.println(list);

        // Remove if the lambda expression return true
        list.removeIf(element -> element.startsWith("C"));
        System.out.println(list);

        List<String> list2 = new ArrayList<>();
        list2.add("Go");
        list2.add("Kotlin");
        // Remove all element in list that exist in list2
        list.removeAll(list2);
        System.out.println(list);

        // Remove all elements
        list.clear();
        System.out.println(list);
    }

    private static void loopArrayList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("Solution 1: Loop Element using for loop");
        for(int i = 0 ; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.forEach(element -> System.out.println(element) );

        System.out.println("Solution 2: Loop Element using listIterator");
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Solution 3: Loop Element using iterator");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Solution 4: Loop Element using spliterator");
        Spliterator<Integer> spliterator = list.spliterator();
        spliterator.forEachRemaining(element -> System.out.println(element));
    }

    private static void sortingArrayList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("Python");
        list.add("Go");
        list.add("C#");
        list.add("JavaScript");

        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(list);
    }

    private static void convertArrayListToArray() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("Python");
        list.add("Go");
        list.add("C#");
        list.add("JavaScript");

        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length);

        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length);
    }

}
