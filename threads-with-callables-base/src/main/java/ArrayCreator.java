import java.util.concurrent.Callable;
import java.util.ArrayList;

public class ArrayCreator implements Callable<ArrayList<Integer>> {
    int n;

    public ArrayCreator(int numb){
        this.n = numb;
    }
    @Override
    public ArrayList<Integer> call() throws Exception {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        return(nums);
    }

}