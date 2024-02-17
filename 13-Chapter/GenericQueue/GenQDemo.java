public class GenQDemo {
    public static void main(String[] args) {
        Integer[] iStore = new Integer[10];

        GenQueue<Integer> q = new GenQueue<Integer>(iStore);

        Integer iVal;

        System.out.println("Demonstrate a queue of Integers.");

        try{
            for(int i = 0; i < 5; i++){
                System.out.println("Adding "+ i + " to q.");
                q.put(i);
            }
        }catch(QueueFullException exc){
            System.out.println(exc);
        }

        System.out.println();

        try{
            for(int i = 0;i < 5; i++){
                System.out.print("Getting next Integer from q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        }catch(QueueEmptyException exc){
            System.out.println(exc);
        }

        System.out.println();

        Double[] dStore = new Double[10];

        GenQueue<Double> t = new GenQueue<Double>(dStore);

        double dVal;

        System.out.println("Demonstrate a queue of doubles.");
        
                try{
                    for(int i = 0; i < 5; i++){
                        double j = (double) i/2;
                        System.out.println("Adding "+ j + " to q.");
                        t.put(j);
                    }
                }catch(QueueFullException exc){
                    System.out.println(exc);
                }
        
                System.out.println();
        
                try{
                    for(int i = 0;i < 5; i++){
                        System.out.print("Getting next double from q: ");
                        dVal = t.get();
                        System.out.println(dVal);
                    }
                }catch(QueueEmptyException exc){
                    System.out.println(exc);
                }


    }
    
}
