class Circle{
    public int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    Circle(){
        System.out.println("I am non parameterized of circle");
    }
    Circle(int r){
        System.out.println("I am circle of parameterized constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    public int height ;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    Cylinder1(int r , int h){
        super(r);
        System.out.println("I am cylindrical parameterized constructor");
        this.height = h;
    }
    public double area (){
        return 2*Math.PI*radius*height;
    }
}
public class Inheritance_ques1 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Cylinder1 cyl = new Cylinder1(7,3);
        c.area();
        cyl.area();
        System.out.println(c.getRadius());
        System.out.println(c.area());
        System.out.println(cyl.getRadius());
        System.out.println(cyl.area());
    }
}
