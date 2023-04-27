public class Client {
    public static void main(String[] args) {
        System.out.println("I am the main class");

        Adder adder = new Adder();

        // Creating a new thread to run the Adder class
        ScalerThread adderThread = new ScalerThread(adder);
        adderThread.start();


        Subtractor subtractor = new Subtractor();

        // Creating a new thread to run the Subtractor class
        ScalerThread subtractorThread = new ScalerThread(subtractor);
        subtractorThread.start();

    }
}