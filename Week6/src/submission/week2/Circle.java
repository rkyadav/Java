package submission.week2;

public class Circle {
	public String method(int diameter) {
		double r = diameter/2.0;
		int circumference =(int) (2*Math.PI*r);
		double area=r*r*Math.PI;
		
		return "r="+r+"c="+circumference+"a="+area; 
	}


}
