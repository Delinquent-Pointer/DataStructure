
import DataStructure.LinkedList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;
import javax.swing.tree.TreeNode;


public class Main {

  public static void main(String[] args) {

    LinkedList listA = new LinkedList();
    listA.addLast("hello");
    listA.addLast(2.0);
    listA.addLast(1);
    listA.addLast("3.5555f");
    listA.addLast(4.7897897789789);

    for(int i = 0; i < 6; i++) {
      System.out.println(listA.removeLast());
    }

    listA.printList();

//    ArrayList<Object> listB = new ArrayList<>(); // this is build into java
//    listB.addLast("hello");
//    listB.addLast(2.0);
//    listB.addLast(1); // this is like enque
//    listB.removeFirst(); // this is like deque
//    listB.stream().forEach(System.out::println);

    Stack<Object> stack = new Stack<>();
    stack.push("hello");
    stack.push(2.0);
    stack.push(1);
    stack.push("3.5555f");
    stack.pop();
    stack.forEach(System.out::println);

  }
}