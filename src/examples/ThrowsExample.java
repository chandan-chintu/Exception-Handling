package examples;

import java.util.Scanner;

public class ThrowsExample {

    public void demo() throws IllegalAccessException, InterruptedException {
        System.out.println("Inside demo method");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try{
            if(a==10){
                throw new RuntimeException("a is 10 and unchecked exception caught");
            }
            if(a==20){
                throw new IllegalAccessException("a is 20 and checked exception caught");
            }
            if(a==30){
                throw new InterruptedException("a is 30 and checked exception caught");
            }
            if(a==40){
                throw new ArithmeticException("a is 10 and unchecked exception caught");
            }
        }catch (Exception e1){
            System.out.println("Exception occured : "+e1.getMessage());
        }
        System.out.println("a is : "+a);
        System.out.println("End of demo method");
    }

    public static void main(String[] args) {
        // try-catch block is mandatory when we are calling methods with throws exceptionlist
        try{
            ThrowsExample throwsExample = new ThrowsExample();
            throwsExample.demo();
        }catch (Exception e1){
            System.out.println("Exception occured : "+e1.getMessage());
        }

    }
}
