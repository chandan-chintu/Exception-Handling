package examples;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try{
            int a = 10;
            int res = a/10;
            int arr[]={10,20,30};
            System.out.println("Array arr 5th element is : "+arr[4]);
        } catch (ArithmeticException e1){
            System.out.println("Exception occured : "+e1.getMessage());
        }catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("Exception occured : "+e2.getMessage());
        }
        System.out.println("After multiple try catch blocks");
    }
}
