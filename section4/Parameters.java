public class Parameters {
  public static void main(String[] args) {
    // function call in MAIN
    areaOfRectangle(2.2, 4.3);
  }
  // function decleration in public class NAME
  public static void areaOfRectangle(double length, double width){
    double area = length * width;
    System.out.println("\nThe area of the rectange with a \nlength of "+length+" \nand a\nwidth of "+width+"\nis " + area + "\n");
  }
}
