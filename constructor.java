
// import java.io.*;


 class Employee {

   String name;
   int age;
   String Depart;
   double salary;
   double bonus;
   Boolean resident;

   // This is the constructor of the class Employee
   public Employee(){
      System.out.println("intializing constructor");
      name = "Alwa";
      age = 20;
      Depart = "Not Assignet yet";
      salary = 10000;
      bonus = 500;
      resident = true;
   }
   public Employee(String name ,int age){
      this.name = name ;
      this.age = age;
   }
   public Employee(String n ,int a,boolean resident){
      this(n,a); //reuse the above constructor
      this.resident = resident;
   }
   public Employee(String name, int age, String Depart, double salary, double bonus, boolean resident) {
      this(name,age,resident);//reuse the above constructor
      this.Depart = Depart;
      this.salary = salary;
      this.bonus = bonus;
   }

   public void setname (String name) {
      this.name = name;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }
   public void setSalary(double salary,double bonus) {
      this.setSalary(salary); // reuse the above method
      this.bonus = bonus;
   }

   /* Print the Employee details */
   //Escape characters (\n)
   public void printEmployee() {
      System.out.println("Name:"+ name +"\n Age:" + age +"\n Department:"+Depart+ "\n Salary:" + salary+ "\n bouns:" + bonus+ "\n resident:" + resident);
   }
}


public class constructor {
                           
   public static void main(String args[]) {
      /* instantiate an Employee object */
      // Employee emp = new Employee();
      // emp.printEmployee();

      Employee emp1 = new Employee();
      emp1.printEmployee(); //intial constructor هيطلع ال
      emp1.setAge(23);
      emp1.setSalary(22000);
   }
   
}



