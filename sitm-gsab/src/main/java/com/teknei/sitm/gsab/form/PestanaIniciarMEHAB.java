package com.teknei.sitm.gsab.form;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class PestanaIniciarMEHAB extends JPanel {
	private JTextField txtSaldo;
	private JTextField txtNoTarjetas;

	/**
	 * Create the panel.
	 */
	public PestanaIniciarMEHAB() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 538, 436);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblTipoDeInicializacin = new JLabel("Tipo de inicializaci\u00F3n");
		lblTipoDeInicializacin.setBounds(10, 11, 146, 21);
		panel.add(lblTipoDeInicializacin);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(151, 11, 100, 21);
		panel.add(comboBox);
		
		JLabel lblConcesionario = new JLabel("Concesionario");
		lblConcesionario.setBounds(300, 14, 87, 14);
		panel.add(lblConcesionario);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(397, 11, 100, 21);
		panel.add(comboBox_1);
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setBounds(10, 54, 46, 14);
		panel.add(lblSaldo);
		
		txtSaldo = new JTextField();
		txtSaldo.setBounds(151, 47, 106, 21);
		panel.add(txtSaldo);
		txtSaldo.setColumns(10);
		
		JLabel lblNoDeTarjetas = new JLabel("No. de tarjetas");
		lblNoDeTarjetas.setBounds(300, 54, 87, 14);
		panel.add(lblNoDeTarjetas);
		
		txtNoTarjetas = new JTextField();
		txtNoTarjetas.setBounds(397, 51, 100, 21);
		panel.add(txtNoTarjetas);
		txtNoTarjetas.setColumns(10);
		
		JButton btnIniciarProceso = new JButton("Iniciar proceso");
		btnIniciarProceso.setBounds(382, 346, 115, 54);
		panel.add(btnIniciarProceso);
		
		JButton btnDetenerProceso = new JButton("Detener proceso");
		btnDetenerProceso.setBounds(41, 346, 115, 54);
		panel.add(btnDetenerProceso);
		
		JPanel panelStatus = new JPanel();
		panelStatus.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelStatus.setBounds(110, 115, 299, 192);
		panel.add(panelStatus);
		panelStatus.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("C:\\WORKSPACE_HOME\\ACABUS\\sitm-gsab\\src\\main\\resources\\img\\power2.png"));
		label.setBounds(10, 11, 279, 170);
		panelStatus.add(label);

	}
}
