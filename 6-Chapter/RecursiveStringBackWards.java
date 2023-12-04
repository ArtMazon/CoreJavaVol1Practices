/**
 * RecursiveStringBackWards
 */
public class RecursiveStringBackWards {

    static String string;





    public static String stringBackwards(String string){
        
        if (string.length() == 1) {

            return string;
            
        }

        return string.charAt(string.length()-1) + stringBackwards(string.substring(0, string.length()-1));


       
    }
}