package javaTestProject;

import javax.swing.*;

public class helloWorld {

	public static void main(String[] args) {
		

//		String hw = "Hello World,dont change this";

		String hw = "Hello World, again";
		String name = JOptionPane.showInputDialog("Please enter your name");
		JOptionPane.showMessageDialog(null, "Welcome" + name);
		System.out.println(hw);

	}

}
