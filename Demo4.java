public class Demo4 {
    public Demo4() {
        System.out.println("zero arg constrctor");
    }
    public Demo4(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
    public Demo4(String a, String b) {
        System.out.println(a);
    }
    public static void main(String[] args) {
        Demo4 d = new Demo4("asds", "asd");
        Demo4 d1= new Demo4(10, 20);

    }

}
