package examples;

public class NestedTryExample {
    public static void main(String[] args) {
        try{
            System.out.println("1st try block");
            int a = 10;
            int res = a/10;
            try{
                System.out.println("2nd try block");
                String msg1 = "hello";
                System.out.println("msg1 length is : "+msg1.length());
                try{
                    System.out.println("3rd try block");
                    int arr[]={1,2,3};
                    System.out.println("arr[4] is:"+arr[4]);
                }catch (ArrayIndexOutOfBoundsException e3){
                    System.out.println("3rd catch block");
                    System.out.println("Exception occured - "+e3.getMessage());
                }
            }catch (NullPointerException e2){
                System.out.println("2nd catch block");
                System.out.println("Exception occured - "+e2.getMessage());
            }
        } catch (ArithmeticException e1){
            System.out.println("1st catch block");
            System.out.println("Exception occured - "+e1.getMessage());
        }
    }
}
