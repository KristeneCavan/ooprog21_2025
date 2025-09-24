public class DebugCircle
{
   private int radius;
   private int diameter;
   private final double PI = 3.14159;
   private double area;

   // Constructor
   public DebugCircle(int r)
   {
      radius = r;
      diameter = 2 * r;
      area = PI * r * r;
   }

   // Getter for radius
   public int getRadius()
   {
      return radius;
   }

   // Getter for diameter
   public int getDiameter()
   {
      return diameter;
   }

   // Getter for area
   public double getArea()
   {
      return area;
   }
}
