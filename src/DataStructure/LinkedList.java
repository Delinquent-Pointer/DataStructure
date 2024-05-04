package DataStructure;

/**
 *  This my own practice made it available for public
 *  Please cite me if your going to use it =)
 */

public class LinkedList {

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
    if (head == null) {
      printError("List is empty");
      return;
    }

    if (head.next == null) {
      head = null; // If there's only one element, set head to null
      size--;
      return;
    }

    Node cur = head;
    Node prev = null;

    while (cur.next != null) {
      prev = cur;
      cur = cur.next;
    }

    prev.next = null;
    size--;
  }

  private void printError(String eMsg){
    System.out.println(eMsg);
  }

  public void printList() {
    System.out.println("Current List Size: " + size);
    Node cur = head;

    for (int i = 0; i < size; i++) {
      System.out.println(cur.data);
      cur = cur.next;
    }
  }

  public class Node{
    Object data;
    Node next;
    public Node(Object data) {
      this.data = data;
      this.next = null;
    }
  }

}
