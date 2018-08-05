package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	new Thread(()->{
        System.out.println("I am from Runnbale");
        System.out.println("I am fro checking purposes");
        System.out.format("I am  %d\n line",123);


    }).start();
	Employee employee1=new Employee("Mahammad", 12);
        Employee employee2=new Employee("Oktay", 17);
        Employee employee3=new Employee("Qurbani", 1234);
        Employee employee4=new Employee("Sevinc", 45);
        List<Employee> employees=new ArrayList<>();
        employees.add(employee4);
        employees.add(employee3);
        employees.add(employee2);
        employees.add(employee1);

//

 for(Employee employee:employees){
     System.out.println(employee.getName());
     new Thread(()->System.out.println(employee.getAge())).start();
 }
    }
    public final static String doStringStuff(UpperConcat uc, String s1, String s2){
        return uc.upperAndConcat(s1,s2);
    }
}
 class Employee{
    String name;
    int age;

     public Employee(String name, int age) {
         this.name = name;
         this.age = age;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }
 }
interface UpperConcat{
    public String upperAndConcat(String s1, String s2);
}
  class another {

      public String doSomethnig() {
//System.out.println("Another class name is "+getClass().getSimpleName());
//        return Main.doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                System.out.println("Anonimous class name is "+getClass().getSimpleName());
//                return s1.toUpperCase()+s2.toUpperCase();
//            }
//        },"String1","String2");
          UpperConcat uc = (s1, s2) -> {
              System.out.println("Lambda expressions class name is " + getClass().getSimpleName());
              String result = s1.toUpperCase() + s2.toUpperCase();
              return result;

          };
          System.out.println("Another classs name is " + getClass().getSimpleName());
          return Main.doStringStuff(uc, "sTRING1", "sTRING2");
      }
      public void printValue(){

          int number=25;
          Runnable r=()->{
            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("The Value is: "+number);
          };
      new Thread(r).start();
      }

  }
