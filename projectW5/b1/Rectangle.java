package projectW5.b1;

public class Rectangle
{
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle()
    {

    }

    public Rectangle(float length, float width)
    {
        this.length = length;
        this.width = width;
    }

    public void setLength(float length)
    {
        this.length = length;
    }

    public float getLength()
    {
        return length;
    }

    public void setWidth(float width)
    {
        this.width = width;
    }

    public float getWidth()
    {
        return width;
    }

    public double getArea()
    {
        return width * length;
    }

    public double getPerimeter()
    {
        return 2 * (width + length);
    }

    public String toString()
    {
        return "Rectangle [length= " + getLength() + 
        ", width= " + getWidth() +
        ", area= " + getArea() + 
        ", perimeter= " + getPerimeter() + "]";
    }
}