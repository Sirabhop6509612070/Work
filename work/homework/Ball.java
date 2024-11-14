//สิรภพ สมเชย
//6509612070
package homework;

public class Ball {
	 private double radius;
	    public void setRadius(double aRadius){
	        radius=aRadius;
	    }
	    public double getRadius(){
	    	return radius;
	    	}
	    public double getSurface(){
	    	return 4*Math.PI*Math.pow(radius,2);
	    	}
	    public double getVolume(){
	    	return (4.0/3.0)*Math.pow(radius,3)*Math.PI;
	    	}
}
