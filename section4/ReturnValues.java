public class ReturnValues {
  public static void main(String[] args) {
    // function call in MAIN that is saved to variable called measure
    double measure = areaOfRectangle(2.2, 4.3);
    // prined to the terminal
    System.out.println(measure);
  }
  // function decleration in public class NAME
  public static double areaOfRectangle(double length, double width){
    double area = length * width;
    return area;
  }
  
}
