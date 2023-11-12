class SpaceCounter{
    public static void main(String[] args) throws java.io.IOException {

        char ch;
        int spaceCount = 0 ;

        do{
            System.out.println("Enter a char sequence (if you put \'.\' it counts until this sequence)");

            do {

                ch = (char) System.in.read();

                if (ch == '.') break;
                
                if (ch == ' ') spaceCount++;

                
            } while (ch !='\n');


        }while(ch != '.');

        System.out.println("The total amout of blank spaces are: "+spaceCount);
        
    }
}