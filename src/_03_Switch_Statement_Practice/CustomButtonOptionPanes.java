package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "Enjoy your Sunday.  Try to forget you have work again tomorrow.");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "Mondays: The armpit of the week.®");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "I can't think of any good Tuesday jokes.");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "Nope.  I'm not even gonna say it.");
			break;
		case "Thursday":
			JOptionPane.showMessageDialog(null, "The week's almost over!  Not really, but it feels like it.");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "It's Friday!  You still gotta go to work, though.");
			break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "It's Saturday.  Whoopee.");
		}
	}
}
