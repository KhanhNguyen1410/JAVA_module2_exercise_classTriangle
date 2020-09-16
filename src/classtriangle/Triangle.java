package classtriangle;

public class Triangle extends Shape{
    private double x = 1.0;
    private double y = 1.0;
    private double z = 1.0;

    public Triangle(){

    }
    public Triangle(double x , double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Triangle(String color, boolean filled,double x , double y, double z ){
        super(color, filled);
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void setArea(double x , double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void setPerimeter(double x , double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getArea(){
        double p = (x + y + z)/2;
        double s = Math.sqrt(p*(p-x)*(p-y)*(p-z));
        return s;
    }
    public double getPerimeter(){
        return x + y+ z;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}'+ ", has area = "+
                getArea() + ", has perimeter = "+
                getPerimeter();
    }
}
