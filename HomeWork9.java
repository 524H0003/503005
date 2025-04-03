interface Area {
    public abstract double getArea();
}

interface Volume {
    public abstract double getVolume();
}

class Shape {
    protected String name;

    public Shape() {};

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Square extends Shape implements Area {
    protected double side;

    public Square() {}

    public Square(double side, String name) {
        super(name);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}

class Circle extends Shape implements Area {
    protected double radius;

    public Circle() {};

    public Circle(double radius, String name) {
        super(name);
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}

class Cube extends Square implements Volume {
    public Cube() {}

    public Cube(double side, String name) {
        super(side, name);
    }

    public double getVolume() {
        return getArea() * side;
    }
}

class Sphere extends Circle implements Volume {
    public Sphere(double radius, String name) {
        super(radius, name);
    }

    public double getVolume() {
        return 4/3.0 * radius * getArea();
    }
}

class Cylinder extends Circle implements Volume {
    private double height;

    public Cylinder(double height, double radius, String name) {
        super(radius, name);
        this.height = height;
    }

    public double getVolume() {
        return height * getArea();
    }
}