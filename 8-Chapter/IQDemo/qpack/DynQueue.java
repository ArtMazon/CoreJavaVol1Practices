package qpack;

public class DynQueue  implements ICharQ{
    private char[] q;
    private int putloc , getloc ; 


    public DynQueue(int size){
        this.q = new char[size];
    }

    public void put(char ch){

        if(putloc == q.length){
            char[] pivot = new char[q.length * 2];

            for(int i = 0; i < q.length ; i++){
                pivot[i] = q[i];
            }

            q = pivot;

            q[putloc++] = ch;
            
        }

        q[putloc++] = ch;

    }

    public char get(){

        if(getloc == putloc){
            System.out.println("The queue is empty!");
            return (char) 0;
        }

        return q[getloc++];
    }




    


    
}
