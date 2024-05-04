public class LinkedList {

  public class Node{
    Object data;
    Node next;
    public Node(Object data) {
      this.data = data;
      this.next = null;
    }
  }

  Node head;
  private int size;

  public LinkedList() {
    head = null;
    size = 0;
  }

  public void addLast(Object data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      size++;
      return;
    }

    Node cur = head;

    while (cur.next != null) {
      cur = cur.next;
    }

    cur.next = newNode;
    size++;
  }

  public void removeLast() {
    if (head == null || size == 0) {
      throw new NullPointerException("List is empty");
    }

    Node cur = head;
    Node prev = null;

    while (cur.next != null) {
      prev = cur;
      cur = cur.next;
    }

    assert prev != null;
    prev.next = null;
    size--;
  }

  public void printList() {
    System.out.println("Current List Size: " + size);
    Node cur = head;

    for (int i = 0; i < size; i++) {
      System.out.println(cur.data);
      cur = cur.next;
    }
  }

}
