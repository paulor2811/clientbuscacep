package io.github.paulor2811.clientbuscacep.ui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UIButton {
	
	public JButton button;
	
	public UIButton(JFrame frame, GridBagConstraints gbc) {
		button = new JButton("Buscar");
		
		button.setPreferredSize(new Dimension(200, 40));
		
        gbc.anchor = GridBagConstraints.CENTER; // Centraliza horizontalmente e verticalmente
        gbc.insets = new Insets(51, 0, 0, 0); // Margem inferior de 40 pixels
        
        frame.add(button, gbc);
	}
}
