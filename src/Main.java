import DataStructure.LinkedList;

public class Main {

  public static void main(String[] args) {

    LinkedList listA = new LinkedList();
    listA.addLast("hello");
    listA.addLast(2.0);
    listA.addLast(1);
    listA.addLast("3.5555f");
    listA.addLast(4.7897897789789);

    listA.removeLast();
    listA.removeLast();
    listA.removeLast();
    listA.removeLast();
    listA.removeLast();
    listA.removeLast();

    listA.printList();
  }
}