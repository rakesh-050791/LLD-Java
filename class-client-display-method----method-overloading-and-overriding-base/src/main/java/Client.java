import java.util.Stack;

public class Client {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

        display(st);

        // Make a call to display method as per question requirements here

    }

    // Write the display method as per requirements of question here

    public static void display(Iterable<?> iterable) {
        for (Object item : iterable) {
            System.out.println(item);
        }
    }
}