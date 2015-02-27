package Soft;

import Soft.Shape;

/**
 * Created by Oles on 1/24/2015.
 */
public class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double x1,double y1,double x2,double y2) {
        setAttributes(x1,y1,x2,y2);
    }
    public void setAttributes(double x1,double y1,double x2,double y2){
        this.length =Math.abs(x1-x2);
        this.width = Math.abs(y1-y2);
    }
    @Override
    public double square() {
        return this.width*this.length;
    }
}
