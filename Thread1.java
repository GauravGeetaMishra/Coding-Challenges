class MyThread extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        
        t1.start();  // Starts new thread, calls run()
        t2.start();
        
        // t1.run();  // DON'T DO THIS - calls run() in same thread, no multithreading
    }
}