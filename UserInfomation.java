import java.util.*;

public class UserInfomation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

 
        System.out.print("Date of birth: ");
        String dob = sc.nextLine();

        
        System.out.print("Student ID: ");
        String id = sc.nextLine();

        System.out.printf("Name: %s\nDate of birth: %s\nStudent ID: %s", name, dob, id);
    }
}