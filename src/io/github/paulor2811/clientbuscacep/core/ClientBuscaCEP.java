package io.github.paulor2811.clientbuscacep.core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import io.github.paulor2811.clientbuscacep.httpclient5.HttpClient;
import io.github.paulor2811.clientbuscacep.ui.UI;

public class ClientBuscaCEP {
	
	private UI ui;
	private Address address;
	private HttpClient httpclient;
	
	public ClientBuscaCEP() {
		ui = new UI();
	
        // Adiciona um ActionListener ao botão
        ui.button.button.addActionListener(new ActionListener() {
            @SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
                // Lógica a ser executada quando o botão for clicado
            	
            	try {
					address = httpclient.HTTPClient(address, ui.textfield.textfield.getText());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            	
            	JOptionPane.showMessageDialog(ui.frame, "CEP: " + address.getCep() + "\nLogradouro: " + address.getLogradouro() + "\nComplemento: " + address.getComplemento() + "\nBairro: " + address.getBairro() + "\nCidade: "
                		+ address.getLocalidade() + "\nEstado: " + address.getUf() + "\nIBGE: " + address.getIbge() + "\nGIA: " + address.getGia() + "\nDDD: " + address.getDdd() + "\nSIAFI: " + address.getSiafi());
            }
        });
	}
}
