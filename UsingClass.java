import javax.swing.*;

public class UsingClass{
        public static void main(String args[]){
            //creating a object of Student class
            Employee emp1=new Employee(100.00);
            emp1.increaseSalary();
            String name=emp1.getName();
            double salary=emp1.getSalary();
            int id =emp1.getId();
             System.out.print("Emp Id: "+id+ ": "+name+"  "+"Salary :"+salary);
        }
}

class Employee{
    private String name="";
    private double salary;
    private int id;
    private static int nextID =1;
   
    public Employee(String name, double salary){
      id= nextID;
      nextID++;
      this.name = name;
      this.salary = salary;
      }
    public Employee(double s){
      this("Employee:" + nextID, s);
      this.id = nextID;
      nextID++;    
   }

   public String getName(){
       return name ;
   }
    public double getSalary(){
       return salary;
   }
   public int getId(){
       return id;
   }
    public void increaseSalary(){
     salary=salary*1.10;
   }

}