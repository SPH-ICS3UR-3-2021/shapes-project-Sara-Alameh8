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
public class Triangle {

    private int apple;
    private int banana; 
    private int cantaloup;
    private int height;
    private int area; 
    private int perimeter; 
    
    //constructors
    public Triangle() {
        this.setApple(1);
        this.setBanana(1);
        this.setCantaloup(1);
        this.setHeight(1);
    }
    
    public Triangle (int side) {
        this.setApple(side);
        this.setBanana(side);
        this.setCantaloup(side);
        this.setHeight(side);
    }
    
    public Triangle (int apple, int banana, int cantaloup, int height) {
        this.setApple(apple);
        this.setBanana(banana);
        this.setCantaloup(cantaloup);
        this.setHeight(height);
    }
    
    public int getApple() {
        return apple;
    }

    public void setApple(int Apple) {
        this.apple = apple;
        this.setPerimeter();
    }

    public int getBanana() {
        return banana;
    }
    
    public void setBanana(int banana) {
        this.banana = banana;
        this.setArea();
        this.setPerimeter();
    }

    public int getCantaloup() {
        return cantaloup;
    }
    
    public void setCantaloup(int cantaloup) {
        this.cantaloup = cantaloup; 
        this.setPerimeter();
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
        this.setArea();
        this.setPerimeter();
    }
    
    private void setArea() { 
        this.area = this.banana * this.height / 2;
    }

    private void setPerimeter() {
        this.perimeter = this.apple + this.banana + this.cantaloup;
    }

    public int getArea() {
        return area;
    }
    public int getPerimeter() {
        return perimeter; 
    }


}
