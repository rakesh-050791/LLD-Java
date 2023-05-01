public class TableCreator implements Runnable {
    int num;

    public TableCreator(int num){
        this.num = num;
    }

    public void run(){
        for (int i = 1; i < 11; i++ ) {
            int ans = this.num * i;
            System.out.println(this.num + " times " + i + " is " + ans);
        }
    }
}