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
public class Rectangular {

    private int length;
    private int width; 
    private int height;
    private int surface; 
    private int volume; 
    
    //constructors
    public Rectangular () {
        this.setLength(1);
        this.setWidth(1);
        this.setHeight(1);
    }
    
    public Rectangular (int side) {
        this.setLength(side);
        this.setWidth(side);
        this.setHeight(side);
    }
    
    public Rectangular (int length, int width, int height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }
    
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
        this.setSurface();
        this.setVolume();
    }

    public int getWidth() {
        return width;
    }
    
    public void setWidth(int width) {
        this.width = width;
        this.setSurface();
        this.setVolume();
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight (int height) {
        this.height = height;
        this.setSurface(); 
        this.setVolume(); 
    }

    private void setSurface() { 
        this.surface = 2*(this.width * this.length + this.height * this.length + this.height * this.width);
    }

    private void setVolume() {
        this.volume = this.width * this.height * this.length; 
    }

    public int getSurface() {
        return surface;
    }
    public int getVolume() {
        return volume; 
    }

}
