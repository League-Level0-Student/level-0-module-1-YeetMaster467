package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {
	
	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		
		int score = 0;
		
		String answer = JOptionPane.showInputDialog("What runs all the time but has no legs?");
		if(answer.equalsIgnoreCase("code")) {
			JOptionPane.showMessageDialog(null, "Yep!");
			score += 1;
		}else {
			JOptionPane.showMessageDialog(null, "Nope, it was code!");
		}
		answer = JOptionPane.showInputDialog("What has to be broken before you use it?");
		if(answer.equalsIgnoreCase("egg") || answer.equalsIgnoreCase("an egg")) {
			JOptionPane.showMessageDialog(null, "Yep!");
			score += 1;
		}else {
			JOptionPane.showMessageDialog(null, "Nope, it was an egg!");
		}
		answer = JOptionPane.showInputDialog("What has a bottom at its top?");
		if(answer.equalsIgnoreCase("legs")) {
			JOptionPane.showMessageDialog(null, "Yep!");
			score += 1;
		}else {
			JOptionPane.showMessageDialog(null, "Nope, it was legs!");
		}
		answer = JOptionPane.showInputDialog("What is made of water but if it goes in water it dies?");
		if(answer.equalsIgnoreCase("ice") || answer.equalsIgnoreCase("ice cubes") || answer.equalsIgnoreCase("an ice cube")) {
			JOptionPane.showMessageDialog(null, "Yep!");
			score += 1;
		}else {
			JOptionPane.showMessageDialog(null, "Nope, it was an ice cube!");
		}
		JOptionPane.showMessageDialog(null, "That's all the riddles for today!\nYou got a score of " + score + "!");
		
		
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

