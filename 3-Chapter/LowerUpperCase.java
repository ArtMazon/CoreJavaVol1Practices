class LowerUpperCase{
    public static void main(String[] args) throws java.io.IOException{

        char ch;
        int changeCount = 0;

        System.out.println("Enter the character sequence");

        do{
            ch = (char) System.in.read();
            if (65 <= ch & ch <= 91) {
                System.out.print((char) (ch+32));
                changeCount++;
                
            }else{
                if (97 <= ch & ch <= 122) {
                    System.out.print((char) (ch -32));
                    changeCount++;
                    
                }
                else{
                    System.out.print(ch);
                }
            }
        }while(ch != '\n');

        System.out.println();
        System.out.println("There were: "+changeCount+" changes");



        
    }
}