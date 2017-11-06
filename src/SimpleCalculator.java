

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		for (int i = 0; i < 4; i++) {
			
		
		String num = JOptionPane.showInputDialog("Give me a number");
		int numm = Integer.parseInt(num);
		String numb = JOptionPane.showInputDialog("Give me another number");
		int numbb = Integer.parseInt(numb);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What do you want to do?", "Math", 0,JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);
		
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		if(operation == 0){
			add(numm,numbb);
		} else if(operation == 1){
			subtract(numm,numbb);
		} else if(operation == 2){
			multiply(numm,numbb);
		} else if(operation == 3){
			divide(numm,numbb);
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}
	}
	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	static void add(int num1, int num2){
	JOptionPane.showMessageDialog(null, num1 + " + " + num2 + "=" + (num1 + num2) );
	}
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void subtract(int num1, int num2){
		JOptionPane.showMessageDialog(null, num1 + " - " + num2 + "=" + (num1 - num2) );
		}
	static void multiply(int num1, int num2){
		JOptionPane.showMessageDialog(null, num1 + " * " + num2 + "=" + (num1 * num2) );
		}
	static void divide(int num1, int num2){
		JOptionPane.showMessageDialog(null, num1 + " / " + num2 + "=" + (num1 / num2) );
		}
	// 4. Create similar methods for subtraction, multiplication and division.
}