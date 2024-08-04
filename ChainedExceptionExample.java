public class ChainedExceptionExample {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("hi");
            System.out.println("Caught: " + e);
           System.out.println("Cause: " + e.getCause());
        }
    }
    public static void method1() throws Exception {
        try {
            method2();
        } catch (Exception e) {
            throw new Exception("Exception in meth", e);
        }
    }
    public static void method2() throws Exception {
        throw new Exception("Exception in method2");
    }
}