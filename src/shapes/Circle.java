/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shapes;

/**
 *
 * @author saer1
 */
public class Circle {

    private double radius;
    private double area; 
    private double circumference;
    
   //constructors
    public Circle() {
        this.setRadius(1);
    }
    
    public Circle (double radius) {
        this.setRadius(radius);
    }
   
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.setArea();
        this.setCircumference();
    }

    private void setArea() { 
        this.area = Math.pow(this.radius,2) * Math.PI;
    }

    private void setCircumference() {
        this.circumference = this.radius * 2 * Math.PI;
    }

    public double getArea() {
        return area;
    } 
    public double getCircumference() {
        return circumference; 
    }
}

