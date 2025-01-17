package Learningexceptions;

import java.util.Scanner;
public class FinallyRunner {

  public static void main(String[] args) {
    Scanner scanner = null;
    try {
      scanner = new Scanner(System.in);
      int[] numbers = {12, 3, 4, 5};
      int number = numbers[5];
    } catch (Exception e) {
      System.exit(1);
      e.printStackTrace();
    } finally {
      System.out.println("Before Scanner Close");
      if (scanner != null) {
        scanner.close();
      }
      System.out.println("Just before closing");
    }
  }
}
