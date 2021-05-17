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
    //divder
    //LOOP BEFORE SUBMISSION & FIX 2 CIRCLE + SPHERE
    System.out.println("What shape would you like to create today? "
 + "Enter a number!");
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
        System.out.println("Choose the length...");
        int first1 = in.nextInt();
        System.out.println("Choose the width...");
        int second1 = in.nextInt();
        Rectangle r1 = new Rectangle(first1,second1); 
        System.out.println("The perimeter is "+r1.getPerimeter()+" "
    +   "while the area is "+r1.getArea());

    } else if (choice == 2) {
        System.out.println ("Choose the radius...");
        double second1 = in.nextDouble();
        Circle c1 = new Circle(second1);
        System.out.println("The area is "+c1.getArea()+" "
    +   "while the circumference is "+c1.getCircumference());
    
    } else if (choice == 3) {
        System.out.println ("Choose one of the sides...");
        int third1 = in.nextInt();
        System.out.println ("Choose another sides...");
        int third2 = in.nextInt();
        System.out.println ("Choose another side, ");
        int third3 = in.nextInt();
        System.out.println ("Choose the height...");
        int third4 = in.nextInt();
        Triangle t1= new Triangle(third1, third2, third3, third4);
        System.out.println("The perimeter is "+t1.getPerimeter()+" "
    +   "while the area is "+t1.getArea());
    
    } else if (choice == 4) {
        System.out.println ("Choose the radius...");
        double fourth1 = in.nextInt();
        Sphere s1 = new Sphere(fourth1);
        System.out.println("The surface area is "+RoundOff(s1.getSurface())+" "
    + "while the volume is "+s1.getVolume());
    
    } else if (choice == 5) {
        System.out.println ("Choose the length...");
        int fifth1 = in.nextInt(); 
        System.out.println ("Choose the width...");
        int fifth2 = in.nextInt(); 
        System.out.println ("Choose the height...");
        int fifth3 = in.nextInt(); 
        Rectangular rp2 = new Rectangular (fifth1, fifth2, fifth3);
        System.out.println("The surface area is "+rp2.getSurface()+" "
    + "while the volume is "+rp2.getVolume());       
        
    }
    in.close();

    }
    //roundoff
    static long RoundOff(double x) {
        return Math.round(x*100)/100;
    }
}

