class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 54;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}

public class Constructors {

    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee("This is Hemant Garg", 98);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
