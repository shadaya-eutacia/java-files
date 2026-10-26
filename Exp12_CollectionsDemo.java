import java.util.*;

public class Exp12_CollectionsDemo {
    public static void main(String[] args) {
        System.out.println("=== Java Collections Framework Demo ===\n");

        // 1. List Interface (ArrayList) - Ordered & Allows Duplicates
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // Duplicate allowed
        System.out.println("1. List (ArrayList): " + list);

        // 2. Set Interface (HashSet) - Unordered & Unique Elements only
        Set<String> set = new HashSet<>(list);
        System.out.println("2. Set (HashSet - Duplicates Removed): " + set);

        // 3. Queue Interface (LinkedList) - FIFO (First In, First Out)
        Queue<String> queue = new LinkedList<>();
        queue.add("Task 1");
        queue.add("Task 2");
        queue.add("Task 3");
        System.out.println("3. Queue Processing (Poll): " + queue.poll() + " completed.");
        System.out.println("   Remaining Queue: " + queue);

        // 4. Map Interface (HashMap) - Key-Value Pairs
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Alice");
        map.put(102, "Bob");
        map.put(103, "Charlie");
        System.out.println("4. Map (ID -> Name): " + map);
    }
}