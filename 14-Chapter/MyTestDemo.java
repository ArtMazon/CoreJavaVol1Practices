

/**
 * MyTest
 */
 interface MyTest{

    boolean testing(int n);


}

interface MyFunc<T>{
    T func(T value);
}

interface NumericFunc{

    int func(int n);
}




/**
 * MyTestDemo
 */
public class MyTestDemo {

    public static void main(String[] args) {
        
        MyTest functionalInterfaceTest = (n) -> { return ((n >= 10 && n <= 25) ? true : false) ;};


        NumericFunc factorialFunc = (n) ->{
            if( n < 1 ){
                return -1;
            }

            int result = 1;


            for(; n >1 ;n--){

                result *=n;

            }

            return result;
            
        };

        MyFunc<Integer> factorialFuncGen = factorialFunc::func;

        System.out.println(functionalInterfaceTest.testing(Integer.valueOf(args[0])));


        System.out.println(factorialFunc.func(Integer.valueOf(args[0])));

        System.out.println(factorialFuncGen.func(Integer.valueOf(args[0])));
    }



    
}