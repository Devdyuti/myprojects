package org.dev.design_pattern.proxy_pattern;

public class RealImage implements Image {
	
	private String filename;
	
	public RealImage(String filename) {
		this.filename=filename;
		loadFromDisk(filename);
	}
		
	@Override
	public void display() {
		System.out.println("Displaying from RealImage class: "+filename);
	}
	private void loadFromDisk(String filename){
		System.out.println("Loading from RealImage class:: "+filename);
	}

}
