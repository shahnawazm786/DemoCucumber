package exceptionhandling;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Exception Handling");
        try {
            int div = 100 / 0;
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
           // System.out.println(ae.getStackTrace());
            ae.printStackTrace();
        }
        int array[]={10,20,30,40};
        try{
            System.out.println(array[10]);
        }catch(ArrayIndexOutOfBoundsException  aiob){
            System.out.println(array[0]);
            aiob.printStackTrace();
        }

    }
}
