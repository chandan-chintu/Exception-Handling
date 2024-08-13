package ownexception;

public class MainClass {
    public static void main(String[] args) {
        try{
            System.out.println("Testing our own exception");
            throw new MyOwnException("Our own exception occured");
        } catch (Exception e1){
            System.out.println("Exception occured : "+e1.getMessage());
        }
    }
}
