public class A {
    public void Sum(int a, int b) {
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        A obj = new A();
        B.Mul(19, 11);
        B objB= new B();
        objB.Message();
        obj.Sum(1, 2);
    }

}
