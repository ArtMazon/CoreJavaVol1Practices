

interface IntPredicate{
    boolean func(int n);
}


/**
 * InnerMethodRefDemo2
 */
 class MyIntNum {

    private int v;

    MyIntNum(int x){ v = x;};

    int getNum(){return v;};

    boolean isFactor(int n){return (v % n == 0) ? true: false;};

    boolean hasCommonFactor(int n){

        if(isFactor(n)) return true;

        for( int i = 2; (i <= v/i) && (i <= n/i);i++ ){

            if( isFactor(i) && n % i ==0){
                return true;
            }

        }

        return false;
    }

    
}

public class MethodRefDemo2 {
    public static void main(String[] args) {
        MyIntNum test = new MyIntNum(9);

        IntPredicate testFunc = test::hasCommonFactor;


        System.out.println(testFunc.func(9));
        System.out.println(testFunc.func(4));
        System.out.println(testFunc.func(5));
        System.out.println(testFunc.func(500));


    }
    
}
