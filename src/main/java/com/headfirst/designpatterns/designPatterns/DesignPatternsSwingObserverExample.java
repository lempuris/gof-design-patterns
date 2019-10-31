package com.headfirst.designpatterns.designPatterns;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsSwingObserverExample {
	JFrame frame;

	public static void main(String[] args) {
		DesignPatternsSwingObserverExample example = new DesignPatternsSwingObserverExample();
		example.go();
	}

	public void go() {
		frame = new JFrame();
		JButton button = new JButton("Should I Do It?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	class AngelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Dont Do It, You might regret it");

		}

	}

	class DevilListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Do It!, Do it now!!t");

		}

	}

}
