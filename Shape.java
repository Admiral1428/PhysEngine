public abstract class Shape
{
   private double mass;  //Defines the mass of the shape in kilograms
   private double velo;  //Defines the velocity of the shape in meters per second
   private double angle; //Defines the angle of the vector in RADIANS
   private double accl;  //Defiens the acceleration of the shape in meters per second sqaured
   private double xPos;  //Defines the X-Coordinate of the shape at its Center (by pixel)
   private double yPos;  //Defines the Y-Coordinate of the shape at its Center (by pixel)
   
   public Shape()
   {
	   mass = velo = angle = accl = xPos = yPos= 0;
   }

   public Shape (double pMass, double pVelo, double pAngle, double pAccl, double pXPos, double pYPos)
   {
	  mass = pMass;
	  velo = pVelo;
	  angle = pAngle;
	  accl = pAccl;
	  xPos = pXPos;
	  yPos = pYPos;
   }


   public double getMass()
   {
      return mass;
   }

   public double getVelocity()
   {
      return velo;
   }

   public double getAngle()
   {
      return angle;
   }

   public double getAngle(double xVelo, double yVelo)
   {
      return Math.tan(yVelo/xVelo);
   }

   public double getAcceleration()
   {
      return accl;
   }

   public double getXPosition()
   {
      return xPos;
   }

   public double getYPosition()
   {
      return yPos;
   }

   public double getMomentum(double pMass, double pVelo)
   {
	  return (pMass * pVelo);
   }

   public double getYVelo(double pVelo, double pAngle)
   {
	  return (pVelo * Math.sin(pAngle));
   }

   public double getXVelo(double pVelo, double pAngle)
   {
	  return (pVelo * Math.cos(pAngle));
   }
}