
public class I_demoThread extends Thread {
    @Override
    public void run(){
    try{
        System.out.println("Running method 1.1");
        System.out.println("Running method 1.2");
        Thread.sleep(2000); // Sleep for 2 seconds
        System.out.println("Running method 1.3");
    }
    catch (InterruptedException e) {
        System.out.println("Thread interrupted: " + e);
    }
}

    public static void main(String[] args) throws InterruptedException{
        // Runnable task1 = () -> {
        //     System.out.println("Run 1");
        //     System.out.println("Run 2");
        // };

        Runnable th1 = new I_demoThread();
        Thread t1 = new Thread(th1); // or Thread(task1); for above arrow methods of Runnable.
        
        // t1.run();
        System.out.println(t1.getState()); // NEW
        t1.start();

        // System.out.println(t1.getState()); // RUNNABLE
        // System.out.println("main thread is here..."); // main thread continues parallelly

        // t1.join();
        // System.out.println(t1.getState()); // TERMINATED
        
    }
}
