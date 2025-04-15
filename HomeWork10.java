import java.util.*;

interface IMissingDigits {
    String findMissingDigits(int x);
}

class MissingDigits implements IMissingDigits {
    static Scanner sc = new Scanner(System.in);

    @Override
    public String findMissingDigits(int x) {
        boolean isFound[] = new boolean[10];
        String out = new String("");

        for (; x != 0; x /= 10) 
            isFound[x % 10] = true;

        for (int i = 0; i < 10; i++)
            if (!isFound[i])
                out += i + " ";
        
        return out;
    }

    public static void main(String[] argv) {
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        System.out.printf("Missing digits in %d: %s\n", input, new MissingDigits().findMissingDigits(input));
    }
}

class MissingDigits1 implements IMissingDigits {
    static Scanner sc = new Scanner(System.in);

    @Override
    public String findMissingDigits(int x) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        String out = new String("");

        for (; x != 0; x /= 10) 
            digits.add(x % 10);

        for (int i = 0; i < 10; i++)
            if (!digits.contains(i))
                out += i + " ";
        
        return out;
    }

    public static void main(String[] argv) {
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        System.out.printf("Missing digits in %d: %s\n", input, new MissingDigits().findMissingDigits(input));
    }
}

class DetectDuplicates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.print("Enter number of unique ...: ");
		int numUnique = sc.nextInt();

		System.out.print("Enter limit: ");
		int limit = sc.nextInt();

		Random rnd = new Random();
		int countUnique = 0; 
		int countDuplicates = 0; 
		int num; 

        while (list.size() < numUnique) {
            num = Math.abs(rnd.nextInt() % limit);
            countDuplicates += list.contains(num) ? 1 : 0;
            list.add(num);
        }

        System.out.println("List: " + list);
		System.out.println("Duplicates detected: " + countDuplicates);
	}
} 