abstract class Shape
{
    abstract void numberOfSides();
    protected void finalize()
    {
    System.out.println("CALLED");
    }
}
class Rectangle extends Shape
{
    protected void numberOfSides()
    {
        System.out.println("A RECTANGLE HAS 4 SIDES");
    }
    protected void finalize()
    {
    System.out.println("CALLED");
    }
    Rectangle()
    {
        super.finalize();
    }
}
class Triangle extends Shape
{
    protected void numberOfSides()
    {
        System.out.println("A TRIANGLE HAS 3 SIDES");
    }
    protected void finalize()
    {
    System.out.println("CALLED");
    }
    Triangle()
    {
        super.finalize();
    }
}
class Hexagon extends Shape
{
    protected void numberOfSides()
    {
        System.out.println("A HEXAGON HAS 6 SIDES");
    }
    protected void finalize()
    {
        System.out.println("CALLED");
    }
    Hexagon()
    {
        super.finalize();
    }
}


public class Shapes {
    public static void main(String args[])
    {
        Rectangle rect=new Rectangle();
        Triangle tri=new Triangle();
        Hexagon hex=new Hexagon();
        rect.numberOfSides();
        tri.numberOfSides();
        hex.numberOfSides();
        rect.finalize();
        tri.finalize();
        hex.finalize();
    
    }
}
