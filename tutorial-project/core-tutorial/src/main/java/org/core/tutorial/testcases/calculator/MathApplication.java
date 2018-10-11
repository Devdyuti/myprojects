package org.core.tutorial.testcases.calculator;

public class MathApplication implements CalculatorService{

	@Override
	public double add(double input1, double input2) {
		return input1+input2;
	}

	@Override
	public double substract(double input1, double input2) {
		return input1-input2;
	}

	@Override
	public double multiply(double input1, double input2) {
		return input1*input2;
	}

	@Override
	public double divide(double input1, double input2) {
		return input1/input2;
	}
	
/*	private CalculatorService calculatorService;

	public void setCalculatorService(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}


	public double add(double input1, double input2) {
		return calculatorService.add(input1, input2);
	}

	public double substract(double input1, double input2) {
		return calculatorService.substract(input1, input2);
	}

	public double multiply(double input1, double input2) {
		return calculatorService.multiply(input1, input2);
	}

	public double divide(double input1, double input2) {
		return calculatorService.divide(input1, input2);
	}	*/
}
