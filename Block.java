public class Rectangle extends Shape
{
	double height;
	double width;

	public Rectangle(double height, double width )//TODO find out what to do with parameters from shape
	{
		super();
		this.height=height;
		this.width=width;
	}
	public getPerimeter()
	{
		return width*2+height*2;
	}
	public getArea()
	{
		return width*height;
	}
}