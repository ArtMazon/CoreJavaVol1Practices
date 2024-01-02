public class MyThread implements Runnable {

    Thread thread;
    TickTock tickTockObject;

    MyThread(String name, TickTock ttObject) {
        thread = new Thread(this, name);
        tickTockObject = ttObject;
    }

    public static MyThread createAndStart(String name, TickTock ttObject) {
        MyThread myThread = new MyThread(name, ttObject);

        myThread.thread.start();

        return myThread;
    }

    public void run() {

        if (thread.getName().compareTo("Tick") == 0) {

            for (int i = 0; i < 5; i++) {
                tickTockObject.tick(true);
                tickTockObject.tick(false);
            }

        } else {
            for (int i = 0; i < 5; i++) {
                tickTockObject.tock(true);
                tickTockObject.tock(false);
            }

        }

    }

}
