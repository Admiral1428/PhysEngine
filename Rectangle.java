public class Rectangle extends Shape
{
	double height;
	double width;

	public Rectangle(double pMass, double pVelo, double pAngle, double pAccl, 
			double pXPos, double pYPos,double height, double width )
	{
		super(pMass, pVelo, pAngle, pAccl, pXPos, pYPos);
		this.height=height;
		this.width=width;
	}
	public double getPerimeter()
	{
		return width*2+height*2;
	}
	public double getArea()
	{
		return width*height;
	}
}