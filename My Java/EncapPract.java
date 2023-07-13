class Area {

  // fields to calculate area
  int length;
  int breadth;

  // constructor to initialize values
  Area(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  // method to calculate area
//   public void getArea() {
  public void Area() {
    int area = length * breadth;
    System.out.println("Area: " + area);
  }
}
public class EncapPract {
    public static void main(String[] args) {
        Area rectangle = new Area(5, 6);
    rectangle.Area();
    }
}
