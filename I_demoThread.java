// Threading can be done by using either Thread class or Runable Interface.

class create_thread_using_Thread extends Thread{
    String str = "Thread class";
    @Override
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println(str);
        }
    }
}

class create_thread_using_runnable implements Runnable{
    String str = "Runable interface";
    @Override
    public void run(){
        for(int i=0; i<50;i++){
            System.out.println(str);
        }
    }
}

public class I_demoThread{
    public static void main(String[] args) throws InterruptedException{

        // if using thread class then this the method to start thread
        create_thread_using_Thread th1 = new create_thread_using_Thread();
        th1.start();

        // can create n number of thread by creating objects
        // create_thread_using_Thread th3 = new create_thread_using_Thread();
        // create_thread_using_Thread th4 = new create_thread_using_Thread();

        // if using runnable interface then this the method to start thread
        create_thread_using_runnable r = new create_thread_using_runnable();
        Thread th2 = new Thread(r);
        th2.run();


        // -----------------        states of a thread      ---------------------

        // 1. NEW   2. RUNABLE/RUNNING  3. BLOCKED/WAITING  4. TERMINATED 
        Thread Tstate = new Thread();
        System.out.print("\nThread state: " + Tstate.getState()); // NEW
    }
}
