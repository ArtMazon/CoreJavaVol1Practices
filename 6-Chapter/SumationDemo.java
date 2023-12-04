class Sumation{
    int sum = 0;

    Sumation(int number){

        for(int i = 1 ; i <= number ; i++){
            this.sum += i;
        }
    }

    Sumation(Sumation ob){
       this.sum = ob.sum;
    }
}

class SumationDemo{
    public static void main(String[] args) {
        Sumation s1 = new Sumation(5);
        Sumation s2 = new Sumation(s1);

        System.out.println("The value of the first sum: "+s1.sum);

        System.out.println("The value of the second sum: "+s2.sum);
    }
    
}