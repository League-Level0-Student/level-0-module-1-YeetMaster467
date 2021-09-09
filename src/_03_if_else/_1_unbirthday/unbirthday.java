package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {

String birthday = JOptionPane.showInputDialog("What is your bithday? Please format your date like this: mm/dd");

if(birthday.equals("09/08")) {
	JOptionPane.showMessageDialog(null, "Happy birthday!");
}else {
	JOptionPane.showMessageDialog(null, "Have a very merry unbirthday!");
}
	

}
}
