package Day8;

public class Stringrotation {
    public static void main(String[] args) {
            String str1 = "JavaJ2eeStrutsHibernate";
            String str2 = "StrutsHibernateJavaJ2ee";

            boolean isRotation = checkIfRotation(str1, str2);

            if (isRotation) {
                System.out.println(str2 + " is a rotation of " + str1);
            } else {
                System.out.println(str2 + " is not a rotation of " + str1);
            }
        }

        public static boolean checkIfRotation(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false;
            }

            String concatenated = str1 + str1;
            return concatenated.contains(str2);
        }
    }
