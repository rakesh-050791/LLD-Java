//import java.util.concurrent.Callable;
import java.util.concurrent.*;
public class TreeSizeCalculator implements Callable<Integer> {
    Node root;

    ExecutorService executor;

    public TreeSizeCalculator(Node root, ExecutorService executor){
        this.root = root;
        this.executor = executor;
    }

    @Override
    public Integer call() throws Exception {
        if (root == null) {
            return 0;
        }
        Future<Integer> leftSubtreeSize = executor.submit(new TreeSizeCalculator(root.left, executor));

        Future<Integer> rightSubtreeSize = executor.submit(new TreeSizeCalculator(root.right, executor));

        return 1 + leftSubtreeSize.get() + rightSubtreeSize.get();
    }
}