public class TickTockTest {

    public static void main(String[] args) {
        TickTock tickTock = new TickTock();

        MyThread myThread1 = MyThread.createAndStart("Tick", tickTock);
        MyThread myThread2 = MyThread.createAndStart("Tock", tickTock);

        try {
            myThread1.thread.join();
            myThread2.thread.join();
        } catch (InterruptedException e) {

            System.out.println("Main thread interrumpted");
        }


    }
    
}
