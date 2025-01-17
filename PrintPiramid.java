import java.util.Scanner;

public class PrintPiramid {
  private static void printPiramid(int n, boolean isForward) {
    if (n < 1) return;

    if (isForward)
      printPiramid(n - 2, isForward);
    for (int i = 0; i < n; i++)
      System.out.print('*');
    System.out.print('\n');
    if (!isForward)
      printPiramid(n - 2, isForward);
  }

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n: ");
    n = sc.nextInt();

    printPiramid(n, true);
    printPiramid(n - 2, false);
  }
}
