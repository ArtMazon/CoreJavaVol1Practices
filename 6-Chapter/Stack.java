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

        if (pushloc == q.length) {
            System.out.println("The stack is full");
            
        }

        q[pushloc++] = ch;

    }

    public char pop(){

        if (pushloc == 0) {

            System.out.println("The stack is empty");

            return ' ';
            
        }

        return q[--pushloc];
   
    }


    
}