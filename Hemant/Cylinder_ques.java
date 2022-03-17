class Cylinder{
    private int radius ;
    private  int height;
public Cylinder(int height, int radius){
    this.radius = radius ;
    this. height = height;
}

    public void setheight(int height) {
        this.height = height;
    }
    public int getheight(){
        return height;
    }  public void setradius(int radius) {
        this.radius = radius;
    }
    public int getradius(){
        return radius;
    }
    public double surfaceArea(){
        return 2*3.14*radius*(height+radius);
    } public double Volume(){
        return 3.14*radius*radius*height;
    }

}
class Rectangle{
    private int lenght ;
     private int breadth ;
public Rectangle(){
    this.lenght = 6;
    this.breadth = 7;
}
public Rectangle(int lenght, int breadth){
    this.lenght = lenght;
    this.breadth = breadth;
}
    public int getBreadth() {
        return breadth;
    } public int getlength() {
        return lenght;
    }

}

public class Cylinder_ques {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(5 , 2);
      // cyl.setheight(5);
        System.out.println(cyl.getheight());
      //  cyl.setradius(2);
        System.out.println(cyl.getradius());
        System.out.println(cyl.surfaceArea());
        System.out.println(cyl.Volume());
        Rectangle r = new Rectangle();
        System.out.println(r.getlength());
        System.out.println(r.getBreadth());
    }
}

