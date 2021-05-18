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
public class Cone {
 
    private double radius;
    private double height;
    private double surface; 
    private double volume; 
    
    //constructors
    public Cone () {
        this.setRadius(1);
        this.setHeight(1);
    }
    
    public Cone (double side) {
        this.setRadius(side);
        this.setHeight(side);
    }
    
    public Cone (double radius, double height) {
        this.setRadius(radius);
        this.setHeight(height);
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.setSurface();
        this.setVolume();
    }

    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
        this.setSurface();
        this.setVolume();
    }

    private void setSurface() { 
        this.surface = Math.PI * this.radius * (this.radius + (Math.sqrt(Math.pow(this.height, 2) 
        + Math.pow(this.radius,2))));     
    }

    private void setVolume() {
        this.volume = (Math.PI * Math.pow(this.radius, 2) * this.height / 3); 
    }

    public double getSurface() {
        return surface;
    }
    public double getVolume() {
        return volume; 
    }
       
}
   