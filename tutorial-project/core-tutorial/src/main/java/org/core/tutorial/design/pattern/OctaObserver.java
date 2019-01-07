package org.core.tutorial.design.pattern;

public class OctaObserver extends Observer{
	
	public OctaObserver(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Octa String:: "+Integer.toOctalString(subject.getState()));
	}
	
}
