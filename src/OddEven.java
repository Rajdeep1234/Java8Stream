public class OddEven {

    public static void main(String args[]) {
        PrintOddEvenNumber runnable1 = new PrintOddEvenNumber(true);
        PrintOddEvenNumber runnable2 = new PrintOddEvenNumber(false);

        Thread t1 = new Thread(runnable1, "T1");
        Thread t2 = new Thread(runnable2, "T2");

        t2.start();
        t1.start();




    }


}

class PrintOddEvenNumber implements Runnable{
    private   boolean isOdd;
    static int count=0;


    static Object monitor=new Object();

    public PrintOddEvenNumber(boolean  isOdd){
        this.isOdd=isOdd;

    }


    @Override
    public void run() {
        while (count < 10) {
            synchronized (monitor) {   //if we don't define this we will get IllegalMonitorStateException
                //The IllegalMonitorStateException is related to multithreading programming in Java. If we have a monitor we want to synchronize on,
                // this exception is     //thrown to indicate that a thread tried to wait or to notify other threads waiting on that monitor,
                if ((count%2==0 && isOdd )  ||(count%2==1 && !isOdd)) {
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
