public class HomeWork2 {
    private static int remainder(int a, int b) {
        return a % b;
    }

    private static void print(int a) {
        System.out.println(a);
    }

    private static void print(double a) {
        System.out.println(a);
    }

    private static void print(boolean a) {
        System.out.println(a ? "TRUE" : "FALSE");
    }

    private static double cToF(int a) {
        return a * 1.8 + 32;
    }
    
    private static double fToC(int a) {
        return (a - 32) / 1.8;
    }

    private static boolean isLeapYear(int a) {
        return ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)));
    }

    private static int minOf3(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    private static boolean isAlphanumeric(char a) {
        return ((47 < a) && (a < 58)) || ((64 < a) && (a < 91)) || (((96 < a) && (a < 123)));
    }

    private static int a8(int a) {
        if (a > 0) return (a8(a - 1) + a);
        return 0;
    }

    private static double b8(int a) {
        if (a > 0) return (b8(a - 1) * a);
        return 1;
    }

    private static double c8(int a) {
        if (a >= 0) return c8(a - 1) + Math.pow(2, a);
        return 0;
    }

    private static double d8(int a) {
        if (a > 0) return d8(a - 1) + 1.0/(2 * a);
        return 0;
    }

    private static double e8(int a) {
        if (a > 0) return e8(a - 1) + Math.pow(a, 2);
        return 0;
    }

    private static void hailstone(int a) {
        if (a == 1) return;
        if (a % 2 == 0) {
            int result = a / 2;
            System.out.println(a + " is even, so we take " + a + " / 2 = " + result);
            hailstone(result);
        } else {
            int result = 3 * a + 1;
            System.out.println(a + " is even, so we take " + a + " * 3 + 1 = " + result);
            hailstone(result);
        }
    }

    private static int sumFirstAndLast(int a) {
        return (a % 10) + (a / (int)(Math.pow(10, (int)(Math.log10(a)))));
    }

    private static int countDigits(int a) {
        return (int)(Math.ceil(Math.log10(a)));
    }

    private static int reverseDigits(int a) {
        int length = countDigits(a), output = 0;

        for (int i = 0; i < length; i++) {
            output += (a % 10) * Math.pow(10, length - i - 1);
            a /= 10;
        }

        return output;
    }

    private static boolean isPalindrome(int a) {
        int b = reverseDigits(a);

        return (a == b);        
    }

    public static void main(String[] args) {
        print(remainder(7, 5));
        print(cToF(6));
        print(fToC(6));
        print(isLeapYear(1900));
        print(minOf3(5, 9, 2));
        print(isAlphanumeric('u'));
        print(a8(100));
        print(b8(100));
        print(c8(50));
        print(d8(25));
        print(e8(12));
        hailstone(100);
        print(sumFirstAndLast(1895));
        print(countDigits(3098410));
        print(reverseDigits(9374124));
        print(isPalindrome(8976798));
    }
}