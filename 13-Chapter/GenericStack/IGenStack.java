public interface IGenStack<T> {

    public void push(T object) throws FullStackException;

    public T pop() throws EmptyStackException;


    
}
