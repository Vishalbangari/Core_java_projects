package Day9;

public class Exception {
    public static int parse(String i) {
        return Integer.parseInt(i);
        }

        public static void main(String args[]) {

            try {

                System.out.println(parse("23"));
                System.out.println(parse("45.67"));
                System.out.println(parse("test"));
                System.out.println(parse("123f"));
            } catch (NumberFormatException e) {
                System.out.println("Not an Integer");
                e.printStackTrace();
            }

        }

    }

