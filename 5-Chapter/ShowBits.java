class ShowBits{
    int bitSize ;

    ShowBits(int bitSize){
        this.bitSize = bitSize;
    }

    String show(long number){

        String binaryConversition =""; 

        int spacer = 0;

        long mask = 1;

        mask <<= bitSize-1;

        for(;mask > 0 ; mask >>= 1){

            if( (number & mask) != 0){
                binaryConversition +="1";

            }else{
                binaryConversition +="0";
            }
            spacer++;

            if(spacer % 4 == 0){
                binaryConversition +=" ";
            }

        }

        return binaryConversition;


    }
}