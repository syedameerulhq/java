public class Demo1 {

    static {
        System.out.println("this is static block");
    }

    {
        System.out.println("this is non static  block");
    }

    public static void main(String[] args) {
        new Demo1();

    }
}
