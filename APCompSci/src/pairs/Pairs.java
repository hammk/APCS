package pairs;

/**
   A Pair computes various mathematica...l computations with two numbers.
*/

public class Pairs
{
	
	private double num1;
	private double num2;
		
   /**
      Constructs a pair of numbers.
      @param aFirst the first value of the pair
      @param aSecond the second value of the pair
   */
   public Pairs(double aFirst, double aSecond)
   {
     num1 = aFirst;
     num2 = aSecond;
   }

   /**
      Computes the sum of the values of this pair.
      @return the sum of the first and second values
   */
   public double getSum()
   {
      return num1 + num2;
   }

   /**
      Computes the difference of the values of this pair.
      @return the difference of the first and second values
   */
   public double getDifference()
   {
      return num1 - num2;
   }

   /**
      Computes the product of the values of this pair.
      @return the product of the first and second values
   */
   public double getProduct()
   {
      return num1 * num2;
   }

   /**
      Computes the average of the values of this pair.
      @return the average of the first and second values
   */
   public double getAverage()
   {
      return (num1 + num2) / 2;
   }

   /**
      Computes the distance (absolute value of the difference)
         of the values of this pair.
      @return the distance of the first and second values
   */
   public double getDistance()
   {
      return Math.abs(num1 - num2);
   }

   /**
      Computes the maximum of the values of this pair.
      @return the maximum of the first and second values
   */
   public double getMaximum()
   {
      return Math.max(num1, num2);
   }

   /**
      Computes the minimum of the values of this pair.
      @return the minimum of the first and second values
   */
   public double getMinimum()
   {
      return Math.min(num1, num2);
   }

    /**
      Converts an angle measured in degrees to an equivalent angle measured in radians.
      @return the measurement of the angle angdeg in radians.
   */
   public double getRadians()
   {
      int deg1 = (int) Math.round(num1);
      int deg2 = (int) Math.round(num2);
	  return (float) Math.toRadians(deg1);
   }

   /**
      Computes the trigonometric secant of an angle.
      @return the trigonometric secant of the argument
   */
   public double getSecant()
   {
      double hyp = Math.sqrt(num1 * num1 + num2 * num2);
      return hyp / num1;
   }

   
}