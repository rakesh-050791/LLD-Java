import java.util.Iterator;
public class Node implements  Iterable<Node>{
    public int data;
    public Node next;

    public Node(int val){
        this.data = val;
    }

    public Node(int val, Node next){
        this.data = val;
        this.next = next;
    }

    @Override
    public Iterator<Node> iterator(){
        return new NodeIterator(this);
    }

    public static class  NodeIterator implements Iterator<Node>{
        private Node node;
        private NodeIterator(Node node){
            this.node = node;
        }

        @Override
        public boolean hasNext(){
            return this.node != null;
        }

        @Override
        public Node next(){
            Node temp = this.node;
            this.node = this.node.next;
            return temp;
        }
    }
}