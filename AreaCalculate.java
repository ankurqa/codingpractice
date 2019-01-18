//ipackage practice;
import java.util.*;
/**
 * @author Ankur Mangal
 * this class is for calculate the area of Triangle, Rectangle, Square, Circle
 */
public class AreaCalculate {
    
    private float circle(float radious) {
        return (3.14f * radious * radious);
    }
    private float triangle(float base, float altitude) {
        return (0.5f * base * altitude);
    }
    private float rectangle(float base, float altitude) {
        return (base * altitude);
    }
    private float square(float side) {
        return (side * side);
    }
    public static void main(String args[]) throws Exception{
     Scanner sc = new Scanner(System.in);  
     AreaCalculate ob = new AreaCalculate();
     System.out.println("For Circle press 1");
     System.out.println("For Triangle press 2");
     System.out.println("For Rectangle press 3");
     System.out.println("For square press 4");
     try {
     int choice  = sc.nextInt();
     if (choice == 1) {
         System.out.println("Please enter radious");
         float radious = sc.nextFloat();
         System.out.println(ob.circle(radious));
        } else if (choice == 2) {
         System.out.println("Please enter base");
         float base = sc.nextFloat();
         System.out.println("Please enter altitude");
         float altitude = sc.nextFloat();
         System.out.println(ob.triangle(base,altitude));
        } else if (choice == 3) {
         System.out.println("Please enter breadth");
         float breadth = sc.nextFloat();
         System.out.println("Please enter length");
         float length = sc.nextFloat();
         System.out.println(ob.rectangle(breadth,length));
        } else if (choice == 4) {
         System.out.println("Please enter side");
         float side = sc.nextFloat();
         System.out.println(ob.square(side));
        } else {
        System.out.println("Wrong Entry");
        }
     } catch (Exception e) {
         System.out.println("please give right entry");
     }
    }
}

