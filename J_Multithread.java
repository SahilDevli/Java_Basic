class DemoTask1 implements Runnable { // Use Runnable for better flexibility
    
    @Override
    public void run() {
        try {
            System.out.println("Running method 1.1");
            System.out.println("Running method 1.2");
            Thread.sleep(2000); // Sleep for 2 seconds
            System.out.println("Running method 1.3");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e);
        }
    }
}

public class J_Multithread {
    public static void main(String[] args) throws InterruptedException {
        // Task for the first thread
        Runnable task1 = new DemoTask1();

        Thread t1 = new Thread(task1); // Wrap task in a Thread

        System.out.println("Thread state before start(): " + t1.getState());
        t1.start(); // Starts the thread 1(new thread)
        System.out.println("Thread state after start(): " + t1.getState());

        // Main thread continues execution
        System.out.println("Main thread continues...");

        t1.join(); // Wait for t1 to finish execution
        System.out.println("Thread state after completion: " + t1.getState());
    }
}

