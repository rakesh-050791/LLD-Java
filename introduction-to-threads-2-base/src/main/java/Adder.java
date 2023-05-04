public class Adder implements Runnable{

    public int num1;
    public  int num2;

    public Adder(int number1, int number2){
        this.num1 = number1;
        this.num2 = number2;
    }

    @Override
    public void run() {
        int sum = num1 + num2;
        System.out.println(sum);
    }
}