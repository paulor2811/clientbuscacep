package io.github.paulor2811.clientbuscacep.ui;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class UILabel {
	
	private JLabel label;
	
	public UILabel(JFrame frame, GridBagConstraints gbc) {
		label = new JLabel("Insira o CEP*");

        gbc.anchor = GridBagConstraints.CENTER; // Centraliza horizontalmente e verticalmente
        gbc.insets = new Insets(-84, -120, 0, 0); // Margem inferior de 40 pixels
        
        frame.add(label, gbc);
	}
}
