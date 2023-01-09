public class App {

  public static void main(String[] args) throws Exception {
    Queue myQueue = new Queue();

    // Add some elements to the queue
    myQueue.enqueue("A");
    myQueue.enqueue("B");
    myQueue.enqueue("C");

    // Print the first element in the queue
    System.out.println(myQueue.peek()); // Output: "A"

    // Remove an element from the queue
    myQueue.dequeue();

    // Print the first element in the queue again
    System.out.println(myQueue.peek()); // Output: "B"

    // Check if the queue is empty
    if (myQueue.isEmpty()) {
      System.out.println("Queue is empty");
    } else {
      System.out.println("Queue is not empty"); // Output: "Queue is not empty"
    }
  }
}
