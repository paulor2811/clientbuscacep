package io.github.paulor2811.clientbuscacep.ui;

import javax.swing.JFrame;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class UI {
	
	public UILabel label;
	public UITextField textfield;
	public UIButton button;
	
	public JFrame frame;
	
	public UI() {
		frame = new JFrame("BuscaCEP v1.0");
		
		frame.setSize(200, 120);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // configura o layout do frame com o GridBagLayout
        frame.setLayout(new GridBagLayout());

        // cria um objeto GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.NORTH;

        label = new UILabel(frame, gbc);
        textfield = new UITextField(frame, gbc);
        button = new UIButton(frame, gbc);
        
        frame.setVisible(true);
	}
}
