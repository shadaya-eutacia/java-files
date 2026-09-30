public class Exp8_Multithreading {

    static class WorkerThread extends Thread {
        private String threadName;

        public WorkerThread(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println(threadName + " is executing iteration " + i);
                try {
                    Thread.sleep(500); // Pause for 0.5 seconds
                } catch (InterruptedException e) {
                    System.out.println(threadName + " was interrupted.");
                }
            }
            System.out.println(threadName + " completed.");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Starting Multithreading Demo ===");

        WorkerThread thread1 = new WorkerThread("Thread-1");
        WorkerThread thread2 = new WorkerThread("Thread-2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("=== All Threads Executed Successfully ===");
    }
}