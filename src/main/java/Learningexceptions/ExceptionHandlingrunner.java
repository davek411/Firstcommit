package Learningexceptions;

public class ExceptionHandlingrunner {
  public static void main(String[] args) {
     getLength();

  }

  private static void getLength() {
    getLength2();
  }

  private static void getLength2()
  {
    String str = null;
    str.length();
  }
}
