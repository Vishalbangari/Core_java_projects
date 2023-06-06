import java.util.Scanner;
public class Age {

        public static void main(String[] args) {

            System.out.println("Please enter your age:");

            Scanner in = new Scanner(System.in);
            int age = in.nextInt();

            if (age <= 0) {
                System.out.println("Invalid input");

            } else if (age <= 13) {
                System.out.println("Kid");

            } else if (age >= 13 && age <= 19) {
                System.out.println("Teen");

            } else {
                System.out.println("Adult");

            }

        }

    }