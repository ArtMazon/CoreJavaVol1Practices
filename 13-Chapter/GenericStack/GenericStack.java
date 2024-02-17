/**
 * GenericStack
 */
public class GenericStack<T> implements IGenStack<T> {

    T[] stackArray;

    int stackLoc;

    GenericStack(T[] arrayType){
        this.stackArray = arrayType;
        stackLoc = 0;
    }

    @Override
    public void push(T object) throws FullStackException {
        if (stackLoc == stackArray.length) {
            throw new FullStackException(stackArray.length);
            
        }

        stackArray[stackLoc++] = object;
    }

    @Override
    public T pop() throws EmptyStackException {
        if(stackLoc - 1 < 0){
            throw new EmptyStackException();
        }

        return stackArray[--stackLoc];
    }


    







    
}