package Point2D;

import java.util.Scanner;

public class Point2D {

private double x ;
private double y;
public static Point2D origin = new Point2D();
public Point2D(double x, double y) {
	
	this.x =x;
	this.y = y;
}
public Point2D()
{this.x=0;
this.y=0;
	}


public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}

public  double imgOx() {
	double Ox=x;
	return Ox ;
}
public  double imgOy() {
	double Oy=y;
	return Oy;
}

}



