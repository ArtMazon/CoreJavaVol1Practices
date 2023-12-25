class Stack{
    private char [] q ;
    private int pushloc;

    Stack(int length){

        this.q = new char[length];
        this.pushloc = 0;

    }

    Stack(char[] chArray){
        this.pushloc = 0;
        q = new char[chArray.length];

        for(char ch : chArray) push(ch);

    }





    public void push(char ch){

        try {
            q[pushloc++] = ch;
            
        } catch (ArrayIndexOutOfBoundsException e) {

            pushloc = q.length;

           System.out.println("The stack is full!");
        }

        

    }

    public char pop(){

        try {
            
            return q[--pushloc];

            
        } catch (ArrayIndexOutOfBoundsException e) {
            pushloc = 0;
            System.out.println("The Stack is empty");
            
            return ' ';

        }


   
    }


    
}