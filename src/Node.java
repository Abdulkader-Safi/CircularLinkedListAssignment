public class Node {
  // Data stored in the node
  private Object data;

  // Reference to the next node in the list
  private Node next;

  // Constructor to create a new node with given data and next node
  public Node(Object data, Node next) {
    this.data = data;
    this.next = next;
  }

  // Getters and setters for the data and next node
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}
