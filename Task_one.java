public class Task_one {

    public static void division(int a, int b) {

        System.out.println("a mod b = " + a % b);

    }

    public static void triangeArea(double a, double b) {

        System.out.println("Triangle Area = " + a * b);

    }

    public static void legs(int chickens, int cows, int pigs) {

        int chickenLegs = chickens * 2;
        int cowLegs = cows * 4;
        int pigLegs = pigs * 4;
        int sumLegs = chickenLegs + cowLegs + pigLegs;

        System.out.println("Number of legs = " + sumLegs);
    }

    public static void profitableGable(double prob, double prize, double pay) {

        if (prob * prize > pay) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    public static void operations(double a, double b, double n) {

        if (a + b == n) {
            System.out.println("sum");
        } else if ((a - b == n) || (b - a == n)) {
            System.out.println("sub");
        } else if ((a / b == n) || (b / a == n)) {
            System.out.println("div");
        } else if (a * b == n) {
            System.out.println("multi");
        } else {
            System.out.println("none");
        }
    }

    public static void ctoa(char c) {
        System.out.println((int) c);
    }

    public static void addUpTo(int a) {
        int result = 1;
        for (int i = 1; i <= a; i ++) {
            result = result + i;
        }

        System.out.println("!" + a + " = " + result);
    }

    public static void nextEdge(int a, int b) {
        System.out.println("Max next edge = " + (a + b -1));
    }

    public static void sumOfCubes(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + (int) Math.pow(arr[i], 3);
        }

        System.out.println(sum);
    }

    public static void abcMath(int a, int b, int c) {
        for (int i = 0; i < b; i++) {
            a = a + a;
        }

        if (a % c != 0) {
            System.out.println(a + " is not divide by " + c);
        } else {
            System.out.println(a + " is divide by " + c);
        }
    }
}
