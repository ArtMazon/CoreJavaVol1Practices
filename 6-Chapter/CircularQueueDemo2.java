import java.util.Queue;

class CircularQueueDemo2{
    public static void main(String[] args) {
        CircularQueue q1 = new CircularQueue(10);

        char[] name = {'T','o','m'};
        CircularQueue q2 = new CircularQueue(name);

        char ch;
        int i;

        for(i = 0 ; i < 10 ; i++){
            q1.put( (char) ('A'+ i));
        }

        CircularQueue q3 = new CircularQueue(q1);

        System.out.print("Contents of q1: ");

        for(i = 0 ; i <10 ; i++){
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of q2: ");

        for(i = 0 ; i <3 ; i++){
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of q3: ");

        for(i = 0 ; i <10 ; i++){
            ch = q3.get();
            System.out.print(ch);
        }
    }
}