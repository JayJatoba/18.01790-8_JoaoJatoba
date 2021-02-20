import java.util.Random;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        final Queue<Integer> buffer = new LinkedList<>();
        int maxsize = 10;
        Producer producer = new Producer(buffer, maxsize, “Producer”);
        Consumer consumer = new Consumer(buffer, maxsize, “Consumer”);
        Random random = new Random();
        int i = random.nextInt();
        System.out.println("produce same" + i);
        producer.start();
        consumer.start();
        }
}