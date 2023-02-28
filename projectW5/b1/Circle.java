package projectW5.b1;

public class Circle
{
    private double radius = 1.0;
    private String color = "red";

    public Circle()
    {

    }

    public Circle(double radius, String color)
    {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public String toString()
    {
        return "Circle [radius= " + getRadius() + 
        ", color= " + getColor() + 
        ", circumference= " + getCircumference() + 
        ", area= " + getArea() + "]";
    }
}