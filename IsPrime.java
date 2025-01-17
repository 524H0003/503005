import java.util.Scanner;

public class IsPrime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    boolean isPrime = true;

    for (int i = 2; i <= Math.pow(x, 0.5); i += 1 + (i%2))
      if (x % i == 0)
        isPrime = false;

    if (isPrime)
      System.out.println("This is a prime number.");
    else
      System.out.println("This is not a prime number.");
  }
}