class FindFac{
    public static void main(String[] args) {
        for(int i = 2 ; i <=100; i ++){
            System.out.print("The divisors of "+i+ " are: ");

            for(int j = 2; j <= Math.sqrt(i) ;j++){

                if( i % j == 0){

                    if (j == (i/j)) {
                        System.out.print(j+" ");
                        
                    }else{
                        System.out.print(j+" "+(i/j)+" ");


                    }

                }

            }
            System.out.println();
        }
    }
}