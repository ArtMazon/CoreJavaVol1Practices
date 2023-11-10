class FirstHundredPrimes{
    public static void main(String[] args) {
        int prime;
        int spaceCounter=0;

        for(int i = 2 ; i < 100;i++){
            int divisorCounter=0;
            prime = i;
            
            for(int j = 1; j < prime ;j++){

                if( prime % j == 0){
                    divisorCounter++;
                }

            }

            if (divisorCounter == 1) {
                System.out.print(prime+"\t");
                spaceCounter++;
                
            }

            if (spaceCounter == 10) {
                System.out.println();
                spaceCounter = 0;
                
            }

        }
        System.out.println();
    }
}