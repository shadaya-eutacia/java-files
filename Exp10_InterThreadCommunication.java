class SharedBuffer {
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) {
        while (hasData) {
            try { wait(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
        this.data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized int consume() {
        while (!hasData) {
            try { wait(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
        hasData = false;
        System.out.println("Consumed: " + data);
        notify();
        return data;
    }
}

public class Exp10_InterThreadCommunication {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                buffer.produce(i);
                try { Thread.sleep(300); } catch (InterruptedException e) {}
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                buffer.consume();
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        });

        producer.start();
        consumer.start();
    }
}