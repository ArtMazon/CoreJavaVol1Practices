class Test{
    int a;

    Test(int i){a = i;}

    static void swap(Test ob1, Test ob2){
        int pivot;

        pivot = ob1.a;
        ob1.a = ob2.a;
        ob2.a = pivot;
    }

}

/**
 * TestDemo
 */
public class TestDemo {

    public static void main(String[] args) {

        Test test1 = new Test(1);
        Test test2 = new Test(2);

        System.out.println("The value of test1 is :"+test1.a);
        System.out.println("The value of test2 is: "+test2.a);

        System.out.println("We swap the values with swap()");

        Test.swap(test1, test2);

        System.out.println("The value of test1 is :"+test1.a);
        System.out.println("The value of test2 is: "+test2.a);
        
    }

    
}

