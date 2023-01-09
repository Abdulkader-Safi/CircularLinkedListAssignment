public class CircularLinkedList {
  // Reference to the first node in the list
  private Node head;

  // Constructor to create an empty list
  public CircularLinkedList() {
    head = null;
  }

  // Method to add a new node at the beginning of the list
  public void add(Object data) {
    Node newNode = new Node(data, head);
    if (head == null) {
      newNode.setNext(newNode);
      head = newNode;
    } else {
      Node current = head;
      while (current.getNext() != head) {
        current = current.getNext();
      }
      current.setNext(newNode);
      newNode.setNext(head);
      head = newNode;
    }
  }

  // Method to remove the first node in the list
  public void remove() {
    if (head != null) {
      Node current = head;
      while (current.getNext() != head) {
        current = current.getNext();
      }
      if (current == head) {
        head = null;
      } else {
        current.setNext(head.getNext());
        head = head.getNext();
      }
    }
  }

  // Method to search for a specific node in the list
  public Node search(Object data) {
    Node current = head;
    while (current != null) {
      if (current.getData().equals(data)) {
        return current;
      }
      current = current.getNext();
      if (current == head) {
        break;
      }
    }
    return null;
  }

  // Method to traverse the list and print the data for each node
  public void printList() {
    Node current = head;
    if (current == null) {
      System.out.println("List is empty");
    } else {
      do {
        System.out.println(current.getData());
        current = current.getNext();
      } while (current != head);
    }
  }

  // Method to get the size of the list
  public int size() {
    int size = 0;
    Node current = head;
    if (current == null) {
      return size;
    } else {
      do {
        size++;
        current = current.getNext();
      } while (current != head);
    }
    return size;
  }

  public Node getHead() {
    return this.head;
  }
}
