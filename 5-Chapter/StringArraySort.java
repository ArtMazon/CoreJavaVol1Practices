class StringArraySort{
    public static void main(String[] args) {
        String [] arrayString = {"Hola","Mundo","Java","Bubble","Sort"};

        System.out.print("Unordered Array ");
        for(String word : arrayString){
            System.out.print(word+" ");

        }
        System.out.println();

        for(int i = 1; i < arrayString.length; i++){
            for(int j = arrayString.length-1; j >= i;j--){
     
                if(arrayString[j-1].length() > arrayString[j].length()){
                    String pivot = arrayString[j-1];
                    arrayString[j-1] = arrayString[j];
                    arrayString[j] = pivot;

                }
            }
        }

        System.out.print("Ordered array ");
        for(String word : arrayString){
            System.out.print(word +" ");
        }
        System.out.println();


    }
}