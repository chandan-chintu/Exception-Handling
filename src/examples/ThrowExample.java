package examples;

public class ThrowExample {
    public void demo(){
        try{
            System.out.println("Before throwing an manual exception");
            throw new RuntimeException("Some random exception occured");
            // System.out.println("After throwing an manual exception"); - we cannot write next code lines after throw statement
        } catch (Exception e1){
            System.out.println("Exception occured : "+ e1.getMessage());
        }
        System.out.println("After try-catch and throw last statement");
    }
    public static void main(String[] args) {
        ThrowExample throwExample = new ThrowExample();
        throwExample.demo();
    }
}
