package com.teknei.sitm.gsab.form;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class PestanaContadorForm extends JPanel {

	/**
	 * Create the panel.
	 */
	public PestanaContadorForm() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 539, 444);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblContadorGsab = new JLabel("Contador GSAB");
		lblContadorGsab.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContadorGsab.setBounds(10, 21, 476, 43);
		panel.add(lblContadorGsab);
		
		JButton btnIniciarConteo = new JButton("Iniciar conteo");
		btnIniciarConteo.setBounds(65, 256, 121, 50);
		panel.add(btnIniciarConteo);
		
		JButton btnDetenerConteo = new JButton("Detener conteo");
		btnDetenerConteo.setBounds(336, 256, 130, 50);
		panel.add(btnDetenerConteo);
		
		JButton btnObtenerArchivo = new JButton("Obtener archivo");
		btnObtenerArchivo.setBounds(161, 336, 195, 43);
		panel.add(btnObtenerArchivo);
		
		JPanel panelConteo = new JPanel();
		panelConteo.setBounds(116, 75, 251, 144);
		panel.add(panelConteo);
		panelConteo.setLayout(null);
		
		JLabel label = new JLabel("0");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 90));
		label.setBounds(10, 11, 231, 122);
		panelConteo.add(label);

	}
}
