package ownexception;

public class MainClass2 {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block");
            throw new RandomOwnException("Some exception occured");
        }catch (Exception e1){
            System.out.println("Exception Occured : "+e1.getMessage());
        }
    }
}
