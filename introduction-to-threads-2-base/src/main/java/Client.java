import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

//        System.out.print("Enter first number: ");
        int num1 = myObj.nextInt();

//        System.out.print("Enter second number: ");
        int num2 = myObj.nextInt();

        Adder add = new Adder(num1, num2);

        ScalerThread adderThread = new ScalerThread(add);
        adderThread.start();
    }
}