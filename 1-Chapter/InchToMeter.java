class InchToMeter{
    public static void main(String[] args){
        int foot = 12,counter = 1, feet = 0;;
        double meters;
        for(int inches = 1; inches <=12*foot; inches++ ){

            meters = inches / 39.37;
            System.out.println(feet+"'"+counter+" feet are equal to: "+meters+ " meters");

            counter++;

            if(counter == 12){
                System.out.println();
                feet++;
                counter = 0;
            }


        }
    }
}