
public class RectPrism extends ThreeDShape
{
	double height;
	double width;
	double depth;
	public RectPrism(double pMass, double pVelo, double pAngle, double pAccl, 
			double pXPos, double pYPos,double height, double width, double depth)
	{
		super(pMass, pVelo, pAngle, pAccl, pXPos, pYPos);
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
}
