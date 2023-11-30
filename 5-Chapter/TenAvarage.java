class TenAvarage{
    public static void main(String[] args) {
        double[] array = new double[10];
        double sum = 0, avarage;

        System.out.print("The array is : ");
        for(int i = 0 ; i < 10 ;i++){

            int pivot = (int) (Math.random()*100);


            array[i] = ((double) pivot)/10;
            System.out.print(array[i]+" ");
        }

        System.out.println();

        for(double num : array){
            sum +=num;
        }

        avarage = sum / array.length;

        System.out.println("The avarage is: " + avarage);
    }
}