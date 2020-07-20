package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	// Already exists.
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public void horoscope(Zodiac z) {
		switch(z) {
			case AQUARIUS: {
				JOptionPane.showMessageDialog(null, "You will soon learn that you shouldn't look a gift horse in the mouth.");
				JOptionPane.showMessageDialog(null, "Specifically, you'll learn that you shouldn't have messed with the engine of the new car your parents bought you if you liked your fingers.");
				break;
			}
			case ARIES: {
				JOptionPane.showMessageDialog(null, "Now is a good time for you to pick up a new hobby.");
				JOptionPane.showMessageDialog(null, "Because the things you already do in your spare time aren't particularly legal.");
				break;
			}
			case CANCER: {
				JOptionPane.showMessageDialog(null, "Do you actually believe this stuff?");
				break;
			}
			case CAPRICORN: {
				JOptionPane.showMessageDialog(null, "You will cross paths with someone you were once very close to.");
				JOptionPane.showMessageDialog(null, "This experience will remind you about that restraining order.");
				break;
			}
			case GEMINI: {
				JOptionPane.showMessageDialog(null, "Your recent move has given you an opportunity to reinvent yourself.");
				JOptionPane.showMessageDialog(null, "Probably a good idea, because it was pretty stupid to think the feds couldn't find you if you moved down the street.");
				break;
			}
			case LEO: {
				JOptionPane.showMessageDialog(null, "Your world will be turned upside down with the realization that other people can be right sometimes.");
				JOptionPane.showMessageDialog(null, "Honestly, the fact that this turns your world upside down says some pretty nasty stuff about you.");
				break;
			}
			case LIBRA: {
				JOptionPane.showMessageDialog(null, "The stars are running out of jokes.");
				break;
			}
			case PISCES: {
				JOptionPane.showMessageDialog(null, "You will soon find yourself surrounded by friends.");
				JOptionPane.showMessageDialog(null, "The stars had a good laugh at that one.");
				break;
			}
			case SAGITTARIUS: {
				JOptionPane.showMessageDialog(null, "You will soon have the stunning revelation that everyone doesn't think you're as cool as you thought they did.");
				break;
			}
			case SCORPIO: {
				JOptionPane.showMessageDialog(null, "If you wish for good fortune, tie a pickle on a string and wear it around your neck.");
				JOptionPane.showMessageDialog(null, "If you wish for bad fortune, be on time for work.");
				break;
			}
			case TAURUS: {
				JOptionPane.showMessageDialog(null, "I don't get paid enough to write these things.");
				break;
			}
			case VIRGO: {
				JOptionPane.showMessageDialog(null, "You will remember a childhood event that answers several nagging questions about your personality.");
				JOptionPane.showMessageDialog(null, "The real question is, how did you forget you were dropped in the delivery room?");
				break;
			}
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		_00_Horoscope horoscope = new _00_Horoscope();
		horoscope.horoscope(Zodiac.AQUARIUS);
		JOptionPane.showMessageDialog(null, "STOP");
		horoscope.horoscope(Zodiac.ARIES);
		JOptionPane.showMessageDialog(null, "STOP");
		horoscope.horoscope(Zodiac.CANCER);
		JOptionPane.showMessageDialog(null, "STOP");
		horoscope.horoscope(Zodiac.CAPRICORN);
		JOptionPane.showMessageDialog(null, "STOP");
		horoscope.horoscope(Zodiac.GEMINI);
		JOptionPane.showMessageDialog(null, "STOP");
		horoscope.horoscope(Zodiac.LEO);
		JOptionPane.showMessageDialog(null, "STOP");
		horoscope.horoscope(Zodiac.LIBRA);
		JOptionPane.showMessageDialog(null, "STOP");
		horoscope.horoscope(Zodiac.PISCES);
		JOptionPane.showMessageDialog(null, "STOP");
		horoscope.horoscope(Zodiac.SAGITTARIUS);
		JOptionPane.showMessageDialog(null, "STOP");
		horoscope.horoscope(Zodiac.SCORPIO);
		JOptionPane.showMessageDialog(null, "STOP");
		horoscope.horoscope(Zodiac.TAURUS);
		JOptionPane.showMessageDialog(null, "STOP");
		horoscope.horoscope(Zodiac.VIRGO);
		JOptionPane.showMessageDialog(null, "STOP");
	}
}
