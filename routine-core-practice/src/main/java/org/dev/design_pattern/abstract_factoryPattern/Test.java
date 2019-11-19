package org.dev.design_pattern.abstract_factoryPattern;

public class Test {
	public static void main(String[] args) {
		AbstractFactory shapeFactory=FactoryProducer.getFactory("COLOR");
		Color color=shapeFactory.getColor("RED");
		color.fill();
	}
}
