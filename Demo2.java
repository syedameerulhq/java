public class Demo2 {

    static int a = 10;
    static int b = 20;

    public static void sum() {
        int sum = a + b;
        System.out.println(sum);
    }

    {
        int sum = a * b;
        System.out.println(sum);

    }

    static
    {
        int sum = a * b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
   
       sum();
       Demo2.sum();


    }

}