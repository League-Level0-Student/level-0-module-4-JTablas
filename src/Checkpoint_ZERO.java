import java.util.Random;

import javax.swing.JOptionPane;

public class Checkpoint_ZERO {


public static void main(String[] args) {
Random randomNumberGen = new Random(); 
int random = randomNumberGen.nextInt(100-10);

String color = JOptionPane.showInputDialog("What is your favorite color?");
JOptionPane.showMessageDialog(null, color + " is my favorite color too!");
JOptionPane.showMessageDialog(null, "Here, have this " + random);
System.out.println(random);
}
}
