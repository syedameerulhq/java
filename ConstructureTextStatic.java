public class ConstructureTextStatic {
    static int a;
    static int b;
    
    public static int Sum(int a, int b) {
        int ssum = a + b;
        return ssum;
    }
    public static int Mul(int a, int b) {
        int mul = a * b;
        return mul;
    }
    public static void main(String[] args) { 
        int result = Sum(1,44);
        System.out.println(result);
        int mulResult= Mul(21,3);
        System.out.println(mulResult);
    }
}
