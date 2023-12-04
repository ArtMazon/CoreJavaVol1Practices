class CircularQueue{
    char [] q;
    int putloc;

    CircularQueue(int size){
        q = new char[size];
        putloc = 0;
    }

    CircularQueue(CircularQueue circularQueue){
        this.putloc = circularQueue.putloc;
        this.q = new char[circularQueue.q.length];

        for(int i = 0 ; i < this.putloc; i++){
            this.q[i] = circularQueue.q[i];
        }

    }

    CircularQueue(char[] a){
        this.putloc = 0;
        q = new char[a.length];

        for(int i = 0 ; i < a.length;i++) put(a[i]);
    }

    void put(char ch){
        if(putloc == q.length){
            System.out.println("The queue is full!");
            return;
        }

        q[putloc++] = ch;

    }

    char get(){


        if (putloc == 0) {
            System.out.println("The queue is empty");
            return (char) 0;
            
        }

        if(putloc == 1) return q[--putloc];

        char value = q[0];
        q = recycleArray(q);
        putloc--;
        
        return value;



    }

    private char[] recycleArray(char[] q){
        char[] pivot = new char[q.length];

        for(int i = 1; i < this.putloc;i++){
            pivot[i-1]= q[i];
        }

        return pivot;

    }
}