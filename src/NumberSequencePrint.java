public class NumberSequencePrint {

    public static void main(String args[]) {
        PrintNumber runnable1 = new PrintNumber(0, 3);
        PrintNumber runnable2 = new PrintNumber(1, 3);
        PrintNumber runnable3 = new PrintNumber(2, 3);

        Thread t1 = new Thread(runnable1, "T1");
        Thread t2 = new Thread(runnable2, "T2");
        Thread t3 = new Thread(runnable3, "T3");

        t2.start();
        t3.start();
        t1.start();




    }


}

class PrintNumber implements Runnable{
    private   int reminder;
    private   int totalthread;
     static int count=0;


     static Object monitor=new Object();

    public PrintNumber(int threadNumber, int totalthread){
        this.reminder=threadNumber;
        this.totalthread=totalthread;

    }


    @Override
    public void run() {
        while (count < 10) {
            synchronized (monitor) {   //if we don't define this we will get IllegalMonitorStateException
                if (count % totalthread != reminder) {
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
              else {
                    System.out.println(Thread.currentThread().getName() + " : " + count);
                    count++;
                    monitor.notifyAll();
                }
            }
        }
    }
}
