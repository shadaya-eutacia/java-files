public class Exp11_ThreadLifecycleAndDeadlockPrevention {
    private static final Object Lock1 = new Object();
    private static final Object Lock2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        // Part 1: Lifecycle Demo
        Thread lifecycleThread = new Thread(() -> {
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) { e.printStackTrace(); }
        });

        System.out.println("State after creation: " + lifecycleThread.getState());
        lifecycleThread.start();
        System.out.println("State after start(): " + lifecycleThread.getState());

        Thread.sleep(100);
        System.out.println("State during sleep(): " + lifecycleThread.getState());

        lifecycleThread.join();
        System.out.println("State after completion: " + lifecycleThread.getState());

        // Part 2: Deadlock Prevention via Lock Ordering
        System.out.println("\n--- Deadlock Prevention ---");
        Thread t1 = new Thread(() -> safeLockExecution("Thread-1"));
        Thread t2 = new Thread(() -> safeLockExecution("Thread-2"));

        t1.start();
        t2.start();
    }

    private static void safeLockExecution(String threadName) {
        synchronized (Lock1) {
            System.out.println(threadName + " acquired Lock 1");
            synchronized (Lock2) {
                System.out.println(threadName + " acquired Lock 2");
            }
        }
    }
}