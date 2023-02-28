package projectW5.b1;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();

        c.setRadius(sc.nextDouble());
        c.setColor(sc.next());

        System.out.println(c.toString());
        System.out.println();

        Rectangle r = new Rectangle();

        r.setLength(sc.nextFloat());
        r.setWidth(sc.nextFloat());

        System.out.println(r.toString());

        sc.close();
    }
}
