import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(10);

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        ArrayCreator ac = new ArrayCreator(n);

        Future<ArrayList<Integer>> arrayListPromise = es.submit(ac);

        Thread th = new Thread((Runnable) arrayListPromise);
        th.start();

        ArrayList<Integer> arrayList = arrayListPromise.get();
        System.out.println(arrayList);

        es.shutdown();
    }
}