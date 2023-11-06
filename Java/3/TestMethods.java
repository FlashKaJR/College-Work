
public class TestMethods
{
	/**
	 * 
	 * @param r
	 * @param h
	 * @return
	 */
	public static double sphereVolume(double r)
	{
		return (4.0/3.0)*Math.PI*Math.pow(r , 3);
	}
	/**
	 * 
	 * @param r
	 * @return
	 */
	public static double sphereSurface(double r)
	{
		return 4.0 * Math.PI * Math.pow(r , 2);
	}
	/**
	 * 
	 * @param r
	 * @param h
	 * @return
	 */
	public static double cylinderVolume(double r, double h)
	{
		return Math.PI * Math.pow(r , 2) * h;
	}
	/**
	 * 
	 * @param r
	 * @param h
	 * @return
	 */
	public static double cylinderSurface(double r, double h)
	{
		return 2.0 * Math.PI * r * (r + h);
	}
	/**
	 * 
	 * @param r
	 * @param h
	 * @return
	 */
	public static double coneVolume(double r, double h)
	{
		return (1.0 / 3.0) * Math.PI * Math.pow(r , 2) * h;
	}
	/**
	 * 
	 * @param r
	 * @param h
	 * @param l
	 * @return
	 */
	public static double coneSurface(double r, double h, double l)
	{
		return Math.PI * r * (l + r);
	}
}