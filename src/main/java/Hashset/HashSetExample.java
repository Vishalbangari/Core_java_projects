package Hashset;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<>();


        stringSet.add("char");
        stringSet.add("Boolean");
        stringSet.add("string");
        stringSet.add("Maven");
        stringSet.add("Hash");
        stringSet.add("float");
        stringSet.add("double");
        stringSet.add("int");
        stringSet.add("short");
        stringSet.add("byte");


        System.out.println("Iterating HashSet using Iterator:");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }


        System.out.println("\nIterating HashSet using ForEach:");
        for (String element : stringSet) {
            System.out.println(element);
        }


        System.out.println("\nIterating HashSet using Streams ForEach:");
        stringSet.stream().forEach(System.out::println);
    }
}
