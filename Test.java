import java.util.concurrent.ThreadLocalRandom;

public class Test {
    private static int randomInt() {
        return ThreadLocalRandom.current().nextInt(0, 101);
    }

    private static boolean testDefaultInstance() {
        MyHouse test = new MyHouse();

        return test.getLocation() == "NT" 
            && test.getLength() == 15
            && test.getWidth() == 5
            && test.getNumOfFloor() == 1;
    }

    private static boolean testInstance() {
        String location = String.valueOf(randomInt());
        int length = randomInt(), 
            width = randomInt(), 
            numOfFloor = randomInt();

        MyHouse test = new MyHouse(location, length, width, numOfFloor);

        return test.getLocation().equals(location)
            && test.getLength() == length
            && test.getWidth() == width
            && test.getNumOfFloor() == numOfFloor;
    }

    private static boolean testSetLocation() {
        MyHouse test = new MyHouse();
        String output = String.valueOf(randomInt());

        test.setLocation(output);

        return test.getLocation().equals(output);
    }

    private static boolean testSetLength() {
        MyHouse test = new MyHouse();
        double output = randomInt();

        test.setLength(output);

        return test.getLength() == output;
    }

    private static boolean testSetWidth() {
        MyHouse test = new MyHouse();
        double output = randomInt();

        test.setWidth(output);

        return test.getWidth() == output;
    }

    private static boolean testSetNumOfFloor() {
        MyHouse test = new MyHouse();
        int output = randomInt();

        test.setNumOfFloor(output);

        return test.getNumOfFloor() == output;
    }

    private static boolean isEqual() {
        MyHouse a = new MyHouse("DT2", 15, 3.5, 1), b = new MyHouse();

        return a.equals(b) && b.equals(a);
    }

    private static boolean isNotEqual() {
        MyHouse a = new MyHouse("DT2", 15, 3, 1), b = new MyHouse();

        return !a.equals(b);
    }

    private static void print(boolean a) {
        System.out.println(a ? "True" : "False");
    }

    public static void main(String[] args) {
        print(testDefaultInstance());
        print(testInstance());
        print(testSetLocation());
        print(testSetLength());
        print(testSetWidth());
        print(testSetNumOfFloor());
        print(isEqual());
        print(isNotEqual());
    }
}