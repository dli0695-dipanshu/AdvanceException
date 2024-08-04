public class ReThrowingException {
    static void performDivision(int numerator,int denominator){
        if(denominator==0)
            throw new ArithmeticException("Denominator cant be zero");
        System.out.println(numerator/denominator);
    }
    static void calculate(int numerator,int denominator){
        try {
            performDivision(numerator,denominator);
        }
        catch (ArithmeticException e) {
            throw e;
        }

    }

    public static void main(String[] args) {
       try {
            calculate(3,0);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
