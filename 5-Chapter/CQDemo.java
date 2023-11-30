class CQDemo{
    public static void main(String[] args) {
        CircularQueue bigCQ = new CircularQueue(100);
        CircularQueue smallCQ = new CircularQueue(4);

        for(int i = 0 ; i < 26 ;i++){
            bigCQ.put((char) ('A' + i));
        }

        for(int i = 0 ; i < 26 ; i++){
            System.out.print(bigCQ.get()+" ");
        }
        System.out.println();

        for(int i = 0 ; i < 5 ;i++){
            System.out.print("Trying to store "+(char)('A'+i) +" ");
            smallCQ.put((char) ('A' + i));
            System.out.println();
        }

        for(int i = 0 ; i < 5 ;i++){
            System.out.print("Trying to print ");

            System.out.print(smallCQ.get());
            
            System.out.println();
        }

        smallCQ.put('A');
        System.out.println(smallCQ.get());

        

      

    }
}