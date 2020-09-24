public class LinkedList {
    
    public Node head;
    public Node tail;
    
    public LinkedList(Object data) {
        head = new Node(data);
        tail = head;
    }
    
    public void add(Object data) {
        tail.setNext(new Node(data));
        tail = tail.getNext();
    }
    
    public String toString() {
        String s = "";
        Node currentNode = head;
        while (currentNode != null) {
            s += currentNode.getData().toString();
            currentNode = currentNode.getNext();
        }
        return s;
    }
}