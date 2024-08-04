import java.util.Scanner;

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
           Scanner scanner=new Scanner(System.in);
           System.out.println("Enter the numerator");
           int numerator=scanner.nextInt();
           System.out.println("Enter the Denominator");
           int denominator=scanner.nextInt();
            calculate(numerator,denominator);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
