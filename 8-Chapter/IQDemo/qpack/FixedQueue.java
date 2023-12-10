package qpack;

/**
 * FixedQueue
 */
public class FixedQueue implements ICharQ {

    private char[] q;
    private int putloc, getloc;


    public FixedQueue(int size){
        this.q = new char[size];

        this.putloc = this.getloc = 0;
    }


    public void put(char ch){

        if(putloc == q.length){
            System.out.println("The Queue is full!");
            return;
        }

        q[putloc++] = ch;

    }

    public char get(){

        if(getloc == putloc){
            System.out.println("The Queue is empty!");
            return (char) 0;
        }

        return q[getloc++];
    }



    
}