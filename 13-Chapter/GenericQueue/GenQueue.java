public class GenQueue<T> implements IGenQ<T> {

    private T[] queue;
    private int putloc,getloc;

    GenQueue(T[] aRef){
        queue = aRef;
        putloc = getloc =0;

    }

    @Override
    public void put(T object) throws QueueFullException {
        if(putloc == queue.length){
            throw new QueueFullException(queue.length);
        }

        queue[putloc++] = object;
    }

    @Override
    public T get() throws QueueEmptyException {
        if(getloc == putloc){
            throw new QueueEmptyException();
        }

        return queue[getloc++];
    }

   

    
}
