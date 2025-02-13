import java.util.Scanner;
import java.util.Arrays;

public class HomeWork1 {
    private static void first(int[] arr) {
        for (int i : arr) 
            System.out.printf("%d ", i);
        
        System.out.printf("\n");
    }

    private static int[] second(int[] arr) {
        int[] out = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 0)
                out[j++] = arr[i];

        out = Arrays.copyOf(out, j);

        return out;
    }

    private static int third(int[] arr) {
        int out = arr[0];

        for (int i : arr)
            if (i > out)
                out = i;

        return out;
    }

    private static int forth(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 0)
                return i + 1;
        return -1;
    }

    private static int fifth(int[] arr) {
        int ou = 0; 

        for (int i : arr)
            ou += i;
        
        return ou;
    }

    private static int[] sixth(int[] arr) {
        int[] ou = Arrays.copyOf(arr, arr.length);

        Arrays.sort(ou);

        return ou;
    }

    private static int[] seventh(int value, int[] arr) {
        int[] ou = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) 
            ou[i + 1] = arr[i];

        ou[0] = value;

        return ou;
    }

    private static int[] eighth(int[] arr) {
        int[] ou = new int[arr.length];
        boolean found = false;

        for (int i = 0; i < arr.length; i++)
            if (!found && arr[i] > 0)
                found = true;
            else 
                ou[i - (found ? 1 : 0)] = arr[i];

        if (found)
            ou = Arrays.copyOf(ou, ou.length - 1);

        return ou;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();

        first(arr);
        first(second(arr));
        System.out.println(third(arr));
        System.out.println(forth(arr));
        System.out.println(fifth(arr));
        first(sixth(arr));
        first(seventh(n, arr));
        first(eighth(arr));
    }
}