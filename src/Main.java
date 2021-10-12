public class Main {
    public static void main(String[] args) {
        try{
            CustomException customer=new CustomException();
            customer.formFilling(17,10000,"hello world");
        }
        catch(Exception e){
            //e.printStackTrace();
            new NullPointerException();
        }
        finally {
            System.out.println("Inside Finally block");
        }
    }
}
