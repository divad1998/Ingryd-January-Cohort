package Week5;

import java.util.function.Consumer;

public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("I am running from the RunnableDemo class.");
    }

    public static void main(String[] args) {

    }

    void callRun() {
        //Runnable internalRunnable = RunnableDemo::run;
    }
}
