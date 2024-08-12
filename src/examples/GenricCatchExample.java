package examples;

public class GenricCatchExample {
    public static void main(String[] args) {
        try{
            int a = 10;
            int res = a/0;
            int arr[]={10,20,30};
            System.out.println("Array arr 5th element is : "+arr[4]);
        } catch (Exception e1){
            System.out.println("Exception occured : "+e1.getMessage());
        }
        System.out.println("After multiple try catch blocks");
    }
}
