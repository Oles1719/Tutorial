package Soft;

/**
 * Created by Oles on 1/24/2015.
 */
public class Circle extends Shape {
    private double radius;
    public Circle(double x1,double y1,double x2,double y2){
        setRadius(x1, y1, x2, y2);
    
    }
    public void setRadius(double x1,double y1,double x2,double y2){
        if((x1-x2)==0){
            this.radius = Math.abs(y1-y2);
        }
       else if((y1-y2)==0){
            this.radius = Math.abs(x1-x2);
        }
        else {
            this.radius = Math.sqrt(Math.abs((x1 - x2)*(x1-x2))+Math.abs((y1-y2)*(y1-y2)));
        }
        int b =5;
    }
    public double square() {
        return Math.pow(radius,2)*Math.PI;
    }
}
