package netology.worker;

public class Main {

    public static void main(String[] args) {
	// write your code here

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listener1 = System.out::println;
        Worker worker = new Worker(listener);
        Worker worker1 = new Worker(listener1);
        worker1.start();
    }
}
