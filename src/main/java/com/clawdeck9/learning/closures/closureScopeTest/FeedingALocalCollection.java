package com.clawdeck9.learning.closures.closureScopeTest;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

//  see the closure mm
public class FeedingALocalCollection {
	java.util.List<Person> plist;
	
//	populates the list 
	public void createList() {
		final long age = 20;
		plist = new ArrayList<Person>();
		Stream.of("John", "Frank", "Pete", "Cathy").forEach(name -> plist.add(new Person(name, age)));
	}
	
//	receives a closure (here a func that consumes Person instances) and exec it on the current list
//	or the instance directly with 'accept'
	public void useConsumerClosure(Consumer<Person> cons) {
		if (plist == null)	createList();
		plist.forEach(cons);
		cons.accept(plist.get(1));
	}
	
//	receives a closure that supplies a Person instance and uses this Person  inst
	public void useSupplierClosure(Supplier<Person> supp) {
		if (plist == null) createList();
		for(int i = 0; i < 5; i++) plist.add(supp.get());
		useConsumerClosure(p -> System.out.println("supplier closure :: name: " 
				+ p.getName() + " age: " + p.getAge()));
	}

}
