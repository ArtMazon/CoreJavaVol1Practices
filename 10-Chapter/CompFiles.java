/**
 * CompFiles
 */

 import java.io.*;
public class CompFiles {

    public static void main(String[] args) throws IOException{
        
        
        int i,j;

        if (args.length != 2) {
            System.out.println("Program usage: CompFiles FirstFile SecondFile");
            return;
            
        }

        try (FileInputStream firstFile = new FileInputStream(args[0]);
            FileInputStream secondFile = new FileInputStream(args[1]);
        ) {

            do{
                i = firstFile.read();
                j = secondFile.read();
                if( i  != j ) break;

            }while(i != -1 && j != -1);

            if( i != j){
                System.out.println("The files are different");
            }else{
                System.out.println("The files are the same");
            }


            
        } catch (IOException e) {
            System.out.println("An error has ocurred: " + e);
        }
        
    }

    
}