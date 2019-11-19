package org.dev.design_pattern.abstract_factoryPattern;

public abstract class AbstractFactory {
	abstract Shape getShape(String shape);
	abstract Color getColor(String color);
}
