class StackDemo{
    public static void main(String[] args) {
        Stack s1 = new Stack(10);

        char[] name = {'T','o','m'};
        Stack s2 = new Stack(name);

        int i;

        for(i = 0 ; i < 15 ; i++){
            s1.push( (char) ('A'+ i));
        }

        char ch;

        for(i = 0 ; i <15 ; i++){
            ch = s1.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of q2: ");

        for(i = 0 ; i <3 ; i++){
            ch = s2.pop();
            System.out.print(ch);
        }
    }
}