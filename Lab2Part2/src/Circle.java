import java.lang.Math;

public class Circle
{

    private final Point center;
    private final double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {return center;}
    public double getRadius() {return radius; }

    public double perimeter(){
        double answer = (2 * Math.PI * this.radius);
        return answer;
    }
}
