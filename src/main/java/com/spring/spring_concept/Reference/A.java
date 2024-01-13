package com.spring.spring_concept.Reference;

public class A {

     private int x;
     private B obj;
     public int getx(){
         return x;
     }
     public void setx(int x){
         this.x = x;
     }
     public B getobj(){
         return obj;
     }
     public void setobj(B obj){
         this.obj = obj;
     }
     public A(){
         super();
     }

     public String toString(){
         return "A [ x-> " +x+ "obj ->" +obj+ "]";
     }

}
