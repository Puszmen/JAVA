import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ClientService {
    public static void main(String[] args) {

        Queue<Client> clients = new PriorityQueue<>(new Comparator<Client>() {
            @Override
            public int compare(Client c1, Client c2) {
                return Integer.compare(c1.getOrdersNumber(), c2.getOrdersNumber());
            }
        });

        clients.add(new Client("Ziom", 2));
        clients.add(new Client("Cienki", 5));
        clients.add(new Client("Cypis", 1));
        clients.add(new Client("Zati", 3));

        System.out.println(clients);
        while (!clients.isEmpty()) {
            System.out.println("Obsługiwany klient " + clients.poll());
        }


    }
}
