public class Main {
    public static void main(String[] args) {
       try
        {
            int data=50/0; //may throw exception
        }
       catch(ArithmeticException e)
        //handling the exception

        {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

}
