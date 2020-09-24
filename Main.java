/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {

  public static void main(String[] args) {
    // Node node1 = new Node(new Car("Toyota", 100));
    // Node node2 = new Node(new Car("Tesla", 200));
    // Node node3 = new Node(new Car("Mitsubishi", 50));
    
    // node1.setNext(node2);
    // node2.setNext(node3);
    
    LinkedList ll = new LinkedList(new Car("Toyota", 100));
    ll.add(new Car("Tesla", 200));
    ll.add(new Car("Mitsubishi", 50));
    System.out.println(ll.toString());
  }
}

