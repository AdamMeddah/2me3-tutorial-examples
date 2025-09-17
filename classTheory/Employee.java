package classTheory;

import java.time.*;

/**
 * This program tests the Employee class.
 * @version 1.13 2018-04-10
 * @author Cay Horstmann
 */

class Employee {
   private String name;
   private double salary;
   private LocalDate hireDay;
   private int hours;

   public Employee(String n, double s, int year, int month, int day, int hours)
   {
      name = n;
      salary = s;
      hireDay = LocalDate.of(year, month, day);
      hours = this.hours;
   }

   public String getName()
   {
      return name;
   }

   public double getSalary()
   {
      return salary;
   }

   public int getHours(){
      return hours;
   }
   public LocalDate getHireDay()
   {
      return hireDay;
   }

   public void raiseSalary(double byPercent)
   {
      double raise = salary * byPercent / 100;
      salary += raise;
   }

   // Add a method to the Employee class (what method you think an employee would need?), and show to TA for this week's tutorial mark

}