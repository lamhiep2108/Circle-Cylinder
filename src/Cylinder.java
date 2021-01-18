public class Cylinder extends Circle{
  private  double height;
    public  Cylinder(){};
    public  Cylinder(double radius, String color, double height){
        super(radius,color);
        this.height=height;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {

        return super.getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height"+height+
                "Area=" + getArea() +
                '}';
    }

    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        Cylinder cylinder2=new Cylinder(10,"red",20);
        System.out.println(cylinder2);
    }
}
