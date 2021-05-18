/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.util.Scanner;
/**
 *
 * @author k_zeb
 */
public class Main {
    public static void main(String[] args){
    Scanner in  = new Scanner(System.in);
    int choice;
    int i = 0;
    //start
    while (i < 10) {
    System.out.println("What shape would you like to create today? "
    + "Please enter a number!");
    //menu
    System.out.println("===== M E N U ====="); //divider & title
    System.out.println("1. Rectangle");
    System.out.println("2. Circle");
    System.out.println("3. Triangle");
    System.out.println("4. Sphere");
    System.out.println("5. Rectangular Prism");
    System.out.println("6. Rectangular Pyramid");
    System.out.println("7. Cone");
    choice = in.nextInt(); 
    //divider
    if (choice == 1) {
        //Rectangle
        System.out.println("Choose the length...");
        int first1 = in.nextInt();
        System.out.println("Choose the width...");
        int second1 = in.nextInt();
        Rectangle r1 = new Rectangle(first1,second1); 
        System.out.println("The perimeter is "+r1.getPerimeter()+" "
    +   "while the area is "+r1.getArea());

    } else if (choice == 2) {
        System.out.println("Choose the radius...");
        double second1 = in.nextDouble();
        Circle c1 = new Circle(second1);
        System.out.println("The circumference is "+RoundOff(c1.getCircumference())+" "
    +   "while the area is "+RoundOff(c1.getArea()));
    
    } else if (choice == 3) {
        //Triangle
        System.out.println("Choose one of the sides...");
        int third1 = in.nextInt();
        System.out.println("Choose another sides...");
        int third2 = in.nextInt();
        System.out.println("Choose one more side...");
        int third3 = in.nextInt();
        System.out.println("Choose the height...");
        int third4 = in.nextInt();
        Triangle t1= new Triangle(third1, third2, third3, third4);
        System.out.println("The perimeter is "+t1.getPerimeter()+" "
    +   "while the area is "+t1.getArea());
    
    } else if (choice == 4) {
        //Sphere
        System.out.println("Choose the radius...");
        double fourth1 = in.nextDouble();
        Sphere s1 = new Sphere(fourth1);
        System.out.println("The volume is "+RoundOff(s1.getVolume())+" "
      + "while the surface area is "+RoundOff(s1.getSurface()));              
    
    } else if (choice == 5) {
        //Rectangular Prism
        System.out.println("Choose the length...");
        int fifth1 = in.nextInt(); 
        System.out.println("Choose the width...");
        int fifth2 = in.nextInt(); 
        System.out.println("Choose the height...");
        int fifth3 = in.nextInt(); 
        Prism p1 = new Prism (fifth1, fifth2, fifth3);
        System.out.println("The volume is "+p1.getVolume()+" "
      + "while the surface area is "+p1.getSurface());
                   
    } else if (choice == 6) {
        //Rectangular Pyramid
        System.out.println("Choose the length");
        int sixth1 = in.nextInt();
        System.out.println("Choose the width...");
        int sixth2 = in.nextInt(); 
        System.out.println("Choose the height...");
        int sixth3 = in.nextInt(); 
        Pyramid p2 = new Pyramid (sixth1, sixth2, sixth3);
        System.out.println("The volume is "+RoundOff(p2.getVolume())+" "
      + "while the surface area is "+RoundOff(p2.getSurface()));
                
    } else if (choice == 7) {
        //Cone
        System.out.println("Choose the radius...");
        double seventh1 = in.nextDouble();
        System.out.println("Choose the height...");
        double seventh2 = in.nextDouble();
        Cone c2 = new Cone (seventh1, seventh2); 
        System.out.println("The volume is "+RoundOff(c2.getVolume())+" "
      + "while the the surface area is "+RoundOff(c2.getSurface())); 
    } //else if bracket

    } // while loop bracket
    
    in.close();
    
    } // public static void bracket
    static long RoundOff(double x) {
        return Math.round(x*100)/100;
    }
} //main bracket

