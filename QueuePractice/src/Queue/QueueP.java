package Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class QueueP<D> {
    LinkedList<D> queue;

    // Making a Queue instance
    public QueueP() {
        queue = new LinkedList();
    }

    // Is our Queue empty?
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Size of Queue?
    public int size() {
        return queue.size();
    }

    // Enqueue an item
    public void enqueue(D n){
        queue.addLast(n);
    }

    // Dequeue an item
    public D dequeue(){
        return queue.remove(0);
    }

    // Peek at first item
    public D peek() {
        return queue.get(0);
    }

    public static void main(String[] args) {
        Stack<String> stacky = new Stack<>();
        stacky.push("there");
        stacky.push("Hello");
        System.out.println(stacky.pop() + " ");
        System.out.println("Peek: " + stacky.peek());
        System.out.println(stacky.pop() + ".");
        System.out.println("Size: " + stacky.size());


        QueueP stringQueue = new QueueP();
        stringQueue.enqueue("Hello");
        stringQueue.enqueue("There");
        System.out.print(stringQueue.dequeue() + " ");
        System.out.println(stringQueue.dequeue() + ".");



        QueueP numberQueue = new QueueP();

        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(20);

        System.out.println("First out: " + numberQueue.dequeue());
        System.out.println("Peek at second item: " + numberQueue.peek());
        System.out.println("Second out: " + numberQueue.dequeue());
        System.out.println("Third out: " + numberQueue.dequeue());

    }
}
