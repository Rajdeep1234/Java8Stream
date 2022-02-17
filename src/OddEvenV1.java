public class OddEvenV1 {
    public static void main(String args[]){

        OddEvenV1 p1=new OddEvenV1();
  Thread t1=new Thread(()->{

      try {
          p1.oddnumber();
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
  });

        Thread t2=new Thread(()->{
            try {
                p1.evennumber();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }


    private int counter=0;
    private static  int bound=10;

    public void oddnumber() throws InterruptedException {
        synchronized (this) {
           while(counter<bound) {
                if (counter % 2 == 1) {
                    wait();
                }
                counter++;
                System.out.println(Thread.currentThread().getName()+" -->"+counter);
                notify();
            }
        }

    }

    public void evennumber() throws InterruptedException {
        synchronized (this) {
           while(counter<bound) {
                if (counter % 2 == 0) {
                    wait();
                }
               counter++;
                System.out.println(Thread.currentThread().getName()+" -->"+counter);
                notify();
            }
        }
    }

}


