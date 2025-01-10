package com.clone;

public interface Printable {
	 int a=0;
     
     void print();
     
     public abstract double area();
     
     static void demoPrint() {
    	 System.out.println("DemoPrint Method From Interface");
     }
     
     default void print11() {
    	 System.out.println("Print Method From Interface");
     }
}
