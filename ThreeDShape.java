public abstract class ThreeDShape extends Shape
{
	public ThreeDShape(double pMass, double pVelo, double pAngle, 
			double pAccl, double pXPos, double pYPos)
	{super(pMass, pVelo, pAngle, pAccl, pXPos, pYPos);}
	
	public abstract double getSArea();
	public abstract double getVolume();
	public abstract double getDensity();
	
}
