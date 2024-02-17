public class FullStackException extends Exception{

    int size;

    FullStackException(int size){ this.size = size;};


    public String toString(){
        return "\nThe stack is full, its maximum size is : "+ size;
    }
    
}
