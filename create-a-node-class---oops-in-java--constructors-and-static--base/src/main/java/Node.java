public class Node {
    public int data;
    public Node next;


    public Node(int val){
        this.data = val;
        this.next = null;
    }

    public Node(Node node){
        this.data = node.data;

        if (node.next != null){
            this.next = new Node(node.next);
        } else {
            this.next = null;
        }
    }
}