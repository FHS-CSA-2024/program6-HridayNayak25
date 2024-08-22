import java.util.Scanner;
public class Circle_1{
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        
        final double pi = 3.14159;
        double radius = 0.0;
       
        
        System.out.println("radius: ");
        radius = myScanner.nextDouble();
        
        double area = (pi*radius*radius);
        double diameter = (2.0*radius);
        double circumference = (2*pi*radius);
        
        System.out.println("Radius: " + radius);
        System.out.println("Diameter: " + diameter);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    
        
        
    }
}
