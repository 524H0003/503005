import java.util.Scanner;

public class ScoreManagement {
  private static double totalScore(double math, double literature, double english) {
    return (math * 2 + literature + english) / 4;
  }

  private static char rankDetermine(double score) {
    if (score >= 8.0)
      return 'A';
    if (score >= 5.0)
      return 'B';
    return 'C';
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double math, literature, english;
    

    System.out.print("Enter math score: ");
    math = sc.nextDouble();
    System.out.print("Enter literature score: ");
    literature = sc.nextDouble();
    System.out.print("Enter english score: ");
    english = sc.nextDouble();

    double score = totalScore(math, literature, english);

    System.out.printf("Your rank is %s", rankDetermine(score));
  }
}