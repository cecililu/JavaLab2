import javax.swing.*;

public class Employee_app{
        public static void main(String args[]){
            //creating a object of Emloyee class
            Employee emp1=new Employee("John",100.00);
            emp1.increaseSalary();
            String name=emp1.getName();
            double salary=emp1.getSalary();
            int id =emp1.getId();
             System.out.println("Emp Id: "+id+ ": "+name+"  "+"Salary :"+salary);
             //another object
             Employee emp2=new Employee(200);
            emp2.increaseSalary();
            // String name=emp2.getName();
            // double salary=emp2.getSalary();
            // int id =emp2.getId();
             System.out.println("Emp Id: "+emp2.getId()+" :"+emp2.getName()+" Salary:"+emp2.getSalary());
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
    //   id = nextID;
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