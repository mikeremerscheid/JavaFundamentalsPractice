package SynchronizationPractice;

public class Demo {
    private static int count = 0;

    public static synchronized void inCount() {
        count++;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i <= 10000; i++) {
                    inCount();

                }
            }

        });

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i <= 10000; i++) {
                    inCount();
                }
            }
        });

        t1.start();
        t2.start();

        try { //Java Thread join method can be used to pause the current thread execution until unless the specified thread is dead.
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("value: " + count);
    }

}
