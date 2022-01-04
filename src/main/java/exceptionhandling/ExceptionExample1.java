package exceptionhandling;

public class ExceptionExample1 {
    public static void main(String[] args) {
        // example of throw and throws
        try{
            int res = moduloExample(100, 400);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static int moduloExample(int a,int b) throws Exception {
        if(b>a){
             throw new Exception("B is greater than A, so modulo is not possible");

        }
        return a/b;
    }
}
