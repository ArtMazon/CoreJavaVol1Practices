import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * CopyFilesWHTry
 */
public class CopyFilesWHTry {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: CopyFilesWithHypen file1 file2");
            return;
        }

        

        try(
            FileInputStream fileReader = new FileInputStream(args[0]);
            FileOutputStream fileWriter = new FileOutputStream(args[1]);) {

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
    }
}
}