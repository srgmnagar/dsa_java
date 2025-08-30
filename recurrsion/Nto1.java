public class Nto1 {
    public static void main(String[] args) {
        // func(22);
        funcRev(22);
    }

    static void func(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        func(n - 1);
    }

    static void funcRev(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        funcRev(n - 1);
        System.out.println(n);
    }
}
