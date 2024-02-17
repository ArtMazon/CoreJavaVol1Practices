/**
 * IGenQ
 */
public interface IGenQ<T> {

    public void put(T o) throws QueueFullException;

    T get() throws QueueEmptyException ;



    
}