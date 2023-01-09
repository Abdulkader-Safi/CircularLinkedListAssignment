public class Queue {
  // The linked list to store the queue elements
  private CircularLinkedList queue;

  // Constructor to create an empty queue
  public Queue() {
    queue = new CircularLinkedList();
  }

  // Method to add an element to the queue
  public void enqueue(Object data) {
    queue.add(data);
  }

  // Method to remove an element from the queue
  public void dequeue() {
    queue.remove();
  }

  // Method to return the first element in the queue
  public Object peek() {
    return queue.getHead().getData();
  }

  // Method to check if the queue is empty
  public boolean isEmpty() {
    return queue.size() == 0;
  }
}
