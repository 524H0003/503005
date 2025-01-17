import java.util.Scanner;

public class ReverseInt {
  private static int reverseInt(int n) {
    int length = (int)Math.log10(n) + 1, reversedN = 0;
    int[] digits = new int[length];

    for (int i = 0; i < length; i++) {
      digits[i] = (int)(n / Math.pow(10, (length - 1) - i)) % 10;
      reversedN += digits[i] * Math.pow(10, i);
    }

    return reversedN;
  }

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n: ");
    n = sc.nextInt();

    System.out.printf("Result: %d", reverseInt(n));
  }
}