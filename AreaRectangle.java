package com.company;

import java.util.Scanner;

public class AreaRectangle {

 String area= "";

 AreaRectangle(double length,double breadth)
 {
     area=String.format("%.3f", (length*breadth));
 }
    String printArea() 
    {
        return this.area;
    }

    public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter  length and breadth of rectangle :");
      double length = sc.nextDouble();
      double breadth=sc.nextDouble();
      AreaRectangle ob = new AreaRectangle(length,breadth);
      String area = "";
      area=ob.printArea();

      System.out.println("Area of rectangle = "+area);


    }


}
