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
public class Sphere {

    private double radius;
    private double surface; 
    private double volume;
    
   //constructors
    public Sphere() {
        this.setRadius(1);
    }
    
    public Sphere (double radius) {
        this.setRadius(radius);
    }
   
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.setSurface();
        this.setVolume();
    }

    private void setSurface() { 
        this.surface = Math.pow(this.radius,2) * Math.PI * 4;
    }

    private void setVolume() {
        this.volume = Math.PI * Math.pow(this.radius,3);
    }

    public double getSurface() {
        return surface;
    }
    public double getVolume() {
        return volume; 
    }

}
