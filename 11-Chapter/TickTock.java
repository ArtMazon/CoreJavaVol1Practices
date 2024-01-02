/**
 * TickTock
 */
public class TickTock {

    private String status;

    synchronized public void tick(boolean running) {
        if (!running) {
            status = "Ticked";
            notify();
            return;
        }

        status = "Ticked";
        System.out.print("Tick ");
        notify();

        try {

            while (!status.equals("Tocked")) {

                wait();

            }

        } catch (InterruptedException e) {
            System.out.println("Thread interrumpted");
        }

    }

    synchronized public void tock(boolean running) {
        if (!running) {
            status = "Tocked";
            notify();
            return;
        }

        status = "Tocked";
        System.out.println("Tock");
        notify();

        try {

            while (!status.equals("Ticked")) {

                wait();

            }

        } catch (InterruptedException e) {
            System.out.println("Thread interrumpted");
        }

    }

}