package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	// Already exists.
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public void horoscope(Zodiac z) {
		if (z == Zodiac.AQUARIUS) {
			JOptionPane.showMessageDialog(null, "You will soon learn that you shouldn't look a gift horse in the mouth.");
			JOptionPane.showMessageDialog(null, "Specifically, you'll learn that you shouldn't have messed with the engine of the new car your parent's bought you if you liked your fingers.");
		}else if (z == Zodiac.ARIES) {
			JOptionPane.showMessageDialog(null, "Now is a good time for you to pick up a new hobby.");
			JOptionPane.showMessageDialog(null, "Because the things you already do in your spare time aren't particularly legal.");
		}else if (z == Zodiac.CANCER) {
			JOptionPane.showMessageDialog(null, "The stars would like to inform you that your subscription is about to expire.  Do you wish to renew it?");
		}else if (z == Zodiac.CAPRICORN) {
			JOptionPane.showMessageDialog(null, "You will cross paths with someone you were once very close to.");
			JOptionPane.showMessageDialog(null, "This experience will remind you about that restraining order.");
		}else if (z == Zodiac.GEMINI) {
			JOptionPane.showMessageDialog(null, "Your recent move has given you an opportunity to reinvent yourself.");
			JOptionPane.showMessageDialog(null, "Probably a good idea, because it was pretty stupid to think the feds couldn't find you in Texas.");
		}else if (z == Zodiac.LEO) {
			JOptionPane.showMessageDialog(null, "Your world will be turned upside down with the realization that other people can be right sometimes.");
			JOptionPane.showMessageDialog(null, "Honestly, the fact that this turns your world upside down says some pretty nasty stuff about you.");
		}
	}
	// 3. Make a main method to test your method
	
}
