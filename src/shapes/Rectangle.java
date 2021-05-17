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
public class Rectangle {

    private int length;
    private int width; 
    private int area; 
    private int perimeter; 
    
    //constructors
    public Rectangle() {
        this.setLength(1);
        this.setWidth(1);
    }
    
    public Rectangle (int side) {
        this.setLength(side);
        this.setWidth(side);
    }
    
    public Rectangle (int length, int width) {
        this.setLength(length);
        this.setWidth(width);
    }
    

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
        this.setArea();
        this.setPerimeter();
    }

    public int getWidth() {
        return width;
    }
    
    public void setWidth(int width) {
        this.width = width;
        this.setArea();
        this.setPerimeter();
    }

    private void setArea() { 
        this.area = this.width*this.length;
    }

    private void setPerimeter() {
        this.perimeter = this.width * 2 + this.length * 2;
    }

    public int getArea() {
        return area;
    }
    public int getPerimeter() {
        return perimeter; 
    }
}
