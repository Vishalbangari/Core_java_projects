package d12062023;

public class threading implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }

        public static void main(String[] args) {
            threading numberPrintingRunnable = new threading();
            Thread thread = new Thread(numberPrintingRunnable);
            thread.start();
        }
    }

