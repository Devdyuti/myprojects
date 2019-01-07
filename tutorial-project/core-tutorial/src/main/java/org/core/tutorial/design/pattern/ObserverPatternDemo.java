package org.core.tutorial.design.pattern;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		Subject subject=new Subject();
		
		//new HexaObserver(subject);
		//new OctaObserver(subject);
		new BinaryObserver(subject);
		
		
		System.out.println("First state changes");
		subject.setState(15);
		System.out.println("Second state changes");
		subject.setState(10);
	}

}
