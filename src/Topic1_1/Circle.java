package Topic1_1;

public class Circle {
    // Instance variables
    private int x;
    private int y;
    private double radius;

    // Class variables
    static private double maxRadius;

    Circle() {
        // Usage of 'this' keyword to call constructor
        this(0,0,0);
    }

    Circle(int x, int y, double radius) {
        // Usage of Setters for constructor after defining them
        setX(x);
        setY(y);
        setRadius(radius);
        //this.x = x;
        //this.y = y;
        //this.radius = radius;
    }

    /*
    * Gets the area of the Topic1_1.Circle as an integer.
    *
    * @return The area of Topic1_1.Circle as int.
    * */
    public int getArea() {
        // Uses Java built-in Math class
        double area = Math.PI * Math.pow(this.radius,2);
        return (int)area;
    }

    /*
    * The following 6 functions gets and sets the variable values of class instance.
     */
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setX(int newX) {
        this.x = newX;
    }

    public void setY(int newY) {
        this.y = newY;
    }

    public void setRadius(double radius) {
        // Usage of Math.max call to
        this.radius = Math.max(radius, 0);
        // Usage of Ternary Operator to replace if-else block.
        // Alternative: this.radius = (radius < 0) ? 0 : radius;

        // Updating of class variables
        if (this.radius > Circle.maxRadius) {
            Circle.maxRadius = this.radius;
        }
    }

    /*
    * Gets the maximum radius of Topic1_1.Circle class so far.
    * @return The max radius of Topic1_1.Circle as double.
     */
    public static double getMaxRadius() {
        // Uses class variables in a static function
        return Circle.maxRadius;
    }
}
