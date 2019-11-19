package org.dev.design_pattern.abstract_factoryPattern;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
		if(choice.equals("SHAPE")){
			return new ShapeFactory();
		}else if(choice.equals("COLOR")){
			return new ColorFactory();
		}
		return null;
	}
}
