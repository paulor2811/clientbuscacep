package io.github.paulor2811.clientbuscacep.ui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class UITextField {

public JTextField textfield;
	
	public UITextField(JFrame frame, GridBagConstraints gbc) {
		textfield = new JTextField();

		// Define o tamanho preferido do JTextField
	    textfield.setPreferredSize(new Dimension(200, 40));
		
        gbc.anchor = GridBagConstraints.CENTER; // Centraliza horizontalmente e verticalmente
        gbc.insets = new Insets(-24, 0, 0, 0); // Margem inferior de 40 pixels
        
        frame.add(textfield, gbc);
	}
	
}
