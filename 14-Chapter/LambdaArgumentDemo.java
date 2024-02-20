
interface StringFunc{
    String func(String str);
}

public class LambdaArgumentDemo {


    static String changeString(StringFunc strFunc , String str){
        return strFunc.func(str);
    }


    public static void main(String[] args) {
        
        StringFunc spaceRemover = (n) ->{

            String result = "";
            for(int i = 0; i < n.length(); i++ ){

                if(n.charAt(i) != ' '){

                    result  += n.charAt(i);

                }
            }
            return result;
        };

        System.out.println(changeString(spaceRemover, args[0]));
    }
    
}
