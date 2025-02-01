// class Demo {
//     static int a = 10;
//     static int b = 10;

//     public static void m1() {
//         int sum = a + b;
//         System.out.println(sum);
//     }

//     public static void main(String[] args) {
//         m1();
//         Demo.m1();

//     }
// }

// class Demo {
//     static int a = 10;
//     static int b = 10;

//     public void m1() {
//         int sum = a + b;
//         System.out.println(sum);
//     }

//     public static void main(String[] args) {
//         Demo d = new Demo();
//         d.m1();

//     }
// }

// class Demo {
//     int a = 10;
//     int b = 10;

//     static int c = 30;
//     static int d = 40;

//     public void m1() {
//         a++;
//         b++;
//         System.out.println(a);
//         System.out.println(b);
//     }

//     public static void m2() {
//         c++;
//         d++;
//         System.out.println(c);
//         System.out.println(d);
//     }

//     public static void main(String[] args) {
//         Demo d = new Demo();
//         d.m1();
//         m2();
//         System.out.println("/n");
//         Demo d1 = new Demo();
//         d1.m1();
//         m2();
//         System.out.println("/n");
//         Demo d2 = new Demo();
//         d2.m1();
//         m2();

//     }
// }

class Demo {
    int a = 1;
    static int b = 1;

    {
        a++;
        b++;
        System.out.println(a);
        System.out.println(b);
    }

    static {
        b++;
        
        System.out.println(b);
    }

    {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
