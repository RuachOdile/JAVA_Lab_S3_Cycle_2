import java.util.Scanner;

public class MultiArea {

    void Area(double length,double breadth)
    {
    String area=String.format("%.3f", (length*breadth));
    System.out.println("Area of Rectange Is "+area+" sq.units");
    }

    void Area(double radius)
    {

     double pi = 3.1415;
     String area= String.format("%.3f", (pi*Math.pow(radius, 2)));
     System.out.println("Area of Circle is "+area+" sq.units");
    }

    public static void main(String[] args) 
    {
     Scanner sc = new Scanner(System.in);

     double radius,length,breadth;

      System.out.println("Enter radius of circle :");
      radius =sc.nextDouble();
      MultiArea circle = new MultiArea();
      circle.Area(radius);


        System.out.println("Enter  length and beadth of rectangle :");
        length = sc.nextDouble();
        breadth=sc.nextDouble();
        MultiArea rectangle = new MultiArea();
        rectangle.Area(length, breadth);


    }


}