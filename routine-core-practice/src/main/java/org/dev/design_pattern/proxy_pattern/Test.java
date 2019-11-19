package org.dev.design_pattern.proxy_pattern;

public class Test {
	public static void main(String[] args) {
		Image image=new ProxyImage("dev007.jpg");
		image.display();
		
		image.display();
	}
}
