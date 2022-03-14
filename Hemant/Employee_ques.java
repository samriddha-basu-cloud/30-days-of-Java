class Employe{

    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
}
public class Employee_ques  {
    public static void main(String[] args) {
        Employe Hemant = new Employe();
        Hemant.salary = 100000;
        Hemant.setname( "Garg");
        System.out.println(Hemant.getname());
        System.out.println(Hemant.getSalary());
    }
}
