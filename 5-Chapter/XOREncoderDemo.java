class XOREncoder{
    private String key;

    XOREncoder(String key){
        this.key = key;
    }

    public String encodeMessage(String message){
        String encodeMessage = "";

        for(int i = 0; i <message.length();i++){
            encodeMessage += (char) (message.charAt(i) ^ key.charAt(i % key.length()));
        } 

        return encodeMessage;
    }
}


class XOREncoderDemo{
    public static void main(String[] args) {
        XOREncoder cesar = new XOREncoder("" + (char) 88);

        String result = cesar.encodeMessage("This is a test");
        System.out.println("Mensaje original ");
        System.out.println("Mensaje codificado "+ result);
        System.out.println("Mensaje decodificado "+ cesar.encodeMessage(result));

        System.out.println("---"+result+"---");


        
    }
}