public class GenericStackDemo {

    public static void main(String[] args) {
        Integer[] iStore = new Integer[10];

        GenericStack<Integer> q = new GenericStack<Integer>(iStore);

        Integer iVal;

        System.out.println("Demonstrate a stack of Integers.");

        try{
            for(int i = 0; i < 11; i++){
                System.out.println("Adding "+ i + " to q.");
                q.push(i);
            }
        }catch(FullStackException exc){
            System.out.println(exc);
        }

        System.out.println();

        try{
            for(int i = 0;i < 11; i++){
                System.out.print("Getting next Integer from q: ");
                iVal = q.pop();
                System.out.println(iVal);
            }
        }catch(EmptyStackException exc){
            System.out.println(exc);
        }

        System.out.println();

        Double[] dStore = new Double[10];

        GenericStack<Double> t = new GenericStack<Double>(dStore);

        double dVal;

        System.out.println("Demonstrate a stack of doubles.");
        
                try{
                    for(int i = 0; i < 5; i++){
                        double j = (double) i/2;
                        System.out.println("Adding "+ j + " to q.");
                        t.push(j);
                    }
                }catch(FullStackException exc){
                    System.out.println(exc);
                }
        
                System.out.println();
        
                try{
                    for(int i = 0;i < 5; i++){
                        System.out.print("Getting next double from q: ");
                        dVal = t.pop();
                        System.out.println(dVal);
                    }
                }catch(EmptyStackException exc){
                    System.out.println(exc);
                }


    }




    


    
}
