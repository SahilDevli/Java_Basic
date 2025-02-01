class resource{
    private int count = 0;

    // if we don't use 'synchronized' than outpul will not be equals to expected one.
    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}


class myThread extends Thread{
    private resource var;

    public myThread(resource var){
        this.var = var;
    }
    public void run(){
        for(int i=0; i<1000; i++){
            var.increment();
        }
    }
}


public class K_Synchronization{
    public static void main(String[] args) {
        resource r = new resource();
        myThread t1 = new myThread(r);
        myThread t2 = new myThread(r);
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(Exception e) {
            System.out.println(e);
        }

        System.out.println("Final count: " + r.getCount()); // Output: Final count: 2000
        // but final count in not always 2000 
    }
}

// note : we also syncronize whole peace of code using " syncronize block " ...
