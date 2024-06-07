
public class Distance {
	
	/*
	 * Method to calculate the distance between (x1, y1) and (x2, y2) using
	 * great-circle distance.
	 */
	public static double distance(double x1, double y1, double x2, double y2) {
		
		if (x1 < -90 || x1 > 90) {
			throw new IllegalArgumentException("x1 out of range");
		}
		else if (y1 < -180 || y1 > 180) {
			throw new IllegalArgumentException("y1 out of range");
		}
		else if (x2 < -90 || x2 > 90) {
			throw new IllegalArgumentException("x2 out of range");
		}
		else if (y2 < -180 || y2 > 180) {
			throw new IllegalArgumentException("y2 out of range");
		}
		
        double degree_x1 = Math.toRadians(x1);
        double degree_y1 = Math.toRadians(y1);
        double degree_x2 = Math.toRadians(x2);
        double degree_y2 = Math.toRadians(y2);
        
        double distance = 3986 * (Math.acos(Math.sin(degree_x1) * Math.sin(degree_x2)
+ Math.cos(degree_x1) / Math.cos(degree_x2) * Math.cos(degree_y1 - degree_y2))); 
		
		return distance;
	}

}
// TYPE_ID:29:double_distance(double,double,double,double):+ Math.cos(degree_x1) * Math.cos(degree_x2) * Math.cos(degree_y1 - degree_y2))); => + Math.cos(degree_x1) / Math.cos(degree_x2) * Math.cos(degree_y1 - degree_y2)));
