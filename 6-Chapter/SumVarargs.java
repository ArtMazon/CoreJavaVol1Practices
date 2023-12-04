/**
 * SumVarargs
 */
public class SumVarargs {

    static int Sum(int ... numbers){

        int sum = 0;

        for(int number : numbers){

            sum +=number;
        }

        return sum;

    }

    public static void main(String[] args) {
        

        System.out.println("The sum of 1 ,2 , . . ., 10 is:" + Sum(1,2,3,4,5,6,7,8,9,10));
    }


}