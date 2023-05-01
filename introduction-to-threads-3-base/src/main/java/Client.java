import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();
        TableCreator tc = new TableCreator(n);

        ScalerThread tableCreator = new ScalerThread(tc);
        tableCreator.start();
    }
}