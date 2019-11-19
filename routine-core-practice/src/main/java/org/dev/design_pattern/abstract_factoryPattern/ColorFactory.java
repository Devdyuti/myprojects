package org.dev.design_pattern.abstract_factoryPattern;

public class ColorFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Color getColor(String color) {
		if(color.equals("RED")){
			return new Red();
		}else if(color.equals("GREEN")){
			return new Green();
		}
		return null;
	}

}
