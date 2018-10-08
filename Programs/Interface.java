/*
Author : Tejas Ashok Shinde
Date : 18th Aug 2018
Place : SICSR, Pune
*/

import java.io.*;
import java.util.Random;

public class Interface{
  public static void main (String args[]){
  Shape sArr[] = new Shape[5];
  Random random = new Random();
  Color cArr[] = Color.values();

  for (int i = 0; i < sArr.length ; i ++){
      int num = random.nextInt(3);

        switch (num) {
          case 0:
            // Color col : arr[num]
            sArr[i] = new Circle();
            break;
          case 1:
            sArr[i] = new Rectangle();
            break;
          case 2:
            sArr[i] = new Triangle();
            break;
        }
      }
      for (int i = 0; i < sArr.length;i++){
        sArr[i].draw();
      }
    }
  }

    public interface Shape{
        // public static final int RED = 1; //Variables in an interface are public static and final by default
        void draw(int color);
        enum Color{
          RED = 1,BLUE = 2,GREEN = 3;
        }
  }
    public class Circle implements Shape{
      private int radius;
      //Constructor will be made to initiate radius
      public Circle(){
          radius = 4;
      }
      @Override
      public void draw(int color){
        System.out.println("Circle is drawn with" + color);
      }
    }

    public class Rectangle implements Shape{
      private int length;
      private int breadth;

      public Rectangle(int color){
        // No need for 'this' keyword as it is set as default
        length = 8;
        breadth = 4;
      }
      @Override
      public void draw(int color){
        System.out.println("Rectangle is drawn with" + color);
      }
    }

    public class Triangle implements Shape{
      private int base;
      private int height;

      public Triangle(){
        base = 4;
        height = 8;
      }
      @Override
      public void draw(int color){
        System.out.println("Triangle is drawn with" + color);
      }
    }
