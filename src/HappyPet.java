//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	
	//    Initialize to zero.
	static int happiness= 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		String pet = JOptionPane.showInputDialog("What kind of pet would you like to buy?");
		System.out.println(pet);
		
		
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		for (int i=0;i<=10;i++){
		int task = JOptionPane.showOptionDialog(null, "What do you want to do with " + pet, pet, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Play", "Feed" }, null);
			System.out.println(task);
			// 5. Use user input to call the appropriate method created in step 4.
	if(task==0){
	cuddle();
	} else if (task==1){
	play();
	} else if (task==2){
	feed();
	}
	if(happiness==80){
	JOptionPane.showMessageDialog(null, "Your pet is happy!");
	break;
	}		
	// 6. If you determine the happiness level is large enough, tell the
	//    user that he loves his pet and use break; to exit for loop.

}
}
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
static void cuddle(){
	JOptionPane.showMessageDialog(null, "Your pet is smiling at you!");
	happiness=happiness+10;	
	JOptionPane.showMessageDialog(null, "Your pet's happiness is " +happiness);
	//    and INCREMENT the pet's happiness Level
}

static void play(){
	JOptionPane.showMessageDialog(null, "Your pet is happy!");
	happiness=happiness+10;
	JOptionPane.showMessageDialog(null, "Your pet's happiness is "+happiness);
}
static void feed(){
	JOptionPane.showMessageDialog(null, "Your pet is full!");
	happiness=happiness+20;
	JOptionPane.showMessageDialog(null, "Your pet's happiness is "+happiness);
}
}
