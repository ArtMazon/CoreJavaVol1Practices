package qpack;

/**
 * CircularQueue
 */
public class CircularQueue implements ICharQ {
    private char[] q ;
    private int putloc, getloc;

    public CircularQueue(int size){
        this.q = new char[size+1];
        this.putloc = this.getloc = 0;
    }

    public void put(char ch){

        if( putloc + 1 == getloc | (putloc == q.length -1 & getloc ==0)){
            System.out.println("The queue is full!");
            return;
        }

        q[putloc++] = ch;

        if(putloc == q.length) putloc = 0;
    }

    public char get(){

        if( getloc == putloc ){
            System.out.println("The queue is empty!");
            return (char) 0;
        }

        char ch = q[getloc++];

        if(getloc == q.length) getloc = 0;

        return ch;
    }


    
}
