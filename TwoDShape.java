public abstract class TwoDShape extends Shape
{
	public TwoDShape(double pMass, double pVelo, double pAngle, 
			double pAccl, double pXPos, double pYPos)
	{super(pMass, pVelo, pAngle, pAccl, pXPos, pYPos);}
	
	public abstract double getPerimeter();
	public abstract double getArea();

}
