import java.util.concurrent.*;
public class driver {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        TreeSizeCalculator calculator = new TreeSizeCalculator(root, executor);
        Future<Integer> result = executor.submit(calculator);

        System.out.println("Size of binary tree: " + result.get());

        executor.shutdown();
    }

}
