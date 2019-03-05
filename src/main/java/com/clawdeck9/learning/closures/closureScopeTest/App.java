package com.clawdeck9.learning.closures.closureScopeTest;


/**
 * Suppliers and Consumers
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "closureScopeTest" );
        
        FeedingALocalCollection flc = new FeedingALocalCollection();

//        with this method, we can create the function on the fly
//        flc.useConsumerClosure(p -> System.out.println("name: " + p.getName()));
//        flc.useConsumerClosure(p -> System.out.println("name: " + p.getAge()));
        
//        same here: we create a supplier of Person instances with a random age (each get() changes the age)
        flc.useSupplierClosure(() -> new Person("Suply", (int)(Math.random()*45)+12));
    }
}
