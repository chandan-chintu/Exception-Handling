package examples;

public class TryCatchExample {
    public static void main(String[] args) {
        int a=10, res=0;
        try{
            // code to mointor
            System.out.println("Before exception occurs at try block");
            res = a/0;
            System.out.println("After exception occurs at try block");
        } catch (ArithmeticException e){
            // handle the exception
            System.out.println("Exception occured : "+e.getMessage());
        }
        System.out.println("a is :"+a);
        System.out.println("res is :"+res);
    }
}
