import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * CopyFilesWithHyphen
 */
public class CopyFilesWithHyphen {

    public static void main(String[] args) throws IOException{


        FileInputStream fileReader = null;
        FileOutputStream fileWriter = null;

        if (args.length != 2) {
            System.out.println("Usage: CopyFilesWithHypen file1 file2");
            return;
        }

        

        try {
            fileReader = new FileInputStream(args[0]);

            fileWriter = new FileOutputStream(args[1]);

            int characaterRead = 0;
            do {
                characaterRead = fileReader.read();
                if( characaterRead != -1){

                    if (characaterRead != ((int) ' ')) {
                        fileWriter.write(characaterRead);
                        
                    }else{
                        fileWriter.write((int) '-');
                    }
                }
            } while (characaterRead != -1);
        } catch (IOException e) {
            System.out.println("There was an error: "+ e);
        }finally{
            try {

                if (fileReader != null) {
                
                    fileReader.close();  
                }
                if (fileWriter != null) {
                
                    fileWriter.close();    
                }
                
            } catch (IOException e) {
                System.out.println("Error trying to close the files: " + e );
            }
            
        }
        
        
    }

    
}