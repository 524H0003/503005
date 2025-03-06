public class MyHouse {
    private String location;
    private double length;
    private double width;
    private int numOfFloor;

    public MyHouse() {
        this("NT", 15, 5, 1);
    }

    public MyHouse(String loc, double len, double wid, int noF) {
        location = loc;
        length = len;
        width = wid;
        numOfFloor = noF;
    }

    public String getLocation() {
        return location;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public int getNumOfFloor() {
        return numOfFloor;
    }

    public void setLocation(String loc) {
        location = loc;
    }

    public void setLength(double len) {
        length = len;
    }

    public void setWidth(double wid) {
        width = wid;
    }

    public void setNumOfFloor(int noF) {
        numOfFloor = noF;
    }

    public double getUsableArea() {
        return length * width * numOfFloor;
    }

    public double calculateCompensationPrice() {
        double usableArea = getUsableArea();

        switch (location) {
            case "DT1":
                return usableArea * 30;

            case "DT2":
                return usableArea * 15;

            case "NT":
                return usableArea * 10;
        }

        return 0;
    }

    public boolean equals(Object obj) {
        MyHouse myHouse = (MyHouse) obj;

        if (!(obj instanceof MyHouse) || this.location == null || myHouse.getLocation() == null) 
            return false;

        return Math.abs(this.calculateCompensationPrice() - myHouse.calculateCompensationPrice()) < 50;
    }
}