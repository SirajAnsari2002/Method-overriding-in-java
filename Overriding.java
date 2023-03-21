import java.lang.*;
class Parent{
   void method1(){
   System.out.println("METHOD OF PARENT CLASS");
   }
   }
class Child extends Parent{
void method1(){
 System.out.println("METHOD OF CHILD CLASS");
 }
 }
 public class Overriding{
 public static void main(String args[])
 {
   Child obj = new Child();
   obj.method1();
   }
