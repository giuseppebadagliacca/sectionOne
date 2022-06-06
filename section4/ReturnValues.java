public class ReturnValues {
  public static void main(String[] args) {
    // function call in MAIN that is saved to variable called measure
    double measure1 = areaOfRectangle(-2.2, 4.3, "area");
    double measure2 = areaOfRectangle(3.2, 4.1,"perimeter");

    System.out.println(measure1);
    System.out.println(measure2);
  }
  // function decleration in public class NAME
  public static double areaOfRectangle(double length, double width, String option){
    if(length <0 || width < 0){
      System.out.println("Cant be a negative");
      // this shuts program down
      System.exit(0);
    }
    switch(option){
      case "area":
      return length*width;
      case "perimeter":
      return 2*(length*width);
      default: return 404; 

    }
  }
  
}
