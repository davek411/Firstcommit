package Learningexceptions;
import java.io.*;
import java.lang.System;

public class ExceptionHandlingrunner2 {
  public static void main(String[] args) {
    getLength();
    System.out.println("Main ended");

  }

  private static void getLength() {
    getLength2();
    System.out.println("Method1 ended");

  }

  private static void getLength2() {
    try {
      String str = null;
      System.out.println("Method2 ended");

     // str.length();
      int [] i ={1,2};
      int number = i[3];
//      System.out.println("Method2 ended");

    } catch (Exception ex) {
      System.out.println("Matched Exception");
     //ex.printStackTrace();


    }
  }
}
