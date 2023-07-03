package Day8;

public class Reverserotation {
        public static void main(String[] args) {
            String sentence = "Java J2EE Reverse Me";
            String reversedSentence = reverseWords(sentence);

            System.out.println("Original sentence: " + sentence);
            System.out.println("Reversed sentence: " + reversedSentence);
        }

        public static String reverseWords(String sentence) {
            String[] words = sentence.split(" ");
            StringBuilder reversedSentence = new StringBuilder();

            for (String word : words) {
                StringBuilder reversedWord = new StringBuilder(word);
                reversedWord.reverse();
                reversedSentence.append(reversedWord).append(" ");
            }

            return reversedSentence.toString().trim();
        }
    }
