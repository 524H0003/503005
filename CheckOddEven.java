import java.util.Scanner;

public class CheckOddEven {
  private static String checkOddEven(int n) {
    if (n % 2 == 0)
      return "even";
    else 
      return "odd";
  }

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n: ");
    n = sc.nextInt();

    System.out.printf("This is an %s number", checkOddEven(n));
  }
}