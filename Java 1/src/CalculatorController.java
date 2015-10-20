
public class CalculatorController {

	public static void main(String[] args) {
		float numOne, numTwo;
		Calculator myCalculator = new Calculator();
		
		numOne = Float.parseFloat(args[0]);
		numTwo = Float.parseFloat(args[1]);
		
		myCalculator.setNumOne(numOne);
		myCalculator.setNumTwo(numTwo);
		
		System.out.println("Addition: " + myCalculator.add());
		System.out.println("Subtraction: " + myCalculator.subtract());
		System.out.println("Multiplication: " + myCalculator.multiply());
		System.out.println("Division: " + myCalculator.divide());
		}
}

