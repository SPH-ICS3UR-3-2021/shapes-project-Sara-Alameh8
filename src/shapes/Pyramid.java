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
public class Pyramid {
    
    private double length;
    private double width; 
    private double height;
    private double surface;
    private double volume; 
    
    //constructors
    public Pyramid () {
        this.setLength(1);
        this.setWidth(1);
        this.setHeight(1);
    }
    
    public Pyramid (double side) {
        this.setLength(side);
        this.setWidth(side);
        this.setHeight(side);
    }
    
    public Pyramid (double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }
    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
        this.setSurface();
        this.setVolume();
    }

    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
        this.setSurface();
        this.setVolume();
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight (double height) {
        this.height = height;
        this.setSurface(); 
        this.setVolume(); 
    }

    private void setSurface() { 
        this.surface = ((this.length * width) + (this.length * Math.sqrt(Math.pow(this.width / 2, 2) +
        Math.pow(this.height, 2))) + (width * Math.sqrt(Math.pow(this.length / 2, 2)
      + Math.pow(this.height, 2))));
         
    }

    private void setVolume() {
        this.volume = (int)(this.width * this.height * this.length / 3); 
    }

    public double getSurface() {
        return surface;
    }
    public double getVolume() {
        return volume; 
    }

}

    
    
