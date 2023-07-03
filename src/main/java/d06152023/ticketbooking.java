package d06152023;

public class ticketbooking {

        private int availableSeats;

        public ticketbooking(int availableSeats) {
            this.availableSeats = availableSeats;
        }

        public synchronized void bookTicket(int numSeats, String customerName) {
            if (numSeats <= availableSeats) {
                System.out.println("Booking " + numSeats + " ticket(s) for " + customerName);
                availableSeats -= numSeats;
                System.out.println("Booking successful for " + customerName + ". Remaining seats: " + availableSeats);
            } else {
                System.out.println("Insufficient seats available for " + customerName);
            }
        }

        public static void main(String[] args) {
            ticketbooking bookingSystem = new ticketbooking(10);

            Runnable booker1 = () -> bookingSystem.bookTicket(2, "Vamsi");
            Runnable booker2 = () -> bookingSystem.bookTicket(4, "Kira");
            Runnable booker3 = () -> bookingSystem.bookTicket(3, "Nani");
            Runnable booker4 = () -> bookingSystem.bookTicket(5, "Hashi");

            Thread thread1 = new Thread(booker1);
            Thread thread2 = new Thread(booker2);
            Thread thread3 = new Thread(booker3);
            Thread thread4 = new Thread(booker4);

            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
        }
    }

