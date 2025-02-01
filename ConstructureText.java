public class ConstructureText {
    int a;
    int b;
    public ConstructureText(int a, int b) {
        // this.a = a;
        // this.b = b;
    }
    public int Sum() {
        int ssum = a + b;
        return ssum;
    }
    public void Mul() {
        int mul = a * b;
        System.out.println(mul);
    }

    public static void main(String[] args) {
        new ConstructureText(1, 2998);
        ConstructureText obj = new ConstructureText(1, 10);
        int result = obj.Sum();
        System.out.println(result);
        obj.Mul();
    }

}
