package org.dev.design_pattern.abstract_factoryPattern;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		if(shape.equals("RECTANGLE")){
			return new Rectangle();
		}else if(shape.equals("CIRCLE")){
			return new Circle();
		}
		return null;
	}

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
