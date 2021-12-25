//System.out.print() inside of constructor are just there to debug do not copy that shit lol;
//nextId=10 has no effect as in the next line static block initialization overwrites it

public class WaysOfValueassign{
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
            //another object 
             Employee emp3=new Employee();
             System.out.println("Emp Id: "+emp3.getId()+" :"+emp3.getName()+" Salary:"+emp3.getSalary());
             


        }
}

class Employee{
    private String name="Unknown";
    private double salary=20;
    private int id;
    private static int nextID=10;
   static{
        nextID=1;
   }
   {
       name="Sudin Adi";
    //    salary=434.5;
   }
   //default constructor
    public Employee(){
        //  this(name, salary);
         id= nextID;
        System.out.println("from 1st constutor"+id);
         nextID++;

    }
    public Employee(String name, double salary){
          System.out.println("from 2st constutor"+id);
      id= nextID;
      nextID++;
      this.name = name;
      this.salary = salary;
      }
    public Employee(double s){
          
      
      this("Employee:" + nextID, s);
     System.out.println("from 3st constutor"+id);
    //   id = nextID;
    //   nextID++;  
     
  
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