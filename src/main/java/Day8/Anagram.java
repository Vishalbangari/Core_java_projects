package Day8;

import java.util.Arrays;
public class Anagram {
        public static void main(String[] args) {
            String str1 = "save";
            String str2 = "vase";

            boolean areAnagrams = checkIfAnagrams(str1, str2);

            if (areAnagrams) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
            }
        }

        public static boolean checkIfAnagrams(String str1, String str2) {
            // Convert strings to lowercase and remove spaces
            str1 = str1.toLowerCase().replaceAll("\\s", "");
            str2 = str2.toLowerCase().replaceAll("\\s", "");

            // Check if lengths of the two strings are equal
            if (str1.length() != str2.length()) {
                return false;
            }

            // Convert strings to char arrays and sort them
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Compare sorted char arrays
            return Arrays.equals(charArray1, charArray2);
        }
    }

