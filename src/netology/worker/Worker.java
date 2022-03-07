package netology.worker;

import java.util.function.Predicate;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public Worker(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (is33.test(i)) {
                errorCallback.onError("Task " + i + " is done");
            } else {
                errorCallback.onError("Error! Task " + i + " is not solved yet.");
            }
        }
    }
    Predicate<Integer> is33 = x -> x != 33;
}
